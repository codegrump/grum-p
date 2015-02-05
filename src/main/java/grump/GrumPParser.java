package grump;
// Generated from GrumP.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrumPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		THIS=1, EXAMPLE=2, SKETCH=3, POINT=4, DISTANCE=5, CONSTANT=6, CONSTRAINT=7, 
		CONSTRUCTOR=8, DECLARE=9, DEFINE=10, DISPLAY=11, PARAMETER=12, EQUATION=13, 
		EXPRESSION=14, EXTENDS=15, SQUARE=16, SQRT=17, SIN=18, COS=19, ASIN=20, 
		ACOS=21, PI=22, GOLDEN_RATIO=23, IntegerLiteral=24, FloatingPointLiteral=25, 
		LPAREN=26, RPAREN=27, LBRACE=28, RBRACE=29, LBRACK=30, RBRACK=31, SEMI=32, 
		COMMA=33, DOT=34, EQUALS=35, ASSIGN=36, ADD=37, SUB=38, MUL=39, DIV=40, 
		Symbol=41, WS=42, LINE_COMMENT=43;
	public static final int
		RULE_grump = 0, RULE_topLevelStatements = 1, RULE_topLevelStatement = 2, 
		RULE_define = 3, RULE_defineType = 4, RULE_defineBlock = 5, RULE_defineStatements = 6, 
		RULE_constructor = 7, RULE_constructorStatments = 8, RULE_example = 9, 
		RULE_exampleStatements = 10, RULE_parameterStatement = 11, RULE_parameterAssignment = 12, 
		RULE_sketchStatement = 13, RULE_sketchAssignment = 14, RULE_sketchConstruction = 15, 
		RULE_sketchType = 16, RULE_constraintStatement = 17, RULE_constraint = 18, 
		RULE_constraintExpression = 19, RULE_arguments = 20, RULE_expression = 21, 
		RULE_parameters = 22, RULE_parameter = 23, RULE_parameterType = 24, RULE_builtin = 25, 
		RULE_constant = 26, RULE_reference = 27, RULE_symbols = 28;
	public static final String[] ruleNames = {
		"grump", "topLevelStatements", "topLevelStatement", "define", "defineType", 
		"defineBlock", "defineStatements", "constructor", "constructorStatments", 
		"example", "exampleStatements", "parameterStatement", "parameterAssignment", 
		"sketchStatement", "sketchAssignment", "sketchConstruction", "sketchType", 
		"constraintStatement", "constraint", "constraintExpression", "arguments", 
		"expression", "parameters", "parameter", "parameterType", "builtin", "constant", 
		"reference", "symbols"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'this'", "'example'", "'Sketch'", "'Point'", "'distance'", "'constant'", 
		"'constraint'", "'constructor'", "'declare'", "'define'", "'display'", 
		"'parameter'", "'equation'", "'expression'", "'extends'", "'square'", 
		"'sqrt'", "'sin'", "'cos'", "'asin'", "'acos'", "'PI'", "'GOLDEN_RATIO'", 
		null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "':='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "THIS", "EXAMPLE", "SKETCH", "POINT", "DISTANCE", "CONSTANT", "CONSTRAINT", 
		"CONSTRUCTOR", "DECLARE", "DEFINE", "DISPLAY", "PARAMETER", "EQUATION", 
		"EXPRESSION", "EXTENDS", "SQUARE", "SQRT", "SIN", "COS", "ASIN", "ACOS", 
		"PI", "GOLDEN_RATIO", "IntegerLiteral", "FloatingPointLiteral", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"EQUALS", "ASSIGN", "ADD", "SUB", "MUL", "DIV", "Symbol", "WS", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GrumP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrumPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrumpContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrumPParser.EOF, 0); }
		public TopLevelStatementsContext topLevelStatements() {
			return getRuleContext(TopLevelStatementsContext.class,0);
		}
		public GrumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grump; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterGrump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitGrump(this);
		}
	}

	public final GrumpContext grump() throws RecognitionException {
		GrumpContext _localctx = new GrumpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grump);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if (_la==EXAMPLE || _la==DEFINE) {
				{
				setState(58);
				topLevelStatements();
				}
			}

			setState(61);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopLevelStatementsContext extends ParserRuleContext {
		public List<TopLevelStatementContext> topLevelStatement() {
			return getRuleContexts(TopLevelStatementContext.class);
		}
		public TopLevelStatementContext topLevelStatement(int i) {
			return getRuleContext(TopLevelStatementContext.class,i);
		}
		public TopLevelStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterTopLevelStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitTopLevelStatements(this);
		}
	}

	public final TopLevelStatementsContext topLevelStatements() throws RecognitionException {
		TopLevelStatementsContext _localctx = new TopLevelStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevelStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				topLevelStatement();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXAMPLE || _la==DEFINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopLevelStatementContext extends ParserRuleContext {
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public ExampleContext example() {
			return getRuleContext(ExampleContext.class,0);
		}
		public TopLevelStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterTopLevelStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitTopLevelStatement(this);
		}
	}

	public final TopLevelStatementContext topLevelStatement() throws RecognitionException {
		TopLevelStatementContext _localctx = new TopLevelStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topLevelStatement);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				define();
				}
				break;
			case EXAMPLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				example();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(GrumPParser.DEFINE, 0); }
		public TerminalNode Symbol() { return getToken(GrumPParser.Symbol, 0); }
		public TerminalNode EXTENDS() { return getToken(GrumPParser.EXTENDS, 0); }
		public DefineTypeContext defineType() {
			return getRuleContext(DefineTypeContext.class,0);
		}
		public DefineBlockContext defineBlock() {
			return getRuleContext(DefineBlockContext.class,0);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitDefine(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(DEFINE);
			setState(73);
			match(Symbol);
			setState(74);
			match(EXTENDS);
			setState(75);
			defineType();
			setState(76);
			defineBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineTypeContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(GrumPParser.Symbol, 0); }
		public BuiltinContext builtin() {
			return getRuleContext(BuiltinContext.class,0);
		}
		public DefineTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterDefineType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitDefineType(this);
		}
	}

	public final DefineTypeContext defineType() throws RecognitionException {
		DefineTypeContext _localctx = new DefineTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defineType);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case Symbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(Symbol);
				}
				break;
			case SKETCH:
			case POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				builtin();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(GrumPParser.LBRACE, 0); }
		public DefineStatementsContext defineStatements() {
			return getRuleContext(DefineStatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GrumPParser.RBRACE, 0); }
		public DefineBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterDefineBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitDefineBlock(this);
		}
	}

	public final DefineBlockContext defineBlock() throws RecognitionException {
		DefineBlockContext _localctx = new DefineBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defineBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LBRACE);
			setState(83);
			defineStatements();
			setState(84);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineStatementsContext extends ParserRuleContext {
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public List<ParameterStatementContext> parameterStatement() {
			return getRuleContexts(ParameterStatementContext.class);
		}
		public ParameterStatementContext parameterStatement(int i) {
			return getRuleContext(ParameterStatementContext.class,i);
		}
		public List<SketchStatementContext> sketchStatement() {
			return getRuleContexts(SketchStatementContext.class);
		}
		public SketchStatementContext sketchStatement(int i) {
			return getRuleContext(SketchStatementContext.class,i);
		}
		public List<ConstraintStatementContext> constraintStatement() {
			return getRuleContexts(ConstraintStatementContext.class);
		}
		public ConstraintStatementContext constraintStatement(int i) {
			return getRuleContext(ConstraintStatementContext.class,i);
		}
		public DefineStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterDefineStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitDefineStatements(this);
		}
	}

	public final DefineStatementsContext defineStatements() throws RecognitionException {
		DefineStatementsContext _localctx = new DefineStatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defineStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTRUCTOR) {
				{
				{
				setState(86);
				constructor();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKETCH) | (1L << POINT) | (1L << CONSTANT) | (1L << CONSTRAINT) | (1L << PARAMETER) | (1L << Symbol))) != 0)) {
				{
				setState(95);
				switch (_input.LA(1)) {
				case CONSTANT:
				case PARAMETER:
					{
					setState(92);
					parameterStatement();
					}
					break;
				case SKETCH:
				case POINT:
				case Symbol:
					{
					setState(93);
					sketchStatement();
					}
					break;
				case CONSTRAINT:
					{
					setState(94);
					constraintStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(GrumPParser.CONSTRUCTOR, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(GrumPParser.LBRACE, 0); }
		public ConstructorStatmentsContext constructorStatments() {
			return getRuleContext(ConstructorStatmentsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GrumPParser.RBRACE, 0); }
		public TerminalNode Symbol() { return getToken(GrumPParser.Symbol, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(CONSTRUCTOR);
			setState(102);
			_la = _input.LA(1);
			if (_la==Symbol) {
				{
				setState(101);
				match(Symbol);
				}
			}

			setState(104);
			parameters();
			setState(105);
			match(LBRACE);
			setState(106);
			constructorStatments();
			setState(107);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorStatmentsContext extends ParserRuleContext {
		public List<ParameterStatementContext> parameterStatement() {
			return getRuleContexts(ParameterStatementContext.class);
		}
		public ParameterStatementContext parameterStatement(int i) {
			return getRuleContext(ParameterStatementContext.class,i);
		}
		public List<SketchStatementContext> sketchStatement() {
			return getRuleContexts(SketchStatementContext.class);
		}
		public SketchStatementContext sketchStatement(int i) {
			return getRuleContext(SketchStatementContext.class,i);
		}
		public List<ConstraintStatementContext> constraintStatement() {
			return getRuleContexts(ConstraintStatementContext.class);
		}
		public ConstraintStatementContext constraintStatement(int i) {
			return getRuleContext(ConstraintStatementContext.class,i);
		}
		public ConstructorStatmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorStatments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterConstructorStatments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitConstructorStatments(this);
		}
	}

	public final ConstructorStatmentsContext constructorStatments() throws RecognitionException {
		ConstructorStatmentsContext _localctx = new ConstructorStatmentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constructorStatments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKETCH) | (1L << POINT) | (1L << CONSTANT) | (1L << CONSTRAINT) | (1L << PARAMETER) | (1L << Symbol))) != 0)) {
				{
				setState(112);
				switch (_input.LA(1)) {
				case CONSTANT:
				case PARAMETER:
					{
					setState(109);
					parameterStatement();
					}
					break;
				case SKETCH:
				case POINT:
				case Symbol:
					{
					setState(110);
					sketchStatement();
					}
					break;
				case CONSTRAINT:
					{
					setState(111);
					constraintStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExampleContext extends ParserRuleContext {
		public TerminalNode EXAMPLE() { return getToken(GrumPParser.EXAMPLE, 0); }
		public TerminalNode LBRACE() { return getToken(GrumPParser.LBRACE, 0); }
		public ExampleStatementsContext exampleStatements() {
			return getRuleContext(ExampleStatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GrumPParser.RBRACE, 0); }
		public TerminalNode Symbol() { return getToken(GrumPParser.Symbol, 0); }
		public ExampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_example; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterExample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitExample(this);
		}
	}

	public final ExampleContext example() throws RecognitionException {
		ExampleContext _localctx = new ExampleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_example);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(EXAMPLE);
			setState(119);
			_la = _input.LA(1);
			if (_la==Symbol) {
				{
				setState(118);
				match(Symbol);
				}
			}

			setState(121);
			match(LBRACE);
			setState(122);
			exampleStatements();
			setState(123);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExampleStatementsContext extends ParserRuleContext {
		public List<ParameterStatementContext> parameterStatement() {
			return getRuleContexts(ParameterStatementContext.class);
		}
		public ParameterStatementContext parameterStatement(int i) {
			return getRuleContext(ParameterStatementContext.class,i);
		}
		public List<SketchStatementContext> sketchStatement() {
			return getRuleContexts(SketchStatementContext.class);
		}
		public SketchStatementContext sketchStatement(int i) {
			return getRuleContext(SketchStatementContext.class,i);
		}
		public List<ConstraintStatementContext> constraintStatement() {
			return getRuleContexts(ConstraintStatementContext.class);
		}
		public ConstraintStatementContext constraintStatement(int i) {
			return getRuleContext(ConstraintStatementContext.class,i);
		}
		public ExampleStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exampleStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterExampleStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitExampleStatements(this);
		}
	}

	public final ExampleStatementsContext exampleStatements() throws RecognitionException {
		ExampleStatementsContext _localctx = new ExampleStatementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exampleStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKETCH) | (1L << POINT) | (1L << CONSTANT) | (1L << CONSTRAINT) | (1L << PARAMETER) | (1L << Symbol))) != 0)) {
				{
				setState(128);
				switch (_input.LA(1)) {
				case CONSTANT:
				case PARAMETER:
					{
					setState(125);
					parameterStatement();
					}
					break;
				case SKETCH:
				case POINT:
				case Symbol:
					{
					setState(126);
					sketchStatement();
					}
					break;
				case CONSTRAINT:
					{
					setState(127);
					constraintStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterStatementContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(GrumPParser.PARAMETER, 0); }
		public List<ParameterAssignmentContext> parameterAssignment() {
			return getRuleContexts(ParameterAssignmentContext.class);
		}
		public ParameterAssignmentContext parameterAssignment(int i) {
			return getRuleContext(ParameterAssignmentContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(GrumPParser.SEMI, 0); }
		public TerminalNode CONSTANT() { return getToken(GrumPParser.CONSTANT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrumPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrumPParser.COMMA, i);
		}
		public ParameterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterParameterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitParameterStatement(this);
		}
	}

	public final ParameterStatementContext parameterStatement() throws RecognitionException {
		ParameterStatementContext _localctx = new ParameterStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameterStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(133);
				match(CONSTANT);
				}
			}

			setState(136);
			match(PARAMETER);
			setState(137);
			parameterAssignment();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(138);
				match(COMMA);
				setState(139);
				parameterAssignment();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterAssignmentContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(GrumPParser.Symbol, 0); }
		public TerminalNode ASSIGN() { return getToken(GrumPParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterParameterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitParameterAssignment(this);
		}
	}

	public final ParameterAssignmentContext parameterAssignment() throws RecognitionException {
		ParameterAssignmentContext _localctx = new ParameterAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameterAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(Symbol);
			setState(148);
			match(ASSIGN);
			setState(149);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SketchStatementContext extends ParserRuleContext {
		public SketchTypeContext sketchType() {
			return getRuleContext(SketchTypeContext.class,0);
		}
		public List<SketchAssignmentContext> sketchAssignment() {
			return getRuleContexts(SketchAssignmentContext.class);
		}
		public SketchAssignmentContext sketchAssignment(int i) {
			return getRuleContext(SketchAssignmentContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(GrumPParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrumPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrumPParser.COMMA, i);
		}
		public SketchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sketchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterSketchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitSketchStatement(this);
		}
	}

	public final SketchStatementContext sketchStatement() throws RecognitionException {
		SketchStatementContext _localctx = new SketchStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sketchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			sketchType();
			setState(152);
			sketchAssignment();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				sketchAssignment();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SketchAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> Symbol() { return getTokens(GrumPParser.Symbol); }
		public TerminalNode Symbol(int i) {
			return getToken(GrumPParser.Symbol, i);
		}
		public TerminalNode ASSIGN() { return getToken(GrumPParser.ASSIGN, 0); }
		public SketchConstructionContext sketchConstruction() {
			return getRuleContext(SketchConstructionContext.class,0);
		}
		public DefineBlockContext defineBlock() {
			return getRuleContext(DefineBlockContext.class,0);
		}
		public SketchAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sketchAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterSketchAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitSketchAssignment(this);
		}
	}

	public final SketchAssignmentContext sketchAssignment() throws RecognitionException {
		SketchAssignmentContext _localctx = new SketchAssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sketchAssignment);
		int _la;
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(Symbol);
				setState(163);
				match(ASSIGN);
				setState(164);
				sketchConstruction();
				setState(166);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(165);
					defineBlock();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(Symbol);
				setState(169);
				match(ASSIGN);
				setState(170);
				match(Symbol);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SketchConstructionContext extends ParserRuleContext {
		public SketchTypeContext sketchType() {
			return getRuleContext(SketchTypeContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GrumPParser.DOT, 0); }
		public TerminalNode Symbol() { return getToken(GrumPParser.Symbol, 0); }
		public SketchConstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sketchConstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterSketchConstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitSketchConstruction(this);
		}
	}

	public final SketchConstructionContext sketchConstruction() throws RecognitionException {
		SketchConstructionContext _localctx = new SketchConstructionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sketchConstruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			sketchType();
			setState(176);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(174);
				match(DOT);
				setState(175);
				match(Symbol);
				}
			}

			setState(178);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SketchTypeContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(GrumPParser.Symbol, 0); }
		public BuiltinContext builtin() {
			return getRuleContext(BuiltinContext.class,0);
		}
		public SketchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sketchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterSketchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitSketchType(this);
		}
	}

	public final SketchTypeContext sketchType() throws RecognitionException {
		SketchTypeContext _localctx = new SketchTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sketchType);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case Symbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(Symbol);
				}
				break;
			case SKETCH:
			case POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				builtin();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintStatementContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(GrumPParser.CONSTRAINT, 0); }
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(GrumPParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrumPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrumPParser.COMMA, i);
		}
		public ConstraintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterConstraintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitConstraintStatement(this);
		}
	}

	public final ConstraintStatementContext constraintStatement() throws RecognitionException {
		ConstraintStatementContext _localctx = new ConstraintStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constraintStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(CONSTRAINT);
			setState(185);
			constraint();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(186);
				match(COMMA);
				setState(187);
				constraint();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public List<ConstraintExpressionContext> constraintExpression() {
			return getRuleContexts(ConstraintExpressionContext.class);
		}
		public ConstraintExpressionContext constraintExpression(int i) {
			return getRuleContext(ConstraintExpressionContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(GrumPParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(GrumPParser.EQUALS, i);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			constraintExpression();
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				match(EQUALS);
				setState(197);
				constraintExpression();
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EQUALS );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DISTANCE() { return getToken(GrumPParser.DISTANCE, 0); }
		public TerminalNode LPAREN() { return getToken(GrumPParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(GrumPParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GrumPParser.RPAREN, 0); }
		public ConstraintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterConstraintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitConstraintExpression(this);
		}
	}

	public final ConstraintExpressionContext constraintExpression() throws RecognitionException {
		ConstraintExpressionContext _localctx = new ConstraintExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constraintExpression);
		try {
			setState(210);
			switch (_input.LA(1)) {
			case THIS:
			case SKETCH:
			case POINT:
			case SQUARE:
			case SQRT:
			case SIN:
			case COS:
			case ASIN:
			case ACOS:
			case PI:
			case GOLDEN_RATIO:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case LPAREN:
			case Symbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				expression(0);
				}
				break;
			case DISTANCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(DISTANCE);
				setState(204);
				match(LPAREN);
				setState(205);
				expression(0);
				setState(206);
				match(COMMA);
				setState(207);
				expression(0);
				setState(208);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GrumPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrumPParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrumPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrumPParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(LPAREN);
			setState(221);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SKETCH) | (1L << POINT) | (1L << SQUARE) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << ASIN) | (1L << ACOS) | (1L << PI) | (1L << GOLDEN_RATIO) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << LPAREN) | (1L << Symbol))) != 0)) {
				{
				setState(213);
				expression(0);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(214);
					match(COMMA);
					setState(215);
					expression(0);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(223);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public SketchConstructionContext sketchConstruction() {
			return getRuleContext(SketchConstructionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GrumPParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GrumPParser.RPAREN, 0); }
		public TerminalNode SQUARE() { return getToken(GrumPParser.SQUARE, 0); }
		public TerminalNode SQRT() { return getToken(GrumPParser.SQRT, 0); }
		public TerminalNode SIN() { return getToken(GrumPParser.SIN, 0); }
		public TerminalNode COS() { return getToken(GrumPParser.COS, 0); }
		public TerminalNode ASIN() { return getToken(GrumPParser.ASIN, 0); }
		public TerminalNode ACOS() { return getToken(GrumPParser.ACOS, 0); }
		public TerminalNode ADD() { return getToken(GrumPParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GrumPParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(GrumPParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GrumPParser.DIV, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(226);
				constant();
				}
				break;
			case 2:
				{
				setState(227);
				reference();
				}
				break;
			case 3:
				{
				setState(228);
				sketchConstruction();
				}
				break;
			case 4:
				{
				setState(229);
				match(LPAREN);
				setState(230);
				expression(0);
				setState(231);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(233);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQUARE) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << ASIN) | (1L << ACOS))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(234);
				match(LPAREN);
				setState(235);
				expression(0);
				setState(236);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(241);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(242);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(244);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(245);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GrumPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrumPParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrumPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrumPParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LPAREN);
			setState(260);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKETCH) | (1L << POINT) | (1L << PARAMETER) | (1L << Symbol))) != 0)) {
				{
				setState(252);
				parameter();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(253);
					match(COMMA);
					setState(254);
					parameter();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(262);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public TerminalNode Symbol() { return getToken(GrumPParser.Symbol, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			parameterType();
			setState(265);
			match(Symbol);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterTypeContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(GrumPParser.PARAMETER, 0); }
		public SketchTypeContext sketchType() {
			return getRuleContext(SketchTypeContext.class,0);
		}
		public ParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterParameterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitParameterType(this);
		}
	}

	public final ParameterTypeContext parameterType() throws RecognitionException {
		ParameterTypeContext _localctx = new ParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameterType);
		try {
			setState(269);
			switch (_input.LA(1)) {
			case PARAMETER:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(PARAMETER);
				}
				break;
			case SKETCH:
			case POINT:
			case Symbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				sketchType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltinContext extends ParserRuleContext {
		public TerminalNode SKETCH() { return getToken(GrumPParser.SKETCH, 0); }
		public TerminalNode POINT() { return getToken(GrumPParser.POINT, 0); }
		public BuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterBuiltin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitBuiltin(this);
		}
	}

	public final BuiltinContext builtin() throws RecognitionException {
		BuiltinContext _localctx = new BuiltinContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_builtin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==SKETCH || _la==POINT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(GrumPParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(GrumPParser.FloatingPointLiteral, 0); }
		public TerminalNode PI() { return getToken(GrumPParser.PI, 0); }
		public TerminalNode GOLDEN_RATIO() { return getToken(GrumPParser.GOLDEN_RATIO, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << GOLDEN_RATIO) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public List<TerminalNode> Symbol() { return getTokens(GrumPParser.Symbol); }
		public TerminalNode Symbol(int i) {
			return getToken(GrumPParser.Symbol, i);
		}
		public List<TerminalNode> DOT() { return getTokens(GrumPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GrumPParser.DOT, i);
		}
		public TerminalNode THIS() { return getToken(GrumPParser.THIS, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_reference);
		try {
			int _alt;
			setState(291);
			switch (_input.LA(1)) {
			case Symbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(Symbol);
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(276);
						match(DOT);
						setState(277);
						match(Symbol);
						}
						} 
					}
					setState(282);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(THIS);
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(284);
						match(DOT);
						setState(285);
						match(Symbol);
						}
						} 
					}
					setState(290);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolsContext extends ParserRuleContext {
		public List<TerminalNode> Symbol() { return getTokens(GrumPParser.Symbol); }
		public TerminalNode Symbol(int i) {
			return getToken(GrumPParser.Symbol, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrumPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrumPParser.COMMA, i);
		}
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).enterSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrumPListener ) ((GrumPListener)listener).exitSymbols(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_symbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(Symbol);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				match(Symbol);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\5\2>\n\2\3\2\3"+
		"\2\3\3\6\3C\n\3\r\3\16\3D\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\5\6S\n\6\3\7\3\7\3\7\3\7\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\b\3\b\3\b"+
		"\7\bb\n\b\f\b\16\be\13\b\3\t\3\t\5\ti\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\7\ns\n\n\f\n\16\nv\13\n\3\13\3\13\5\13z\n\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\7\f\u0083\n\f\f\f\16\f\u0086\13\f\3\r\5\r\u0089\n\r\3\r\3"+
		"\r\3\r\3\r\7\r\u008f\n\r\f\r\16\r\u0092\13\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\7\17\u009e\n\17\f\17\16\17\u00a1\13\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\5\20\u00a9\n\20\3\20\3\20\3\20\5\20\u00ae\n\20"+
		"\3\21\3\21\3\21\5\21\u00b3\n\21\3\21\3\21\3\22\3\22\5\22\u00b9\n\22\3"+
		"\23\3\23\3\23\3\23\7\23\u00bf\n\23\f\23\16\23\u00c2\13\23\3\23\3\23\3"+
		"\24\3\24\3\24\6\24\u00c9\n\24\r\24\16\24\u00ca\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00d5\n\25\3\26\3\26\3\26\3\26\7\26\u00db\n\26\f"+
		"\26\16\26\u00de\13\26\5\26\u00e0\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f1\n\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u00f9\n\27\f\27\16\27\u00fc\13\27\3\30\3\30"+
		"\3\30\3\30\7\30\u0102\n\30\f\30\16\30\u0105\13\30\5\30\u0107\n\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\5\32\u0110\n\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\7\35\u0119\n\35\f\35\16\35\u011c\13\35\3\35\3\35\3\35\7\35"+
		"\u0121\n\35\f\35\16\35\u0124\13\35\5\35\u0126\n\35\3\36\3\36\3\36\7\36"+
		"\u012b\n\36\f\36\16\36\u012e\13\36\3\36\2\3,\37\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\7\3\2\22\27\3\2\'(\3\2)*\3\2"+
		"\5\6\3\2\30\33\u013b\2=\3\2\2\2\4B\3\2\2\2\6H\3\2\2\2\bJ\3\2\2\2\nR\3"+
		"\2\2\2\fT\3\2\2\2\16[\3\2\2\2\20f\3\2\2\2\22t\3\2\2\2\24w\3\2\2\2\26\u0084"+
		"\3\2\2\2\30\u0088\3\2\2\2\32\u0095\3\2\2\2\34\u0099\3\2\2\2\36\u00ad\3"+
		"\2\2\2 \u00af\3\2\2\2\"\u00b8\3\2\2\2$\u00ba\3\2\2\2&\u00c5\3\2\2\2(\u00d4"+
		"\3\2\2\2*\u00d6\3\2\2\2,\u00f0\3\2\2\2.\u00fd\3\2\2\2\60\u010a\3\2\2\2"+
		"\62\u010f\3\2\2\2\64\u0111\3\2\2\2\66\u0113\3\2\2\28\u0125\3\2\2\2:\u0127"+
		"\3\2\2\2<>\5\4\3\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\2\2\3@\3\3\2\2\2"+
		"AC\5\6\4\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\5\3\2\2\2FI\5\b\5"+
		"\2GI\5\24\13\2HF\3\2\2\2HG\3\2\2\2I\7\3\2\2\2JK\7\f\2\2KL\7+\2\2LM\7\21"+
		"\2\2MN\5\n\6\2NO\5\f\7\2O\t\3\2\2\2PS\7+\2\2QS\5\64\33\2RP\3\2\2\2RQ\3"+
		"\2\2\2S\13\3\2\2\2TU\7\36\2\2UV\5\16\b\2VW\7\37\2\2W\r\3\2\2\2XZ\5\20"+
		"\t\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\c\3\2\2\2][\3\2\2\2^b\5"+
		"\30\r\2_b\5\34\17\2`b\5$\23\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2be\3\2\2\2"+
		"ca\3\2\2\2cd\3\2\2\2d\17\3\2\2\2ec\3\2\2\2fh\7\n\2\2gi\7+\2\2hg\3\2\2"+
		"\2hi\3\2\2\2ij\3\2\2\2jk\5.\30\2kl\7\36\2\2lm\5\22\n\2mn\7\37\2\2n\21"+
		"\3\2\2\2os\5\30\r\2ps\5\34\17\2qs\5$\23\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2"+
		"\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\23\3\2\2\2vt\3\2\2\2wy\7\4\2\2xz\7+"+
		"\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\36\2\2|}\5\26\f\2}~\7\37\2\2~\25"+
		"\3\2\2\2\177\u0083\5\30\r\2\u0080\u0083\5\34\17\2\u0081\u0083\5$\23\2"+
		"\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\27\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0089\7\b\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\16\2\2\u008b\u0090\5\32\16\2\u008c"+
		"\u008d\7#\2\2\u008d\u008f\5\32\16\2\u008e\u008c\3\2\2\2\u008f\u0092\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\7\"\2\2\u0094\31\3\2\2\2\u0095\u0096\7+\2\2"+
		"\u0096\u0097\7&\2\2\u0097\u0098\5,\27\2\u0098\33\3\2\2\2\u0099\u009a\5"+
		"\"\22\2\u009a\u009f\5\36\20\2\u009b\u009c\7#\2\2\u009c\u009e\5\36\20\2"+
		"\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\"\2\2\u00a3"+
		"\35\3\2\2\2\u00a4\u00a5\7+\2\2\u00a5\u00a6\7&\2\2\u00a6\u00a8\5 \21\2"+
		"\u00a7\u00a9\5\f\7\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ae"+
		"\3\2\2\2\u00aa\u00ab\7+\2\2\u00ab\u00ac\7&\2\2\u00ac\u00ae\7+\2\2\u00ad"+
		"\u00a4\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\37\3\2\2\2\u00af\u00b2\5\"\22"+
		"\2\u00b0\u00b1\7$\2\2\u00b1\u00b3\7+\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\5*\26\2\u00b5!\3\2\2\2\u00b6"+
		"\u00b9\7+\2\2\u00b7\u00b9\5\64\33\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9#\3\2\2\2\u00ba\u00bb\7\t\2\2\u00bb\u00c0\5&\24\2\u00bc\u00bd"+
		"\7#\2\2\u00bd\u00bf\5&\24\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00c4\7\"\2\2\u00c4%\3\2\2\2\u00c5\u00c8\5(\25\2\u00c6\u00c7"+
		"\7%\2\2\u00c7\u00c9\5(\25\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\'\3\2\2\2\u00cc\u00d5\5,\27\2"+
		"\u00cd\u00ce\7\7\2\2\u00ce\u00cf\7\34\2\2\u00cf\u00d0\5,\27\2\u00d0\u00d1"+
		"\7#\2\2\u00d1\u00d2\5,\27\2\u00d2\u00d3\7\35\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00cc\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d5)\3\2\2\2\u00d6\u00df\7\34\2\2"+
		"\u00d7\u00dc\5,\27\2\u00d8\u00d9\7#\2\2\u00d9\u00db\5,\27\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\35\2\2\u00e2+\3\2\2\2\u00e3\u00e4"+
		"\b\27\1\2\u00e4\u00f1\5\66\34\2\u00e5\u00f1\58\35\2\u00e6\u00f1\5 \21"+
		"\2\u00e7\u00e8\7\34\2\2\u00e8\u00e9\5,\27\2\u00e9\u00ea\7\35\2\2\u00ea"+
		"\u00f1\3\2\2\2\u00eb\u00ec\t\2\2\2\u00ec\u00ed\7\34\2\2\u00ed\u00ee\5"+
		",\27\2\u00ee\u00ef\7\35\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00e3\3\2\2\2\u00f0"+
		"\u00e5\3\2\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f0\u00eb\3\2"+
		"\2\2\u00f1\u00fa\3\2\2\2\u00f2\u00f3\f\5\2\2\u00f3\u00f4\t\3\2\2\u00f4"+
		"\u00f9\5,\27\6\u00f5\u00f6\f\4\2\2\u00f6\u00f7\t\4\2\2\u00f7\u00f9\5,"+
		"\27\5\u00f8\u00f2\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb-\3\2\2\2\u00fc\u00fa\3\2\2\2"+
		"\u00fd\u0106\7\34\2\2\u00fe\u0103\5\60\31\2\u00ff\u0100\7#\2\2\u0100\u0102"+
		"\5\60\31\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u00fe"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7\35\2\2"+
		"\u0109/\3\2\2\2\u010a\u010b\5\62\32\2\u010b\u010c\7+\2\2\u010c\61\3\2"+
		"\2\2\u010d\u0110\7\16\2\2\u010e\u0110\5\"\22\2\u010f\u010d\3\2\2\2\u010f"+
		"\u010e\3\2\2\2\u0110\63\3\2\2\2\u0111\u0112\t\5\2\2\u0112\65\3\2\2\2\u0113"+
		"\u0114\t\6\2\2\u0114\67\3\2\2\2\u0115\u011a\7+\2\2\u0116\u0117\7$\2\2"+
		"\u0117\u0119\7+\2\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0126\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u0122\7\3\2\2\u011e\u011f\7$\2\2\u011f\u0121\7+\2\2\u0120\u011e\3\2\2"+
		"\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0126"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0115\3\2\2\2\u0125\u011d\3\2\2\2\u0126"+
		"9\3\2\2\2\u0127\u012c\7+\2\2\u0128\u0129\7#\2\2\u0129\u012b\7+\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d;\3\2\2\2\u012e\u012c\3\2\2\2%=DHR[achrty\u0082\u0084\u0088"+
		"\u0090\u009f\u00a8\u00ad\u00b2\u00b8\u00c0\u00ca\u00d4\u00dc\u00df\u00f0"+
		"\u00f8\u00fa\u0103\u0106\u010f\u011a\u0122\u0125\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}