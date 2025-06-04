package gen;
// Generated from C:/Users/ASUS/Desktop/copiler/new/angularCompiler/src/AngularParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportStat}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStat(AngularParser.ExportStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImpState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpState(AngularParser.ImpStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(AngularParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstDecl}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(AngularParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(AngularParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(AngularParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfaceDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfaceDef(AngularParser.IfaceDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompDef(AngularParser.CompDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDef(AngularParser.EnumDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryCatchState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchState(AngularParser.TryCatchStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionState(AngularParser.ConditionStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileState(AngularParser.WhileStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakState(AngularParser.BreakStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContState(AngularParser.ContStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnState(AngularParser.ReturnStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignState(AngularParser.AssignStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprState}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprState(AngularParser.ExprStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefaultExp}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultExp(AngularParser.DefaultExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedExp}
	 * labeled alternative in {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExp(AngularParser.NamedExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#namedExport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExport(AngularParser.NamedExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#defaultExport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultExport(AngularParser.DefaultExportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefaultImp}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultImp(AngularParser.DefaultImpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedImp}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedImp(AngularParser.NamedImpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImpSide}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpSide(AngularParser.ImpSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#defaultImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultImport(AngularParser.DefaultImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedImport(AngularParser.NamedImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#sideEffectImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSideEffectImport(AngularParser.SideEffectImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(AngularParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdAssignment}
	 * labeled alternative in {@link AngularParser#assignmentTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAssignment(AngularParser.IdAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrAssignment}
	 * labeled alternative in {@link AngularParser#assignmentTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrAssignment(AngularParser.ArrAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotAssignment}
	 * labeled alternative in {@link AngularParser#assignmentTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotAssignment(AngularParser.DotAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalFuncDecl}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFuncDecl(AngularParser.NormalFuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFuncDecl}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFuncDecl(AngularParser.ArrowFuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expressionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParameter(AngularParser.ExpressionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngularParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(AngularParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#extendsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsStatement(AngularParser.ExtendsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#implementsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsStatement(AngularParser.ImplementsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVariableDeclaration(AngularParser.ClassVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDefinition(AngularParser.ConstructorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(AngularParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDefinition(AngularParser.InterfaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMember(AngularParser.InterfaceMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDefinition(AngularParser.ComponentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentConfig(AngularParser.ComponentConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentProperties(AngularParser.ComponentPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProp(AngularParser.SelectorPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateUrlProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrlProp(AngularParser.TemplateUrlPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StylesUrlProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesUrlProp(AngularParser.StylesUrlPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemolateProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemolateProp(AngularParser.TemolatePropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyelsProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyelsProp(AngularParser.StyelsPropContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefinition(AngularParser.EnumDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValues(AngularParser.EnumValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(AngularParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(AngularParser.TryCatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(AngularParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NorTpe}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNorTpe(AngularParser.NorTpeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrTpe}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrTpe(AngularParser.ArrTpeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#normalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalType(AngularParser.NormalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(AngularParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#nullishCoalescingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullishCoalescingExpression(AngularParser.NullishCoalescingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(AngularParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(AngularParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(AngularParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(AngularParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(AngularParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(AngularParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(AngularParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(AngularParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(AngularParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AngularParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arr}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(AngularParser.ArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Obj}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(AngularParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunc}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunc(AngularParser.ArrowFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateInterp}
	 * labeled alternative in {@link AngularParser#basePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateInterp(AngularParser.TemplateInterpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(AngularParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropAccess}
	 * labeled alternative in {@link AngularParser#postfixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropAccess(AngularParser.PropAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link AngularParser#postfixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(AngularParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PipeExpr}
	 * labeled alternative in {@link AngularParser#postfixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeExpr(AngularParser.PipeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotAccess}
	 * labeled alternative in {@link AngularParser#propertyAccessSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotAccess(AngularParser.DotAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrAccess}
	 * labeled alternative in {@link AngularParser#propertyAccessSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrAccess(AngularParser.ArrAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCallSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallSuffix(AngularParser.FunctionCallSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#pipeExpressionSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeExpressionSuffix(AngularParser.PipeExpressionSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateInterpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateInterpolation(AngularParser.TemplateInterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AngularParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(AngularParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(AngularParser.DecoratorContext ctx);
}