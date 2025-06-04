package gen;
// Generated from C:/Users/ASUS/Desktop/copiler/new/angularCompiler/src/AngularParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportStat}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExportStat(AngularParser.ExportStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportStat}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExportStat(AngularParser.ExportStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImpState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImpState(AngularParser.ImpStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImpState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImpState(AngularParser.ImpStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(AngularParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(AngularParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstDecl}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(AngularParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstDecl}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(AngularParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(AngularParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(AngularParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(AngularParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(AngularParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfaceDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfaceDef(AngularParser.IfaceDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfaceDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfaceDef(AngularParser.IfaceDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompDef(AngularParser.CompDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompDef(AngularParser.CompDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEnumDef(AngularParser.EnumDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEnumDef(AngularParser.EnumDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryCatchState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchState(AngularParser.TryCatchStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryCatchState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchState(AngularParser.TryCatchStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConditionState(AngularParser.ConditionStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConditionState(AngularParser.ConditionStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileState(AngularParser.WhileStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileState(AngularParser.WhileStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakState(AngularParser.BreakStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakState(AngularParser.BreakStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContState(AngularParser.ContStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContState(AngularParser.ContStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnState(AngularParser.ReturnStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnState(AngularParser.ReturnStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignState(AngularParser.AssignStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignState(AngularParser.AssignStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprState(AngularParser.ExprStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprState(AngularParser.ExprStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefaultExp}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultExp(AngularParser.DefaultExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefaultExp}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultExp(AngularParser.DefaultExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedExp}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterNamedExp(AngularParser.NamedExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedExp}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitNamedExp(AngularParser.NamedExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#namedExport}.
	 * @param ctx the parse tree
	 */
	void enterNamedExport(AngularParser.NamedExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#namedExport}.
	 * @param ctx the parse tree
	 */
	void exitNamedExport(AngularParser.NamedExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#defaultExport}.
	 * @param ctx the parse tree
	 */
	void enterDefaultExport(AngularParser.DefaultExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#defaultExport}.
	 * @param ctx the parse tree
	 */
	void exitDefaultExport(AngularParser.DefaultExportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefaultImp}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultImp(AngularParser.DefaultImpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefaultImp}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultImp(AngularParser.DefaultImpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedImp}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterNamedImp(AngularParser.NamedImpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedImp}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitNamedImp(AngularParser.NamedImpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImpSide}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImpSide(AngularParser.ImpSideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImpSide}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImpSide(AngularParser.ImpSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#defaultImport}.
	 * @param ctx the parse tree
	 */
	void enterDefaultImport(AngularParser.DefaultImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#defaultImport}.
	 * @param ctx the parse tree
	 */
	void exitDefaultImport(AngularParser.DefaultImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 */
	void enterNamedImport(AngularParser.NamedImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 */
	void exitNamedImport(AngularParser.NamedImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#sideEffectImport}.
	 * @param ctx the parse tree
	 */
	void enterSideEffectImport(AngularParser.SideEffectImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#sideEffectImport}.
	 * @param ctx the parse tree
	 */
	void exitSideEffectImport(AngularParser.SideEffectImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(AngularParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(AngularParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(AngularParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(AngularParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdAssignment}
	 * labeled alternative in {@link AngularParser#assignmentTo}.
	 * @param ctx the parse tree
	 */
	void enterIdAssignment(AngularParser.IdAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdAssignment}
	 * labeled alternative in {@link AngularParser#assignmentTo}.
	 * @param ctx the parse tree
	 */
	void exitIdAssignment(AngularParser.IdAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrAssignment}
	 * labeled alternative in {@link AngularParser#assignmentTo}.
	 * @param ctx the parse tree
	 */
	void enterArrAssignment(AngularParser.ArrAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrAssignment}
	 * labeled alternative in {@link AngularParser#assignmentTo}.
	 * @param ctx the parse tree
	 */
	void exitArrAssignment(AngularParser.ArrAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotAssignment}
	 * labeled alternative in {@link AngularParser#assignmentTo}.
	 * @param ctx the parse tree
	 */
	void enterDotAssignment(AngularParser.DotAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotAssignment}
	 * labeled alternative in {@link AngularParser#assignmentTo}.
	 * @param ctx the parse tree
	 */
	void exitDotAssignment(AngularParser.DotAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalFuncDecl}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalFuncDecl(AngularParser.NormalFuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalFuncDecl}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalFuncDecl(AngularParser.NormalFuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFuncDecl}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrowFuncDecl(AngularParser.ArrowFuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFuncDecl}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrowFuncDecl(AngularParser.ArrowFuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expressionParameter}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParameter(AngularParser.ExpressionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionParameter}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParameter(AngularParser.ExpressionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(AngularParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(AngularParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#extendsStatement}.
	 * @param ctx the parse tree
	 */
	void enterExtendsStatement(AngularParser.ExtendsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#extendsStatement}.
	 * @param ctx the parse tree
	 */
	void exitExtendsStatement(AngularParser.ExtendsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#implementsStatement}.
	 * @param ctx the parse tree
	 */
	void enterImplementsStatement(AngularParser.ImplementsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#implementsStatement}.
	 * @param ctx the parse tree
	 */
	void exitImplementsStatement(AngularParser.ImplementsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassVariableDeclaration(AngularParser.ClassVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassVariableDeclaration(AngularParser.ClassVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDefinition(AngularParser.ConstructorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDefinition(AngularParser.ConstructorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(AngularParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(AngularParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDefinition(AngularParser.InterfaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDefinition(AngularParser.InterfaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMember(AngularParser.InterfaceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMember(AngularParser.InterfaceMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterComponentDefinition(AngularParser.ComponentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitComponentDefinition(AngularParser.ComponentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void enterComponentConfig(AngularParser.ComponentConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void exitComponentConfig(AngularParser.ComponentConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentProperties}.
	 * @param ctx the parse tree
	 */
	void enterComponentProperties(AngularParser.ComponentPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentProperties}.
	 * @param ctx the parse tree
	 */
	void exitComponentProperties(AngularParser.ComponentPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectorProp(AngularParser.SelectorPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectorProp(AngularParser.SelectorPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateUrlProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrlProp(AngularParser.TemplateUrlPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateUrlProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrlProp(AngularParser.TemplateUrlPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StylesUrlProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterStylesUrlProp(AngularParser.StylesUrlPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StylesUrlProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitStylesUrlProp(AngularParser.StylesUrlPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemolateProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemolateProp(AngularParser.TemolatePropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemolateProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemolateProp(AngularParser.TemolatePropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyelsProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterStyelsProp(AngularParser.StyelsPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyelsProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitStyelsProp(AngularParser.StyelsPropContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(AngularParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(AngularParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enumValues}.
	 * @param ctx the parse tree
	 */
	void enterEnumValues(AngularParser.EnumValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enumValues}.
	 * @param ctx the parse tree
	 */
	void exitEnumValues(AngularParser.EnumValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(AngularParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(AngularParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(AngularParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(AngularParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(AngularParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(AngularParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NorTpe}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterNorTpe(AngularParser.NorTpeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NorTpe}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitNorTpe(AngularParser.NorTpeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrTpe}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrTpe(AngularParser.ArrTpeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrTpe}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrTpe(AngularParser.ArrTpeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#normalType}.
	 * @param ctx the parse tree
	 */
	void enterNormalType(AngularParser.NormalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#normalType}.
	 * @param ctx the parse tree
	 */
	void exitNormalType(AngularParser.NormalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(AngularParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(AngularParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#nullishCoalescingExpression}.
	 * @param ctx the parse tree
	 */
	void enterNullishCoalescingExpression(AngularParser.NullishCoalescingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#nullishCoalescingExpression}.
	 * @param ctx the parse tree
	 */
	void exitNullishCoalescingExpression(AngularParser.NullishCoalescingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(AngularParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(AngularParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(AngularParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(AngularParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(AngularParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(AngularParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(AngularParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(AngularParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(AngularParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(AngularParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(AngularParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(AngularParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(AngularParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(AngularParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void enterLit(AngularParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void exitLit(AngularParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void enterId(AngularParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void exitId(AngularParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AngularParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AngularParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arr}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void enterArr(AngularParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arr}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void exitArr(AngularParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Obj}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void enterObj(AngularParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Obj}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void exitObj(AngularParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunc}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunc(AngularParser.ArrowFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunc}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunc(AngularParser.ArrowFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateInterp}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void enterTemplateInterp(AngularParser.TemplateInterpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateInterp}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 */
	void exitTemplateInterp(AngularParser.TemplateInterpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(AngularParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(AngularParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropAccess}
	 * labeled alternative in {@link AngularParser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void enterPropAccess(AngularParser.PropAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropAccess}
	 * labeled alternative in {@link AngularParser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void exitPropAccess(AngularParser.PropAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link AngularParser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(AngularParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link AngularParser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(AngularParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PipeExpr}
	 * labeled alternative in {@link AngularParser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void enterPipeExpr(AngularParser.PipeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PipeExpr}
	 * labeled alternative in {@link AngularParser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void exitPipeExpr(AngularParser.PipeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotAccess}
	 * labeled alternative in {@link AngularParser#propertyAccessSuffix}.
	 * @param ctx the parse tree
	 */
	void enterDotAccess(AngularParser.DotAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotAccess}
	 * labeled alternative in {@link AngularParser#propertyAccessSuffix}.
	 * @param ctx the parse tree
	 */
	void exitDotAccess(AngularParser.DotAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrAccess}
	 * labeled alternative in {@link AngularParser#propertyAccessSuffix}.
	 * @param ctx the parse tree
	 */
	void enterArrAccess(AngularParser.ArrAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrAccess}
	 * labeled alternative in {@link AngularParser#propertyAccessSuffix}.
	 * @param ctx the parse tree
	 */
	void exitArrAccess(AngularParser.ArrAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCallSuffix}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallSuffix(AngularParser.FunctionCallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCallSuffix}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallSuffix(AngularParser.FunctionCallSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#pipeExpressionSuffix}.
	 * @param ctx the parse tree
	 */
	void enterPipeExpressionSuffix(AngularParser.PipeExpressionSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#pipeExpressionSuffix}.
	 * @param ctx the parse tree
	 */
	void exitPipeExpressionSuffix(AngularParser.PipeExpressionSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateInterpolation}.
	 * @param ctx the parse tree
	 */
	void enterTemplateInterpolation(AngularParser.TemplateInterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateInterpolation}.
	 * @param ctx the parse tree
	 */
	void exitTemplateInterpolation(AngularParser.TemplateInterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngularParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngularParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AngularParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AngularParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AngularParser.DecoratorContext ctx);
}