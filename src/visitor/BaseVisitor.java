package visitor;

import ast.*;
import ast.decorators.*;
import ast.expression.*;
import ast.expression.basePrimary.*;
import ast.expression.postfix.*;
import ast.modifiers.*;
import ast.parameters.*;
import ast.statements.*;
import ast.statements.assignment.*;
import ast.statements.controlFlow.*;
import ast.statements.declaration.*;
import ast.statements.declaration.enums.EnumDefinitionNode;
import ast.statements.declaration.enums.EnumValueNode;
import ast.statements.declaration.enums.EnumValuesNode;
import ast.statements.definition.*;
import ast.statements.definition.component.ComponentConfigNode;
import ast.statements.definition.component.ComponentDefinitionNode;
import ast.statements.definition.component.ComponentPropertiesNode;
import ast.statements.definition.component.property.*;
import ast.statements.exports.*;
import ast.statements.flow.*;
import ast.statements.imports.*;
import ast.statements.inheritance.*;
import ast.types.*;

import errorHandling.ErrorReporter;
import errorHandling.sementicError.SementicErrorsChecker;
import gen.AngularParser;
import gen.AngularParserVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import symboltable.Symbol;
import symboltable.SymbolTableManager;

import java.util.*;


public class BaseVisitor extends AbstractParseTreeVisitor<ASTNode> implements AngularParserVisitor<ASTNode> {
    private final SymbolTableManager symbolManager;
    private final ErrorReporter errorReporter;
    private final SementicErrorsChecker sementicErrorsChecker = new SementicErrorsChecker();

    public BaseVisitor(SymbolTableManager symbolManager, ErrorReporter errorReporter) {
        this.symbolManager = symbolManager;
        this.errorReporter = errorReporter;
    }


    @Override
    public ASTNode visitProgram(AngularParser.ProgramContext ctx) {
        ProgramNode programNode = new ProgramNode(ctx.getStart().getLine());
        for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
            ASTNode node = visit(stmtCtx);
            if (node != null) {
                programNode.addStatement((StatementNode) node);
            }
        }

//        System.out.println(programNode.toString(0));
//        symbolManager.printAllScopes();
        System.out.println(programNode.generateCode());

        if (errorReporter.hasErrors()) {
            errorReporter.printAll();
            System.exit(1); // or handle gracefully
        } else {
        }

        return programNode;
    }



    @Override
    public ASTNode visitExportStat(AngularParser.ExportStatContext ctx) {
        return visit(ctx.exportStatement()); // This will route to visitDefaultExp or visitNamedExp
    }



    @Override
    public ASTNode visitImpState(AngularParser.ImpStateContext ctx) {
        return visit(ctx.importStatement());
    }

    @Override
    public ASTNode visitVarDecl(AngularParser.VarDeclContext ctx) {
        return visit(ctx.variableDeclaration());
    }


    @Override
    public ASTNode visitConstDecl(AngularParser.ConstDeclContext ctx) {
        return visit(ctx.constantDeclaration());
    }

    @Override
    public ASTNode visitFuncDecl(AngularParser.FuncDeclContext ctx) {
        return visit(ctx.functionDeclaration());
    }

    @Override
    public ASTNode visitClassDef(AngularParser.ClassDefContext ctx) {
        return visit(ctx.classDefinition());
    }

    @Override
    public ASTNode visitIfaceDef(AngularParser.IfaceDefContext ctx) {
        return visit(ctx.interfaceDefinition());
    }

    @Override
    public ASTNode visitCompDef(AngularParser.CompDefContext ctx) {
        return visit(ctx.componentDefinition());
    }

    @Override
    public ASTNode visitEnumDef(AngularParser.EnumDefContext ctx) {
        return visit(ctx.enumDefinition());
    }

    @Override
    public ASTNode visitTryCatchState(AngularParser.TryCatchStateContext ctx) {
        return visit(ctx.tryCatchStatement());
    }

    @Override
    public ASTNode visitConditionState(AngularParser.ConditionStateContext ctx) {
        return visit(ctx.conditionalStatement());
    }

    @Override
    public ASTNode visitWhileState(AngularParser.WhileStateContext ctx) {
        return visit(ctx.whileStatement());
    }

    @Override
    public ASTNode visitBreakState(AngularParser.BreakStateContext ctx) {
        return visit(ctx.breakStatement());
    }

    @Override
    public ASTNode visitContState(AngularParser.ContStateContext ctx) {
        return visit(ctx.continueStatement());
    }

    @Override
    public ASTNode visitReturnState(AngularParser.ReturnStateContext ctx) {
        return visit(ctx.returnStatement());
    }

    @Override
    public ASTNode visitAssignState(AngularParser.AssignStateContext ctx) {
        return visit(ctx.assignmentStatement());
    }

    @Override
    public ASTNode visitExprState(AngularParser.ExprStateContext ctx) {
        return visit(ctx.expressionStatement());
    }

    @Override
    public ASTNode visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {
        ExpressionNode expressionNode = (ExpressionNode) visit(ctx.expression());
        return new ExpressionStatementNode(expressionNode);
    }


    @Override
    public ASTNode visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        ExpressionNode expression = ctx.expression() != null
                ? (ExpressionNode) visit(ctx.expression())
                : null;
        return new ReturnStatementNode(expression, ctx.getStart().getLine());
    }


    @Override
    public ASTNode visitDefaultExp(AngularParser.DefaultExpContext ctx) {
        return visit(ctx.defaultExport());
    }

    @Override
    public ASTNode visitNamedExp(AngularParser.NamedExpContext ctx) {
        return visit(ctx.namedExport());
    }

    @Override
    public ASTNode visitNamedExport(AngularParser.NamedExportContext ctx) {
        int line = ctx.getStart().getLine();
        List<String> identifiers = new ArrayList<>();

        if (ctx.IDENTIFIER() != null) {
            for (TerminalNode id : ctx.IDENTIFIER()) {
                identifiers.add(id.getText());

                sementicErrorsChecker.checkForUndefinedIdentifiers(id.getText(),line,ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);
            }
        }

        return new NamedExportNode(identifiers, line);
    }


    @Override
    public ASTNode visitDefaultExport(AngularParser.DefaultExportContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();

        sementicErrorsChecker.checkForUndefinedIdentifiers(identifier,line,ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        return new DefaultExportNode(identifier, line);
    }

    @Override
    public ASTNode visitDefaultImp(AngularParser.DefaultImpContext ctx) {
        return visit(ctx.defaultImport());
    }

    @Override
    public ASTNode visitNamedImp(AngularParser.NamedImpContext ctx) {
        return visit(ctx.namedImport());
    }

    @Override
    public ASTNode visitImpSide(AngularParser.ImpSideContext ctx) {
        return visit(ctx.sideEffectImport());
    }

    @Override
    public ASTNode visitDefaultImport(AngularParser.DefaultImportContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String module = ctx.STRING().getText().replaceAll("^['\"]|['\"]$", ""); // remove quotes
        int line = ctx.getStart().getLine();

        Symbol symbol = new Symbol("defaultImport","imported",identifier,false,ctx.getStart().getLine());
        symbolManager.currentScope().define(identifier,symbol);

        return new DefaultImportNode(identifier, module, line);
    }


    @Override
    public ASTNode visitNamedImport(AngularParser.NamedImportContext ctx) {
        List<String> identifiers = new ArrayList<>();

        if (ctx.IDENTIFIER() != null) {
            for (TerminalNode id : ctx.IDENTIFIER()) {
                identifiers.add(id.getText());

                Symbol symbol = new Symbol("namedImport","imported",id.getText(),false,ctx.getStart().getLine());
                symbolManager.currentScope().define(id.getText(),symbol);
            }
        }

        String module = "";
        if (ctx.STRING() != null) {
            module = ctx.STRING().getText().replaceAll("^['\"]|['\"]$", ""); // remove quotes
        }

        int line = ctx.getStart().getLine();
        return new NamedImportNode(identifiers, module, line);
    }



    @Override
    public ASTNode visitSideEffectImport(AngularParser.SideEffectImportContext ctx) {
        String module = ctx.STRING().getText().replaceAll("^['\"]|['\"]$", "");
        int line = ctx.getStart().getLine();
        return new SideEffectImportNode(module, line);
    }


    @Override
    public ASTNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        String keyword = ctx.LET() != null ? ctx.LET().getText() : (ctx.VAR() != null ? ctx.VAR().getText() : "let"); // fallback default
        String identifier = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : "";
        int line = ctx.getStart().getLine();

        sementicErrorsChecker.checkForDuplicateDeclaration(identifier,line,ctx.getStart().getCharPositionInLine(),  symbolManager,errorReporter);
        TypeNode typeNode = ctx.type() != null ? (TypeNode) visit(ctx.type()) : null;

        ExpressionNode expressionNode = ctx.expression() != null ?
                (ExpressionNode) visit(ctx.expression()) : null;

        VariableDeclarationKind kind = keyword.equals("let") ?
                VariableDeclarationKind.LET : VariableDeclarationKind.VAR;

        VariableDeclarationNode varNode = new VariableDeclarationNode(
                typeNode, identifier, line, expressionNode, kind
        );

        if (ctx.type() != null) {
            Symbol symbol = new Symbol(varNode.getSymbolName(), ctx.type().getText(), identifier, true,line);
            symbolManager.currentScope().define(identifier, symbol);
        }


        return varNode;
    }



    @Override
    public ASTNode visitConstantDeclaration(AngularParser.ConstantDeclarationContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();

        TypeNode typeNode = (TypeNode) visit(ctx.type());
        ExpressionNode expressionNode = (ExpressionNode) visit(ctx.expression());

        ConstantDeclarationNode constNode = new ConstantDeclarationNode( identifier,typeNode, expressionNode,line);

        Symbol symbol = new Symbol(constNode.getSymbolName(), ctx.type().getText(),identifier,false,line);

        symbolManager.currentScope().define(identifier, symbol);

        return constNode;
    }


    @Override
    public ASTNode visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx) {
        List<AssignmentToNode> targets = new ArrayList<>();

        if (ctx.assignmentTo() != null && !ctx.assignmentTo().isEmpty()) {
            for (AngularParser.AssignmentToContext assignmentCtx : ctx.assignmentTo()) {
                ASTNode node = visit(assignmentCtx);
                if (node instanceof AssignmentToNode) {
                    targets.add((AssignmentToNode) node);
                }
            }
        }

        ExpressionNode expression = ctx.expression() != null ? (ExpressionNode) visit(ctx.expression()) : null;
        int line = ctx.getStart().getLine();

        return new AssignmentStatementNode(targets, expression, line);
    }


    @Override
    public ASTNode visitIdAssignment(AngularParser.IdAssignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        sementicErrorsChecker.checkForUndefinedIdentifiers(name,line,ctx.getStart().getCharPositionInLine(), symbolManager,errorReporter);
        sementicErrorsChecker.checkForConstReassignment(name,line,ctx.getStart().getCharPositionInLine(), symbolManager,errorReporter);
        return new IdAssignmentNode(name, line);
    }


    @Override
    public ASTNode visitArrAssignment(AngularParser.ArrAssignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        ExpressionNode index = (ExpressionNode) visit(ctx.expression());
        int line = ctx.getStart().getLine();
        sementicErrorsChecker.checkForUndefinedIdentifiers(name,line,ctx.getStart().getCharPositionInLine(), symbolManager,errorReporter);

        return new ArrAssignmentNode(name, index, line);
    }


    @Override
    public ASTNode visitDotAssignment(AngularParser.DotAssignmentContext ctx) {
        String property = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        sementicErrorsChecker.checkForUndefinedIdentifiers(property,line,ctx.getStart().getCharPositionInLine(), symbolManager,errorReporter);
        return new DotAssignmentNode(property, line);
    }


    @Override
    public ASTNode visitNormalFuncDecl(AngularParser.NormalFuncDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        symbolManager.enterScope(name + " function");

        ParameterListNode paramList = ctx.parameterList() != null
                ? (ParameterListNode) visit(ctx.parameterList())
                : new ParameterListNode(new ArrayList<>(), ctx.getStart().getLine());

        List<ExpressionParameterNode> parameters = paramList.getParameters();

        TypeNode returnType = ctx.type() != null
                ? (TypeNode) visit(ctx.type())
                : null;

        BlockNode body = ctx.block() != null
                ? (BlockNode) visit(ctx.block())
                : new BlockNode(new ArrayList<>(), ctx.getStart().getLine()); // fallback empty block

        NormalFunctionDeclarationNode funcNode = new NormalFunctionDeclarationNode(
                name, parameters, returnType, body, ctx.getStart().getLine()
        );
        symbolManager.exitScope();

        String returnTypeName = returnType != null ? ctx.type().getText() : "any";
        Symbol symbol = new Symbol(funcNode.getSymbolName(),returnTypeName, name, false,funcNode.getLine());

        sementicErrorsChecker.checkForDuplicateDeclaration(name,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        symbolManager.currentScope().define(name, symbol);

        return funcNode;
    }



    @Override
    public ASTNode visitArrowFuncDecl(AngularParser.ArrowFuncDeclContext ctx) {
        FunctionDeclarationKind kind = null;
        boolean isMutable = false;

        if (ctx.LET() != null) {
            kind = FunctionDeclarationKind.LET;
            isMutable = true;
        } else if (ctx.VAR() != null) {
            kind = FunctionDeclarationKind.VAR;
            isMutable = true;
        } else if (ctx.CONST() != null) {
            kind = FunctionDeclarationKind.CONST;
        }

        String identifier = ctx.IDENTIFIER().getText();

        ArrowFunctionNode arrowFunction = ctx.arrowFunction() != null
                ? (ArrowFunctionNode) visit(ctx.arrowFunction())
                : new ArrowFunctionNode(null, null,null, ctx.getStart().getLine()); // fallback empty

        int line = ctx.getStart().getLine();

        ArrowFunctionDeclarationNode node = new ArrowFunctionDeclarationNode(kind, identifier, arrowFunction, line);
        Symbol symbol = new Symbol(node.getSymbolName(),arrowFunction.getReturnTypeString(), identifier, isMutable,line);

        sementicErrorsChecker.checkForDuplicateDeclaration(identifier,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        symbolManager.currentScope().define(identifier, symbol);

        return node;
    }


    @Override
    public ASTNode visitParameterList(AngularParser.ParameterListContext ctx) {
        List<ExpressionParameterNode> params = new ArrayList<>();
        if (ctx.expressionParameter() != null) {
            for (AngularParser.ExpressionParameterContext paramCtx : ctx.expressionParameter()) {
                ExpressionParameterNode param = (ExpressionParameterNode) visit(paramCtx);
                if (param != null) {
                    params.add(param);
                }
            }
        }
        return new ParameterListNode(params, ctx.getStart().getLine());
    }


    @Override
    public ASTNode visitExpressionParameter(AngularParser.ExpressionParameterContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        TypeNode type = (TypeNode) visit(ctx.type());
        int line = ctx.getStart().getLine();
        ExpressionParameterNode expressionParameterNode = new ExpressionParameterNode(name, type, line);

        Symbol symbol = new Symbol(expressionParameterNode.getSymbolName(),ctx.type().getText(),name,false,line);

        sementicErrorsChecker.checkForDuplicateDeclaration(name,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        symbolManager.currentScope().define(name,symbol);

        return  expressionParameterNode;
    }

    @Override
    public ASTNode visitParameter(AngularParser.ParameterContext ctx) {
        AccessModifierNode accessModifier = ctx.accessModifier() != null
                ? (AccessModifierNode) visitAccessModifier(ctx.accessModifier())
                : null;

        String name = ctx.IDENTIFIER().getText();

        TypeNode type = ctx.type() != null
                ? (TypeNode) visit(ctx.type())
                : null;

        int line = ctx.getStart().getLine();
        ParameterNode parameterNode = new ParameterNode(accessModifier, name, type, line);

        String typeName = ctx.type() != null ? ctx.type().getText() : "any";
        Symbol symbol = new Symbol(parameterNode.getSymbolName(), typeName, name, false,line);

        sementicErrorsChecker.checkForDuplicateDeclaration(name,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        symbolManager.currentScope().define(name, symbol);

        return parameterNode;
    }



    @Override
    public ASTNode visitAccessModifier(AngularParser.AccessModifierContext ctx) {
        String text = ctx.getText().toUpperCase(); // Convert to enum format
        AccessModifierNode.Modifier modifier;

        try {
            modifier = AccessModifierNode.Modifier.valueOf(text);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Unknown access modifier: " + text + " at line " + ctx.getStart().getLine());
        }
        return new AccessModifierNode(modifier, ctx.getStart().getLine());
    }



    @Override
    public ASTNode visitBlock(AngularParser.BlockContext ctx) {
        int line = ctx.getStart().getLine();

        List<StatementNode> statements = new ArrayList<>();
        List<AngularParser.StatementContext> statementContexts = ctx.statement();

        if (statementContexts != null) {
            for (AngularParser.StatementContext stmtCtx : statementContexts) {
                ASTNode node = visit(stmtCtx);
                if (node instanceof StatementNode) {
                    statements.add((StatementNode) node);
                } else if (node != null) {
                    throw new RuntimeException(
                            "Expected StatementNode but got " + node.getClass().getSimpleName() +
                                    " at line " + stmtCtx.getStart().getLine()
                    );
                }
            }
        }

        return new BlockNode(statements, line);
    }


    @Override
    public ASTNode visitClassDefinition(AngularParser.ClassDefinitionContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        symbolManager.enterScope("class " + className);

        // Handle 'extendsStatement'
        ExtendsStatementNode extendsNode = null;
        if (ctx.extendsStatement() != null && ctx.extendsStatement().IDENTIFIER() != null) {
            extendsNode = (ExtendsStatementNode) visitExtendsStatement(ctx.extendsStatement());
        }

        ImplementsStatementNode implementsNode = null;
        if (ctx.implementsStatement() != null && ctx.implementsStatement().IDENTIFIER(0) !=  null) {
            implementsNode = (ImplementsStatementNode) visitImplementsStatement(ctx.implementsStatement());
        }

        // Visit the class body
        ClassBodyNode classBody = null;
        if (ctx.classBody() != null) {
            classBody = (ClassBodyNode) visit(ctx.classBody());
        } else {
            throw new NullPointerException("Class body is required but was null at line " + line);
        }

        symbolManager.exitScope();
        ClassDefinitionNode node = new ClassDefinitionNode(className, extendsNode, implementsNode, classBody, line);

        Symbol symbol = new Symbol(node.getSymbolName(),"class", className, false,line);

        sementicErrorsChecker.checkForDuplicateDeclaration(className,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        symbolManager.currentScope().define( className, symbol);

        return node;
    }


    @Override
    public ASTNode visitExtendsStatement(AngularParser.ExtendsStatementContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        int cloumn = ctx.getStart().getCharPositionInLine();

        ExtendsStatementNode extendsStatementNode =  new ExtendsStatementNode(identifier, line);

        Symbol symbol = new Symbol(extendsStatementNode.getSymbolName(),"extends",identifier,false,line);
        sementicErrorsChecker.checkForExtentable(identifier,line,cloumn,symbolManager,errorReporter);

        symbolManager.currentScope().define(identifier,symbol);
        //ANEH
        return extendsStatementNode;
    }


    @Override
    public ASTNode visitImplementsStatement(AngularParser.ImplementsStatementContext ctx) {
        List<String> interfaces = new ArrayList<>();
        int line = ctx.getStart().getLine();

        if (ctx.IDENTIFIER() != null && !ctx.IDENTIFIER().isEmpty()) {
            for (TerminalNode id : ctx.IDENTIFIER()) {
                interfaces.add(id.getText());
                Symbol symbol = new Symbol("ImplementsStatement","implements",id.getText(),false,line);
                sementicErrorsChecker.checkForImplementable(id.getText(),line,ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

                symbolManager.currentScope().define(id.getText(),symbol);
            }
        } else {
            throw new NullPointerException("No interface identifiers found in implements statement at line " + ctx.getStart().getLine());
        }

        //ANEH
        return new ImplementsStatementNode(interfaces, line);
    }



    @Override
    public ASTNode visitClassBody(AngularParser.ClassBodyContext ctx) {
        List<DecoratorNode> decorators = new ArrayList<>();
        List<ASTNode> classMembers = new ArrayList<>();
        int line = ctx.getStart().getLine();

        // Loop over all children
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof AngularParser.DecoratorContext) {
                    ASTNode deco = visit(child);
                    if (deco instanceof DecoratorNode) {
                        decorators.add((DecoratorNode) deco);
                    }
                } else {
                    ASTNode node = visit(child);
                    if (node != null) {
                        classMembers.add(node);
                    }
                }
            }
        }

        return new ClassBodyNode(decorators, classMembers, line);
    }

    @Override
    public ASTNode visitClassVariableDeclaration(AngularParser.ClassVariableDeclarationContext ctx) {
        AccessModifierNode accessModifier = ctx.accessModifier() != null
                ? (AccessModifierNode) visit(ctx.accessModifier())
                : null;

        String identifier = ctx.IDENTIFIER().getText();
        TypeNode type = (TypeNode) visit(ctx.type());

        ExpressionNode expression = ctx.expression() != null
                ? (ExpressionNode) visit(ctx.expression())
                : null;

        int line = ctx.getStart().getLine();
        ClassVariableDeclarationNode node = new ClassVariableDeclarationNode(accessModifier,identifier, type, expression, line);

        Symbol symbol = new Symbol(node.getSymbolName(), type.getStringType(), identifier, true,line);

        sementicErrorsChecker.checkForDuplicateDeclaration(identifier,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        symbolManager.currentScope().define(identifier, symbol);

        return node;
    }

    @Override
    public ASTNode visitConstructorDefinition(AngularParser.ConstructorDefinitionContext ctx) {
        int line = ctx.getStart().getLine();
        symbolManager.enterScope("constructor " + line);

        ParameterListNode parameterListNode = (ParameterListNode) visit(ctx.parameterList());
        BlockNode blockNode = (BlockNode) visit(ctx.block());

        symbolManager.exitScope();

        return new ConstructorDefinitionNode(parameterListNode, blockNode, line);
    }


    @Override
    public ASTNode visitMethodDefinition(AngularParser.MethodDefinitionContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        symbolManager.enterScope("method " + methodName);

        ParameterListNode parameterListNode = (ParameterListNode) visit(ctx.parameterList());
        TypeNode typeNode = ctx.type() != null ? (TypeNode) visit(ctx.type()) : null;
        BlockNode blockNode = (BlockNode) visit(ctx.block());

        symbolManager.exitScope();

        MethodDefinitionNode methodDefinitionNode = new MethodDefinitionNode(methodName, parameterListNode, typeNode, blockNode, line);

        String typeName = typeNode != null ? typeNode.getStringType() : "any";
        Symbol symbol = new Symbol(methodDefinitionNode.getSymbolName(),typeName, methodName, false,line);

        sementicErrorsChecker.checkForDuplicateDeclaration(methodName,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        symbolManager.currentScope().define( methodName, symbol);

        return methodDefinitionNode;
    }

    @Override
    public ASTNode visitInterfaceDefinition(AngularParser.InterfaceDefinitionContext ctx) {
        int line = ctx.getStart().getLine();
        String name = ctx.IDENTIFIER().getText();

        symbolManager.enterScope("interface " + name);
        InterfaceBodyNode interfaceBodyNode = (InterfaceBodyNode) visit(ctx.interfaceBody());
        symbolManager.exitScope();

        InterfaceDefinitionNode interfaceDefinitionNode = new InterfaceDefinitionNode(name, interfaceBodyNode, line);

        Symbol symbol = new Symbol(interfaceDefinitionNode.getSymbolName(),"interface",name,false,line);

        sementicErrorsChecker.checkForDuplicateDeclaration(name,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        symbolManager.currentScope().define(name, symbol);

        return interfaceDefinitionNode;
    }


    @Override
    public ASTNode visitInterfaceBody(AngularParser.InterfaceBodyContext ctx) {
        List<InterfaceMemberNode> members = new ArrayList<>();
        for (AngularParser.InterfaceMemberContext memberCtx : ctx.interfaceMember()) {
            InterfaceMemberNode memberNode = (InterfaceMemberNode) visit(memberCtx);
            members.add(memberNode);
        }

        int line = ctx.getStart().getLine();
        return new InterfaceBodyNode(members, line);
    }


    @Override
    public ASTNode visitInterfaceMember(AngularParser.InterfaceMemberContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        TypeNode type = (TypeNode) visit(ctx.type());
        int line = ctx.getStart().getLine();

        InterfaceMemberNode memberNode = new InterfaceMemberNode(name, type, line);

        Symbol symbol = new Symbol(memberNode.getSymbolName(), type.getStringType(), name, false,line);

        sementicErrorsChecker.checkForDuplicateDeclaration(name,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        symbolManager.currentScope().define(name, symbol);

        return memberNode;
    }


    @Override
    public ASTNode visitComponentDefinition(AngularParser.ComponentDefinitionContext ctx) {
        int line = ctx.getStart().getLine();
        String name = ctx.IDENTIFIER().getText();
        boolean isExported = ctx.EXPORT() != null;

        symbolManager.enterScope("component " + name);

        ComponentConfigNode componentConfigNode = null;
        if (ctx.componentConfig() != null) componentConfigNode = (ComponentConfigNode) visitComponentConfig(ctx.componentConfig());

        ExtendsStatementNode extendsStatementNode = null;
        if (ctx.extendsStatement() != null) {
            extendsStatementNode = (ExtendsStatementNode) visitExtendsStatement(ctx.extendsStatement());
        }

        ImplementsStatementNode implementsNode = null;
        if (ctx.implementsStatement() != null && ctx.implementsStatement().IDENTIFIER(0) !=  null) {
            implementsNode = (ImplementsStatementNode) visitImplementsStatement(ctx.implementsStatement());
        }

        ClassBodyNode classBodyNode = (ClassBodyNode) visitClassBody(ctx.classBody());
        // error handling
        sementicErrorsChecker.checkForComponentTemplate(name,componentConfigNode,ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);


        ComponentDefinitionNode componentDefinition = new ComponentDefinitionNode(
                componentConfigNode, name, extendsStatementNode, implementsNode, classBodyNode, line, isExported
        );
        sementicErrorsChecker.checkNgOnInitLifeCycle(componentDefinition,symbolManager,errorReporter);
        symbolManager.exitScope();

        Symbol symbol = new Symbol(componentDefinition.getSymbolName(),"component definition", name, false,line);
        // errors 🌋
        sementicErrorsChecker.checkForDuplicateDeclaration(name,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);
        sementicErrorsChecker.checkForOneComponentPerFile(line,ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);
        sementicErrorsChecker.checkForComponentSelectorPropValidation(componentConfigNode,ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        symbolManager.currentScope().define(name, symbol);

        return componentDefinition;
    }

    @Override
    public ASTNode visitComponentConfig(AngularParser.ComponentConfigContext ctx) {
        int line = ctx.getStart().getLine();
        ComponentPropertiesNode componentPropertiesNode = (ComponentPropertiesNode) visitComponentProperties(ctx.componentProperties());
        return new ComponentConfigNode(componentPropertiesNode, line);
    }

    @Override
    public ASTNode visitComponentProperties(AngularParser.ComponentPropertiesContext ctx) {
        int line = ctx.getStart().getLine();
        List<ComponentPropertyNode> propertyNodes = new ArrayList<>();

        for (AngularParser.ComponentPropertyContext propCtx : ctx.componentProperty()) {
            ComponentPropertyNode node = (ComponentPropertyNode) visit(propCtx);
            propertyNodes.add(node);
        }

        return new ComponentPropertiesNode(propertyNodes, line);
    }

    @Override
    public ASTNode visitSelectorProp(AngularParser.SelectorPropContext ctx) {
        String raw = ctx.STRING().getText(); // gives the string with quotes, e.g., "\"app-home-page\""
        String value = raw.substring(1, raw.length() - 1); // strips the surrounding quotes
        int line = ctx.getStart().getLine();

        SelectorPropertyNode node = new SelectorPropertyNode(value, line);

        Symbol symbol = new Symbol(node.getSymbolName(),"selector", value, false,line);
        symbolManager.currentScope().define(value, symbol);

        return node;
    }

    @Override
    public ASTNode visitTemplateUrlProp(AngularParser.TemplateUrlPropContext ctx) {
        String value = ctx.STRING().getText();
        int line = ctx.getStart().getLine();
        TemplateUrlPropertyNode node = new TemplateUrlPropertyNode(value, line);

        Symbol symbol = new Symbol(node.getSymbolName(),"templateUrl", value, false,line);
        symbolManager.currentScope().define( value, symbol);

        return node;
    }

    @Override
    public ASTNode visitStylesUrlProp(AngularParser.StylesUrlPropContext ctx) {
        List<String> urls = new ArrayList<>();
        for (TerminalNode str : ctx.STRING()) {
            urls.add(str.getText());
        }
        int line = ctx.getStart().getLine();
        StyleUrlsPropertyNode node = new StyleUrlsPropertyNode(urls, line);

        Symbol symbol = new Symbol(node.getSymbolName(),"styleUrls", urls.toString(), false,line);
        symbolManager.currentScope().define(urls.toString(), symbol);

        return node;
    }

    @Override
    public ASTNode visitTemolateProp(AngularParser.TemolatePropContext ctx) {
        String value;
        if (ctx.STRING() != null) {
            value = ctx.STRING().getText();
        } else if (ctx.BACKTICK_STRING() != null) {
            value = ctx.BACKTICK_STRING().getText();
        } else {
            throw new IllegalStateException("Template property must have a STRING or BACKTICK_STRING");
        }

        int line = ctx.getStart().getLine();
        TemplatePropertyNode node = new TemplatePropertyNode(value, line);

        Symbol symbol = new Symbol(node.getSymbolName(),"template", value, false,line);
        symbolManager.currentScope().define(value, symbol);

        return node;
    }

    @Override
    public ASTNode visitStyelsProp(AngularParser.StyelsPropContext ctx) {
        List<String> styles = new ArrayList<>();
        for (TerminalNode str : ctx.STRING()) {
            styles.add(str.getText());
        }
        int line = ctx.getStart().getLine();
        StylesPropertyNode node = new StylesPropertyNode(styles, line);

        Symbol symbol = new Symbol(node.getSymbolName(),"styles", styles.toString(), false,line);
        symbolManager.currentScope().define(styles.toString(), symbol);

        return node;
    }


    @Override
    public ASTNode visitEnumDefinition(AngularParser.EnumDefinitionContext ctx) {
        int line = ctx.getStart().getLine();
        String name = ctx.IDENTIFIER().getText();

        EnumValuesNode enumValuesNode = null;
        symbolManager.enterScope("enum " + name);
        if (ctx.enumValues() != null) {
            enumValuesNode = (EnumValuesNode) visitEnumValues(ctx.enumValues());
        }
        symbolManager.exitScope();

        EnumDefinitionNode enumDefinitionNode = new EnumDefinitionNode(name, enumValuesNode, line);

        Symbol symbol = new Symbol(enumDefinitionNode.getSymbolName(),"enum definition", name, false,line);

        sementicErrorsChecker.checkForDuplicateDeclaration(name,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        symbolManager.currentScope().define(name, symbol);

        return enumDefinitionNode;
    }

    @Override
    public ASTNode visitEnumValues(AngularParser.EnumValuesContext ctx) {
        int line = ctx.getStart().getLine();
        List<EnumValueNode> enumValueNodeList = new ArrayList<>();
        for (AngularParser.EnumValueContext enumCtx : ctx.enumValue()) {
            EnumValueNode enumValueNode = (EnumValueNode) visitEnumValue(enumCtx);
            enumValueNodeList.add(enumValueNode);
        }

        return new EnumValuesNode(enumValueNodeList, line);
    }

    @Override
    public ASTNode visitEnumValue(AngularParser.EnumValueContext ctx) {
        int line = ctx.getStart().getLine();
        String name = ctx.IDENTIFIER().getText();

        LiteralNode literalNode = null;
        if (ctx.literal() != null) {
            literalNode = (LiteralNode) visitLiteral(ctx.literal());
        }

        EnumValueNode enumValueNode = new EnumValueNode(name, literalNode, line);

        Symbol symbol = new Symbol(enumValueNode.getSymbolName(),"enum value", name, false,line);

        sementicErrorsChecker.checkForDuplicateDeclaration(name,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        symbolManager.currentScope().define(name, symbol);

        return enumValueNode;
    }


    @Override
    public ASTNode visitTryCatchStatement(AngularParser.TryCatchStatementContext ctx) {
        int line = ctx.getStart().getLine();

        symbolManager.enterScope("try block " + line);
        BlockNode tryBlock = (BlockNode) visit(ctx.block(0));
        symbolManager.exitScope();

        String exceptionIdentifier = ctx.IDENTIFIER().getText();
        TypeNode exceptionType = (TypeNode) visit(ctx.type());

        // Enter catch scope BEFORE visiting the catch block
        symbolManager.enterScope("catch " + line);
        Symbol exceptionSymbol = new Symbol("exceptionParameter",exceptionType.getStringType(), exceptionIdentifier, true,line);
        symbolManager.define(exceptionIdentifier, exceptionSymbol); // FIX: define properly here

        BlockNode catchBlock = (BlockNode) visit(ctx.block(1));
        symbolManager.exitScope();


        BlockNode finallyBlock = null;
        if (ctx.FINALLY() != null) {
            symbolManager.enterScope("finally block " + line);
            finallyBlock = (BlockNode) visit(ctx.block(2));
            symbolManager.exitScope();
        }

        return new TryCatchStatementNode(
                tryBlock,
                exceptionIdentifier,
                catchBlock,
                finallyBlock,
                exceptionType,
                line
        );
    }

    @Override
    public ASTNode visitConditionalStatement(AngularParser.ConditionalStatementContext ctx) {
        int line = ctx.getStart().getLine();
        IfStatementNode ifBranch = (IfStatementNode) visitIfStatement(ctx.ifStatement(0));

        List<IfStatementNode> elifBranches = new ArrayList<>();
        for (int i = 1; i < ctx.ifStatement().size(); i++) {
            IfStatementNode elif = (IfStatementNode) visitIfStatement(ctx.ifStatement(i));
            elifBranches.add(elif);
        }

        ElseStatementNode elseBranch = null;
        if (ctx.elseStatement() != null) {
            elseBranch = (ElseStatementNode) visitElseStatement(ctx.elseStatement());
        }

        return new ConditionalStatementNode(ifBranch, elifBranches, elseBranch, line);
    }

    @Override
    public ASTNode visitIfStatement(AngularParser.IfStatementContext ctx) {
        int line = ctx.getStart().getLine();
        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());

        symbolManager.enterScope("if body " + line);
        ASTNode body = visit(ctx.block() != null ? ctx.block() : ctx.statement());
        symbolManager.exitScope();

        return new IfStatementNode(condition, body, line);
    }

    @Override
    public ASTNode visitElseStatement(AngularParser.ElseStatementContext ctx) {
        ASTNode elseBody = null;
        int line = ctx.getStart().getLine();

        symbolManager.enterScope("if body " + line);
        if (ctx.block() != null) {
            elseBody = visit(ctx.block());
        } else if (ctx.statement() != null) {
            elseBody = visit(ctx.statement());
        }
        symbolManager.exitScope();


        return new ElseStatementNode(elseBody, line);
    }

    @Override
    public ASTNode visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        int line = ctx.getStart().getLine();

        symbolManager.enterScope("while " + line);
        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        ASTNode body = ctx.block() != null ? visit(ctx.block()) : visit(ctx.statement());
        symbolManager.exitScope();

        return new WhileStatementNode(condition, body, line);
    }

    @Override
    public ASTNode visitBreakStatement(AngularParser.BreakStatementContext ctx) {
        return new BreakStatementNode(ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitContinueStatement(AngularParser.ContinueStatementContext ctx) {
        return new ContinueStatementNode(ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitNorTpe(AngularParser.NorTpeContext ctx) {
        return visitNormalType(ctx.normalType());
    }

    @Override
    public ASTNode visitArrTpe(AngularParser.ArrTpeContext ctx) {
        return visitArrayType(ctx.arrayType());
    }

    @Override
    public ASTNode visitNormalType(AngularParser.NormalTypeContext ctx) {
        String text = ctx.getText();
        int line = ctx.getStart().getLine();

        NormalTypeNode.NormalKind kind;
        String identifier = null;

        switch (text) {
            case "number":
                kind = NormalTypeNode.NormalKind.NUMBER;
                break;
            case "string":
                kind = NormalTypeNode.NormalKind.STRING;
                break;
            case "boolean":
                kind = NormalTypeNode.NormalKind.BOOLEAN;
                break;
            case "any":
                kind = NormalTypeNode.NormalKind.ANY;
                break;
            case "unknown":
                kind = NormalTypeNode.NormalKind.UNKNOWN;
                break;
            case "void":
                kind = NormalTypeNode.NormalKind.VOID;
                break;
            case "array":
                kind = NormalTypeNode.NormalKind.ARRAY;
                break;
            case "object":
                kind = NormalTypeNode.NormalKind.OBJECT;
                break;
            default:
                // Assume it's a user-defined identifier
                kind = NormalTypeNode.NormalKind.IDENTIFIER;
                identifier = text;
                break;
        }

        //ANEH
        return new NormalTypeNode(kind, identifier, line);
    }



    @Override
    public ASTNode visitArrayType(AngularParser.ArrayTypeContext ctx) {
        TypeNode elementType = (TypeNode) visit(ctx.normalType());
        int line = ctx.getStart().getLine();
        //ANEH
        return new ArrayTypeNode(elementType, line);
    }


    @Override
    public ASTNode visitExpression(AngularParser.ExpressionContext ctx) {
        return visit(ctx.nullishCoalescingExpression());
    }


    @Override
    public ASTNode visitNullishCoalescingExpression(AngularParser.NullishCoalescingExpressionContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.logicalOrExpression(0));
        ExpressionNode right = ctx.logicalOrExpression().size() > 1
                ? (ExpressionNode) visit(ctx.logicalOrExpression(1))
                : null;

        return new NullishCoalescingExpressionNode(left, right);
    }


    @Override
    public ASTNode visitLogicalOrExpression(AngularParser.LogicalOrExpressionContext ctx) {
        List<ExpressionNode> operands = new ArrayList<>();

        for (AngularParser.LogicalAndExpressionContext andCtx : ctx.logicalAndExpression()) {
            operands.add((ExpressionNode) visit(andCtx));
        }

        return new LogicalOrExpressionNode(operands);
    }


    @Override
    public ASTNode visitLogicalAndExpression(AngularParser.LogicalAndExpressionContext ctx) {
        List<ExpressionNode> operands = new ArrayList<>();

        // Add all equality expressions
        for (AngularParser.EqualityExpressionContext eqCtx : ctx.equalityExpression()) {
            operands.add((ExpressionNode) visit(eqCtx));
        }

        return new LogicalAndExpressionNode(operands);
    }


    @Override
    public ASTNode visitEqualityExpression(AngularParser.EqualityExpressionContext ctx) {
        List<ExpressionNode> operands = new ArrayList<>();
        List<String> operators = new ArrayList<>();

        // First operand
        operands.add((ExpressionNode) visit(ctx.relationalExpression(0)));

        // Remaining operands and operators
        for (int i = 1; i < ctx.relationalExpression().size(); i++) {
            operands.add((ExpressionNode) visit(ctx.relationalExpression(i)));
            operators.add(ctx.getChild(2 * i - 1).getText()); // operators are between operands
        }

        return new EqualityExpressionNode(operands, operators);
    }


    @Override
    public ASTNode visitRelationalExpression(AngularParser.RelationalExpressionContext ctx) {
        List<ExpressionNode> operands = new ArrayList<>();
        List<String> operators = new ArrayList<>();

        // First operand
        operands.add((ExpressionNode) visit(ctx.additiveExpression(0)));

        // Remaining operands and operators
        for (int i = 1; i < ctx.additiveExpression().size(); i++) {
            operands.add((ExpressionNode) visit(ctx.additiveExpression(i)));
            operators.add(ctx.getChild(2 * i - 1).getText()); // operator is between operands
        }

        return new RelationalExpressionNode(operands, operators);
    }


    @Override
    public ASTNode visitAdditiveExpression(AngularParser.AdditiveExpressionContext ctx) {
        List<ExpressionNode> operands = new ArrayList<>();
        List<String> operators = new ArrayList<>();

        // First operand
        operands.add((ExpressionNode) visit(ctx.multiplicativeExpression(0)));

        // Remaining operands with operators
        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            operands.add((ExpressionNode) visit(ctx.multiplicativeExpression(i)));
            operators.add(ctx.getChild(2 * i - 1).getText()); // operator is between operands
        }

        return new AdditiveExpressionNode(operands, operators);
    }


    @Override
    public ASTNode visitMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx) {
        List<ExpressionNode> operands = new ArrayList<>();
        List<String> operators = new ArrayList<>();

        // First operand
        operands.add((ExpressionNode) visit(ctx.unaryExpression(0)));

        // Remaining operands with corresponding operators
        for (int i = 1; i < ctx.unaryExpression().size(); i++) {
            operands.add((ExpressionNode) visit(ctx.unaryExpression(i)));
            operators.add(ctx.getChild(2 * i - 1).getText()); // operator between operands
        }

        return new MultiplicativeExpressionNode(operands, operators);
    }

    @Override
    public ASTNode visitUnaryExpression(AngularParser.UnaryExpressionContext ctx) {
        ExpressionNode operand = (ExpressionNode) visit(ctx.primaryExpression());
        String operator = ctx.NOT() != null ? "!"
                : ctx.MINUS() != null ? "-"
                : ctx.PLUS() != null ? "+"
                : ctx.INCREMENT() != null ? "++"
                : ctx.DECREMENT() != null ? "--"
                : null;
        return new UnaryExpressionNode(operator, operand);
    }


    @Override
    public ASTNode visitThisExpr(AngularParser.ThisExprContext ctx) {
        return new ThisNode(ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitLit(AngularParser.LitContext ctx) {
        return visitLiteral(ctx.literal());
    }

    @Override
    public ASTNode visitId(AngularParser.IdContext ctx) {
        sementicErrorsChecker.checkForUndefinedIdentifiers(ctx.IDENTIFIER().getText(),ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        return new IdentifierNode(ctx.IDENTIFIER().getText(),ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitExpr(AngularParser.ExprContext ctx) {
        int line = ctx.getStart().getLine();
        symbolManager.enterScope("basePrimary expression " + line);
        ExpressionNode expressionNode = (ExpressionNode) visitExpression(ctx.expression());
        symbolManager.exitScope();

        return expressionNode;
    }

    @Override
    public ASTNode visitArr(AngularParser.ArrContext ctx) {
        return visitArray(ctx.array());
    }

    @Override
    public ASTNode visitObj(AngularParser.ObjContext ctx) {
        return visitObject(ctx.object());
    }

    @Override
    public ASTNode visitArrowFunc(AngularParser.ArrowFuncContext ctx) {
        return visitArrowFunction(ctx.arrowFunction());
    }

    @Override
    public ASTNode visitTemplateInterp(AngularParser.TemplateInterpContext ctx) {
        return visitTemplateInterpolation(ctx.templateInterpolation());
    }

    public ASTNode visitPrimaryExpression(AngularParser.PrimaryExpressionContext ctx) {
        ASTNode base = visit(ctx.basePrimary());
        BasePrimaryNode basePrimaryNode;

        if (base instanceof BasePrimaryNode) {
            basePrimaryNode = (BasePrimaryNode) base;
        } else if (base instanceof ExpressionNode) {
            // Parenthesized expression: wrap it into a BasePrimaryNode subtype
            basePrimaryNode = new ParenthesizedExpressionNode((ExpressionNode) base, ctx.getStart().getLine());
        } else {
            throw new IllegalStateException("Unexpected node returned from basePrimary: " + base.getClass());
        }

        List<PostfixOpNode> postfixOps = new ArrayList<>();
        for (AngularParser.PostfixOpContext postfixCtx : ctx.postfixOp()) {
            postfixOps.add((PostfixOpNode) visit(postfixCtx));
        }

        return new PrimaryExpressionNode(basePrimaryNode, postfixOps, ctx.getStart().getLine());
    }


    @Override
    public ASTNode visitPropAccess(AngularParser.PropAccessContext ctx) {
        return visit(ctx.propertyAccessSuffix());
    }

    @Override
    public ASTNode visitFuncCall(AngularParser.FuncCallContext ctx) {
        return visitFunctionCallSuffix(ctx.functionCallSuffix());
    }

    @Override
    public ASTNode visitPipeExpr(AngularParser.PipeExprContext ctx) {
        return visitPipeExpressionSuffix(ctx.pipeExpressionSuffix());
    }

    @Override
    public ASTNode visitDotAccess(AngularParser.DotAccessContext ctx) {
        int line = ctx.getStart().getLine();
        String identifier =  ctx.IDENTIFIER().getText();

        sementicErrorsChecker.checkForUndefinedIdentifiers(identifier,ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(),symbolManager,errorReporter);

        return new DotAccessNode(identifier,line);
    }

    @Override
    public ASTNode visitArrAccess(AngularParser.ArrAccessContext ctx) {
        int line = ctx.getStart().getLine();
        ExpressionNode expressionNode =  (ExpressionNode) visitExpression(ctx.expression());

        return new ArrayAccessNode(expressionNode,line);
    }

    @Override
    public ASTNode visitFunctionCallSuffix(AngularParser.FunctionCallSuffixContext ctx) {
        int line = ctx.getStart().getLine();
        List<ExpressionNode> expressionNodes = new ArrayList<>();

        for (int i = 0; i< ctx.expression().size(); i++){
            ExpressionNode expressionNode = (ExpressionNode) visitExpression(ctx.expression(i));
            expressionNodes.add(expressionNode);
        }


        return new FunctionCallNode(expressionNodes,line);
    }


    @Override
    public ASTNode visitPipeExpressionSuffix(AngularParser.PipeExpressionSuffixContext ctx) {
        int line = ctx.getStart().getLine();
        String pipeName = ctx.PIPE_OPERATOR().getText();
        List<ExpressionNode> expressionNodes = new ArrayList<>();

        for (int i = 0; i< ctx.expression().size(); i++){
            ExpressionNode expressionNode = (ExpressionNode) visitExpression(ctx.expression(i));
            expressionNodes.add(expressionNode);
        }

        PipeExpressionNode pipeExpressionNode = new PipeExpressionNode(pipeName,expressionNodes,line);

//        Symbol symbol = new Symbol(pipeExpressionNode.getSymbolName(),"pipe expression",pipeName,false,line);
//        symbolManager.currentScope().define(pipeName,symbol);

        return  pipeExpressionNode;
    }

    @Override
    public ASTNode visitArrowFunction(AngularParser.ArrowFunctionContext ctx) {
        int line = ctx.getStart().getLine();

        symbolManager.enterScope("arrow function " + line);
        List<ParameterNode> parameters = new ArrayList<>();
        if (ctx.parameter() != null) {
            for (AngularParser.ParameterContext paramCtx : ctx.parameter()) {
                parameters.add((ParameterNode) visitParameter(paramCtx));
            }
        }

        TypeNode returnType = null;
        if (ctx.type() != null) {
            returnType = (TypeNode) visit(ctx.type());
        }

        ASTNode body;
        if (ctx.expression() != null) {
            body = visit(ctx.expression());
        } else {
            body = visit(ctx.block());
        }
        symbolManager.exitScope();
        return new ArrowFunctionNode(parameters, returnType, body, line);
    }


    @Override
    public ASTNode visitTemplateInterpolation(AngularParser.TemplateInterpolationContext ctx) {
        int line = ctx.getStart().getLine();
        ExpressionNode expression = (ExpressionNode) visit(ctx.expression());
        return new TemplateInterpolationNode(expression, line);
    }

    @Override
    public ASTNode visitLiteral(AngularParser.LiteralContext ctx) {
        int line = ctx.getStart().getLine();
        Object value;

        if (ctx.NUMBER() != null) {
            String text = ctx.NUMBER().getText();
            if (text.contains(".")) {
                value = Double.parseDouble(text);
            } else {
                value = Integer.parseInt(text);
            }
        } else if (ctx.STRING() != null) {
            String raw = ctx.STRING().getText();
            value = raw.substring(1, raw.length() - 1); // remove quotes
        } else if (ctx.BOOLEAN() != null) {
            value = Boolean.parseBoolean(ctx.BOOLEAN().getText());
        } else if (ctx.NULL() != null) {
            value = null;
        } else {
            throw new IllegalArgumentException("Unsupported literal at line " + line);
        }

        return new LiteralNode(value, line);
    }


    @Override
    public ASTNode visitArray(AngularParser.ArrayContext ctx) {
        int line = ctx.getStart().getLine();
        List<ExpressionNode> expressionNodes = new ArrayList<>();

        for (int i = 0; i < ctx.expression().size(); i++) {
            ExpressionNode expressionNode = (ExpressionNode) visitExpression(ctx.expression(i));
            expressionNodes.add(expressionNode);
        }
        return new ArrayNode(expressionNodes,line);
    }

    @Override
    public ASTNode visitObject(AngularParser.ObjectContext ctx) {
        int line = ctx.getStart().getLine();
        Map<String, ExpressionNode> entries = new HashMap<>();

        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            ExpressionNode expressionNode = (ExpressionNode) visitExpression(ctx.expression(i));
            String key = ctx.IDENTIFIER(i).getText();

            entries.put(key,expressionNode);
//            Symbol symbol = new Symbol(expressionNode.getSymbolName(),"key",ctx.expression().toString(),true,expressionNode.getLine());
//            symbolManager.currentScope().define(ctx.expression().toString(),symbol);
        }
        return new ObjectNode(entries,line);
    }

    @Override
    public ASTNode visitDecorator(AngularParser.DecoratorContext ctx) {
        int line = ctx.getStart().getLine();
        String decorator = ctx.IDENTIFIER().getText();

        DecoratorNode decoratorNode = new DecoratorNode(decorator,line);

        Symbol symbol = new Symbol(decoratorNode.getSymbolName(),"decorator use",decorator,false,line);
        symbolManager.currentScope().define(decorator,symbol);

        return  decoratorNode;
    }
}
