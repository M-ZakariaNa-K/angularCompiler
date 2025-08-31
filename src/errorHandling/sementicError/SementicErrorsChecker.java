package errorHandling.sementicError;

import ast.ASTNode;
import ast.statements.declaration.MethodDefinitionNode;
import ast.statements.definition.ClassBodyNode;
import ast.statements.definition.component.ComponentConfigNode;
import ast.statements.definition.component.ComponentDefinitionNode;
import ast.statements.definition.component.ComponentPropertiesNode;
import ast.statements.definition.component.property.ComponentPropertyNode;
import ast.statements.definition.component.property.SelectorPropertyNode;
import ast.statements.definition.component.property.TemplatePropertyNode;
import ast.statements.definition.component.property.TemplateUrlPropertyNode;
import ast.types.NormalTypeNode;
import ast.types.TypeNode;
import errorHandling.ErrorReporter;
import errorHandling.ErrorType;

import symboltable.Symbol;
import symboltable.SymbolTable;
import symboltable.SymbolTableManager;

import java.util.List;
import java.util.Objects;

public class SementicErrorsChecker {
    public SementicErrorsChecker() {}
    public void checkForUndefinedIdentifiers(String name,int line, int column, SymbolTableManager symbolTableManager, ErrorReporter errorReporter) {
        boolean isDefined = symbolTableManager.currentScope().containsInGreaterScope(name);
        if (!isDefined) {
            errorReporter.report(
                    "Undeclared variable: " + name + " at line : " + line,
                    line,
                    column,
                    symbolTableManager.currentScope(),
                    ErrorType.UNDECLARED_IDENTIFIER
            );
        }
    }
    public String unquote(String value) {
        if (value == null || value.length() < 2) return value;

        char first = value.charAt(0);
        char last = value.charAt(value.length() - 1);

        if ((first == '"' && last == '"') || (first == '\'' && last == '\'')) {
            return value.substring(1, value.length() - 1);
        }

        return value;
    }

    public void checkForDuplicateDeclaration (String name,int line, int column, SymbolTableManager symbolTableManager, ErrorReporter errorReporter) {
        if (name == null ) return;

        boolean isDefined =  symbolTableManager.currentScope().containsInCurrentScope(name);
        if (isDefined) {
            errorReporter.report(
                    name + " is already defined at line : " + line,
                    line,
                    column,
                    symbolTableManager.currentScope(),
                    ErrorType.DUPLICATE_DECLARATION
            );
        }
    }
    public void checkForConstReassignment (String name,int line, int column, SymbolTableManager symbolTableManager,ErrorReporter errorReporter) {
        if (name == null) return;

        boolean found = symbolTableManager.currentScope().containsInGreaterScope(name);
        if (found) {
            Symbol symbol = symbolTableManager.currentScope().resolve(name);
            if (!symbol.isMutable()) {
                errorReporter.report(
                        "invalid re assignment " + name + " is not mutable cause -> it is (" + symbol.getSymbolType() + ") at line : " + line,
                        line,
                        column,
                        symbolTableManager.currentScope(),
                        ErrorType.CONST_REASSIGNMENT
                );
            }
        }

    }
    public void checkForExtentable (String name,int line, int column, SymbolTableManager symbolTableManager,ErrorReporter errorReporter) {
        boolean isDefined = symbolTableManager.currentScope().containsInGreaterScope(name);
        if (!isDefined) {
            errorReporter.report(
                    "can'nt find class : " + name + " at line : " + line,
                    line,
                    column,
                    symbolTableManager.currentScope(),
                    ErrorType.UNDECLARED_IDENTIFIER
            );
        } else {
            Symbol className = symbolTableManager.currentScope().resolve(name);
            if (!Objects.equals(className.getType(), "class") && !Objects.equals(className.getType(), "imported")) {
                errorReporter.report(
                         name + " is not a class to extends " +  " at line : " + line,
                        line,
                        column,
                        symbolTableManager.currentScope(),
                        ErrorType.INHERATBLE
                );
            }
        }

    }
    public void checkForImplementable (String name,int line, int column, SymbolTableManager symbolTableManager,ErrorReporter errorReporter) {
        boolean isDefined = symbolTableManager.currentScope().containsInGreaterScope(name);
        if (!isDefined) {
            errorReporter.report(
                    "can'nt find interface : " + name + " at line : " + line,
                    line,
                    column,
                    symbolTableManager.currentScope(),
                    ErrorType.UNDECLARED_IDENTIFIER
            );
        } else {
            Symbol className = symbolTableManager.currentScope().resolve(name);
            if (!Objects.equals(className.getType(), "interface") && !Objects.equals(className.getType(), "imported")) {
                errorReporter.report(
                        name + " is not an interface to implements " +  " at line : " + line,
                        line,
                        column,
                        symbolTableManager.currentScope(),
                        ErrorType.INHERATBLE
                );
            }
        }

    }
    public void checkForComponentTemplate (String name, ComponentConfigNode componentConfigNode,int column , SymbolTableManager symbolTableManager,ErrorReporter errorReporter) {
        if (componentConfigNode == null) return;

        boolean hasTemplate = false;

        ComponentPropertiesNode componentProperties =  componentConfigNode.getProperties();
        for (ComponentPropertyNode componentProperty : componentProperties.getProperties()) {
            if (componentProperty instanceof TemplatePropertyNode || componentProperty instanceof TemplateUrlPropertyNode) {
                hasTemplate = true;
                break;
            }
        }

        if (!hasTemplate) {
            errorReporter.report(
                    "@Component "  + name +  " must define either 'template' or 'templateUrl'.",
                    componentConfigNode.getLine(),
                    column,
                    symbolTableManager.currentScope(),
                    ErrorType.MISSING_DECORATOR_PROPERTY
            );
        }
    }
    public void checkForOneComponentPerFile (int line, int column , SymbolTableManager symbolTableManager,ErrorReporter errorReporter) {
        boolean isValid = true;

        List<Symbol> symbols =  symbolTableManager.allSymbols();
        if (symbols != null) {
            for (Symbol symbol : symbols) {
                if (Objects.equals(symbol.getType(), "component definition")) {
                    isValid = false;
                    break;
                }
            }
        }

        if (!isValid) {
            errorReporter.report(
                    "Only one @Component class is allowed per file.",
                    line,
                    column,
                    symbolTableManager.currentScope(),
                    ErrorType.MULTIPLE_COMPONENTS
            );
        }
    }
    public void checkForComponentSelectorPropValidation (ComponentConfigNode componentConfigNode,int column , SymbolTableManager symbolTableManager,ErrorReporter errorReporter) {
        if (componentConfigNode == null) return;

        boolean isValidSelector = false;
        boolean hasSelector = false;
        String selector = "";
        ComponentPropertiesNode componentProperties =  componentConfigNode.getProperties();
        for (ComponentPropertyNode componentProperty : componentProperties.getProperties()) {
            if (componentProperty instanceof SelectorPropertyNode){
                hasSelector = true;
                selector = unquote(((SelectorPropertyNode) componentProperty).getValue());

                if (selector != null && selector.matches("^app-[a-z0-9]+(-[a-z0-9]+)*$")) isValidSelector = true;
            }
        }

        if (hasSelector && !isValidSelector) {
            errorReporter.report(
                    "Invalid selector '" + selector + "'. It must be in kebab-case and prefixed with app (e.g., 'app-user-list').",
                    componentConfigNode.getLine(),
                    column,
                   symbolTableManager.currentScope(),
                    ErrorType.INVALID_SELECTOR
            );
        }
    }
    // ngOninit life
    public void checkNgOnInitLifeCycle(ComponentDefinitionNode componentDefinitionNode,SymbolTableManager symbolTableManager,ErrorReporter errorReporter) {
        ClassBodyNode classBody = componentDefinitionNode.getClassBody();
        if (classBody == null) return;

        for (ASTNode member : classBody.getClassMembers()) {
            if (member instanceof MethodDefinitionNode) {
                MethodDefinitionNode method = (MethodDefinitionNode) member;
                if ("ngOnInit".equals(method.getMethodName())) {
                    checkOnInitInterface(componentDefinitionNode, method, symbolTableManager, errorReporter);
                    checkNgOnInitReturnType(method, symbolTableManager, errorReporter);
                }
            }
        }
    }
    private void checkOnInitInterface(ComponentDefinitionNode componentDef,MethodDefinitionNode method,SymbolTableManager symbolTableManager,ErrorReporter errorReporter) {
        if (!symbolTableManager.currentScope().containsInCurrentScope("onInit")) {
            errorReporter.report(
                    componentDef.getClassName() + " component must implement the OnInit interface to use ngOnInit hook.",
                    method.getLine(),
                    5,
                    symbolTableManager.currentScope(),
                    ErrorType.MULTIPLE_COMPONENTS
            );
        } else if (symbolTableManager.currentScope().containsInSuperScope("onInit")) {
            Symbol onInit = symbolTableManager.currentScope().resolveFromSuperScope("onInit");

            if (!"imported".equals(onInit.getType())) {
                errorReporter.report(
                        "Illegal definition of onInit interface.",
                        method.getLine(),
                        5,
                        getRelevantScope(symbolTableManager),
                        ErrorType.MULTIPLE_COMPONENTS
                );
            }
        }
    }
    private void checkNgOnInitReturnType(MethodDefinitionNode method,SymbolTableManager symbolTableManager,ErrorReporter errorReporter) {
        TypeNode returnType = method.getReturnType();
        if (!"VOID".equals(returnType.getStringType())) {
            errorReporter.report(
                    "ngOnInit hook return type must be void.",
                    method.getLine(),
                    5,
                    symbolTableManager.currentScope(),
                    ErrorType.MULTIPLE_COMPONENTS
            );
        }
    }

    private SymbolTable getRelevantScope(SymbolTableManager symbolTableManager) {
        return symbolTableManager.currentScope().getParent() != null
                ? symbolTableManager.currentScope().getParent()
                : symbolTableManager.currentScope();
    }
    // end
}
