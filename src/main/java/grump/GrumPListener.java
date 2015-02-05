package grump;
// Generated from GrumP.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrumPParser}.
 */
public interface GrumPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrumPParser#grump}.
	 * @param ctx the parse tree
	 */
	void enterGrump(GrumPParser.GrumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#grump}.
	 * @param ctx the parse tree
	 */
	void exitGrump(GrumPParser.GrumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#topLevelStatements}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelStatements(GrumPParser.TopLevelStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#topLevelStatements}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelStatements(GrumPParser.TopLevelStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#topLevelStatement}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelStatement(GrumPParser.TopLevelStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#topLevelStatement}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelStatement(GrumPParser.TopLevelStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(GrumPParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(GrumPParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#defineType}.
	 * @param ctx the parse tree
	 */
	void enterDefineType(GrumPParser.DefineTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#defineType}.
	 * @param ctx the parse tree
	 */
	void exitDefineType(GrumPParser.DefineTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#defineBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefineBlock(GrumPParser.DefineBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#defineBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefineBlock(GrumPParser.DefineBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#defineStatements}.
	 * @param ctx the parse tree
	 */
	void enterDefineStatements(GrumPParser.DefineStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#defineStatements}.
	 * @param ctx the parse tree
	 */
	void exitDefineStatements(GrumPParser.DefineStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(GrumPParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(GrumPParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#constructorStatments}.
	 * @param ctx the parse tree
	 */
	void enterConstructorStatments(GrumPParser.ConstructorStatmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#constructorStatments}.
	 * @param ctx the parse tree
	 */
	void exitConstructorStatments(GrumPParser.ConstructorStatmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#example}.
	 * @param ctx the parse tree
	 */
	void enterExample(GrumPParser.ExampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#example}.
	 * @param ctx the parse tree
	 */
	void exitExample(GrumPParser.ExampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#exampleStatements}.
	 * @param ctx the parse tree
	 */
	void enterExampleStatements(GrumPParser.ExampleStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#exampleStatements}.
	 * @param ctx the parse tree
	 */
	void exitExampleStatements(GrumPParser.ExampleStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#parameterStatement}.
	 * @param ctx the parse tree
	 */
	void enterParameterStatement(GrumPParser.ParameterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#parameterStatement}.
	 * @param ctx the parse tree
	 */
	void exitParameterStatement(GrumPParser.ParameterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#parameterAssignment}.
	 * @param ctx the parse tree
	 */
	void enterParameterAssignment(GrumPParser.ParameterAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#parameterAssignment}.
	 * @param ctx the parse tree
	 */
	void exitParameterAssignment(GrumPParser.ParameterAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#sketchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSketchStatement(GrumPParser.SketchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#sketchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSketchStatement(GrumPParser.SketchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#sketchAssignment}.
	 * @param ctx the parse tree
	 */
	void enterSketchAssignment(GrumPParser.SketchAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#sketchAssignment}.
	 * @param ctx the parse tree
	 */
	void exitSketchAssignment(GrumPParser.SketchAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#sketchConstruction}.
	 * @param ctx the parse tree
	 */
	void enterSketchConstruction(GrumPParser.SketchConstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#sketchConstruction}.
	 * @param ctx the parse tree
	 */
	void exitSketchConstruction(GrumPParser.SketchConstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#sketchType}.
	 * @param ctx the parse tree
	 */
	void enterSketchType(GrumPParser.SketchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#sketchType}.
	 * @param ctx the parse tree
	 */
	void exitSketchType(GrumPParser.SketchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#constraintStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstraintStatement(GrumPParser.ConstraintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#constraintStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstraintStatement(GrumPParser.ConstraintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(GrumPParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(GrumPParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#constraintExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstraintExpression(GrumPParser.ConstraintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#constraintExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstraintExpression(GrumPParser.ConstraintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GrumPParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GrumPParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrumPParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrumPParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GrumPParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GrumPParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(GrumPParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(GrumPParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(GrumPParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(GrumPParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#builtin}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin(GrumPParser.BuiltinContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#builtin}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin(GrumPParser.BuiltinContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(GrumPParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(GrumPParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(GrumPParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(GrumPParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrumPParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterSymbols(GrumPParser.SymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrumPParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitSymbols(GrumPParser.SymbolsContext ctx);
}