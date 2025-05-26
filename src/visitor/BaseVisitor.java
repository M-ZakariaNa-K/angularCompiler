package visitor;

import ast.ASTNode;
import gen.AngularParser;
import gen.AngularParserVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class BaseVisitor extends AbstractParseTreeVisitor<ASTNode> implements AngularParserVisitor<ASTNode> {


    @Override
    public ASTNode visitProgram(AngularParser.ProgramContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitExportStat(AngularParser.ExportStatContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitImpState(AngularParser.ImpStateContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitVarDecl(AngularParser.VarDeclContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitConstDecl(AngularParser.ConstDeclContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitFuncDecl(AngularParser.FuncDeclContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitClassDef(AngularParser.ClassDefContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitIfaceDef(AngularParser.IfaceDefContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitCompDef(AngularParser.CompDefContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitEnumDef(AngularParser.EnumDefContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitTryCatchState(AngularParser.TryCatchStateContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitConditionState(AngularParser.ConditionStateContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitWhileState(AngularParser.WhileStateContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitBreakState(AngularParser.BreakStateContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitContState(AngularParser.ContStateContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitReturnState(AngularParser.ReturnStateContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitAssignState(AngularParser.AssignStateContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitExprState(AngularParser.ExprStateContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLocalVarDecl(AngularParser.LocalVarDeclContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLocalConstDecl(AngularParser.LocalConstDeclContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDefaultExp(AngularParser.DefaultExpContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNamedExp(AngularParser.NamedExpContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNamedExport(AngularParser.NamedExportContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDefaultExport(AngularParser.DefaultExportContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDefaultImp(AngularParser.DefaultImpContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNamedImp(AngularParser.NamedImpContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitImpSide(AngularParser.ImpSideContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDefaultImport(AngularParser.DefaultImportContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNamedImport(AngularParser.NamedImportContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitSideEffectImport(AngularParser.SideEffectImportContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitConstantDeclaration(AngularParser.ConstantDeclarationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLocalVariableDeclaration(AngularParser.LocalVariableDeclarationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLocalConstantDeclaration(AngularParser.LocalConstantDeclarationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitIdNotation(AngularParser.IdNotationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitArrNotaion(AngularParser.ArrNotaionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDotNotation(AngularParser.DotNotationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNormalFuncDecl(AngularParser.NormalFuncDeclContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitArrowFuncDecl(AngularParser.ArrowFuncDeclContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitParameterList(AngularParser.ParameterListContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitExpressionParameter(AngularParser.ExpressionParameterContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitParameter(AngularParser.ParameterContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitAccessModifier(AngularParser.AccessModifierContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitBlock(AngularParser.BlockContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitClassDefinition(AngularParser.ClassDefinitionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitExtendsStatement(AngularParser.ExtendsStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitImplementsStatement(AngularParser.ImplementsStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitClassBody(AngularParser.ClassBodyContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitClassVariableDeclaration(AngularParser.ClassVariableDeclarationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitConstructorDefinition(AngularParser.ConstructorDefinitionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitMethodDefinition(AngularParser.MethodDefinitionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitInterfaceDefinition(AngularParser.InterfaceDefinitionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitInterfaceBody(AngularParser.InterfaceBodyContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitInterfaceMember(AngularParser.InterfaceMemberContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitComponentDefinition(AngularParser.ComponentDefinitionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitComponentConfig(AngularParser.ComponentConfigContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitSProp(AngularParser.SPropContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitTUrlProp(AngularParser.TUrlPropContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitSUrlProp(AngularParser.SUrlPropContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitTProp(AngularParser.TPropContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitEnumDefinition(AngularParser.EnumDefinitionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitEnumValues(AngularParser.EnumValuesContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitEnumValue(AngularParser.EnumValueContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitTryCatchStatement(AngularParser.TryCatchStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitConditionalStatement(AngularParser.ConditionalStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitIfStatement(AngularParser.IfStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitElseStatement(AngularParser.ElseStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitBreakStatement(AngularParser.BreakStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitContinueStatement(AngularParser.ContinueStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNorTpe(AngularParser.NorTpeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitArrTpe(AngularParser.ArrTpeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNormalType(AngularParser.NormalTypeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitArrayType(AngularParser.ArrayTypeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitExpression(AngularParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNullishCoalescingExpression(AngularParser.NullishCoalescingExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLogicalOrExpression(AngularParser.LogicalOrExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLogicalAndExpression(AngularParser.LogicalAndExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitEqualityExpression(AngularParser.EqualityExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitRelationalExpression(AngularParser.RelationalExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitAdditiveExpression(AngularParser.AdditiveExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitUnaryExpression(AngularParser.UnaryExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitThisExpr(AngularParser.ThisExprContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLit(AngularParser.LitContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitId(AngularParser.IdContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitExpr(AngularParser.ExprContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitArr(AngularParser.ArrContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitObj(AngularParser.ObjContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitArrowFunc(AngularParser.ArrowFuncContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitTemplateInterp(AngularParser.TemplateInterpContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitPrimaryExpression(AngularParser.PrimaryExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitPropAccess(AngularParser.PropAccessContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitFuncCall(AngularParser.FuncCallContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitPipeExpr(AngularParser.PipeExprContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDotAccess(AngularParser.DotAccessContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitArrAccess(AngularParser.ArrAccessContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitFunctionCallSuffix(AngularParser.FunctionCallSuffixContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitPipeExpressionSuffix(AngularParser.PipeExpressionSuffixContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitArrowFunction(AngularParser.ArrowFunctionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitTemplateInterpolation(AngularParser.TemplateInterpolationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLiteral(AngularParser.LiteralContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitArray(AngularParser.ArrayContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitObject(AngularParser.ObjectContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDecorator(AngularParser.DecoratorContext ctx) {
        return null;
    }
}
