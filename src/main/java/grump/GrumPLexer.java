package grump;
// Generated from GrumP.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrumPLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"THIS", "EXAMPLE", "SKETCH", "POINT", "DISTANCE", "CONSTANT", "CONSTRAINT", 
		"CONSTRUCTOR", "DECLARE", "DEFINE", "DISPLAY", "PARAMETER", "EQUATION", 
		"EXPRESSION", "EXTENDS", "SQUARE", "SQRT", "SIN", "COS", "ASIN", "ACOS", 
		"PI", "GOLDEN_RATIO", "IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", 
		"Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
		"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", 
		"OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", "BinaryDigit", 
		"BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "EQUALS", "ASSIGN", 
		"ADD", "SUB", "MUL", "DIV", "Symbol", "LETTER", "LETTER_OR_NUMBER", "WS", 
		"LINE_COMMENT"
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


	public GrumPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrumP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u0258\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\5\31\u015a\n\31\3\32\3\32\5\32\u015e\n\32\3\33"+
		"\3\33\5\33\u0162\n\33\3\34\3\34\5\34\u0166\n\34\3\35\3\35\5\35\u016a\n"+
		"\35\3\36\3\36\3\37\3\37\3\37\5\37\u0171\n\37\3\37\3\37\3\37\5\37\u0176"+
		"\n\37\5\37\u0178\n\37\3 \3 \5 \u017c\n \3 \5 \u017f\n \3!\3!\5!\u0183"+
		"\n!\3\"\3\"\3#\6#\u0188\n#\r#\16#\u0189\3$\3$\5$\u018e\n$\3%\6%\u0191"+
		"\n%\r%\16%\u0192\3&\3&\3&\3&\3\'\3\'\5\'\u019b\n\'\3\'\5\'\u019e\n\'\3"+
		"(\3(\3)\6)\u01a3\n)\r)\16)\u01a4\3*\3*\5*\u01a9\n*\3+\3+\5+\u01ad\n+\3"+
		"+\3+\3,\3,\5,\u01b3\n,\3,\5,\u01b6\n,\3-\3-\3.\6.\u01bb\n.\r.\16.\u01bc"+
		"\3/\3/\5/\u01c1\n/\3\60\3\60\3\60\3\60\3\61\3\61\5\61\u01c9\n\61\3\61"+
		"\5\61\u01cc\n\61\3\62\3\62\3\63\6\63\u01d1\n\63\r\63\16\63\u01d2\3\64"+
		"\3\64\5\64\u01d7\n\64\3\65\3\65\5\65\u01db\n\65\3\66\3\66\3\66\5\66\u01e0"+
		"\n\66\3\66\5\66\u01e3\n\66\3\66\5\66\u01e6\n\66\3\66\3\66\3\66\5\66\u01eb"+
		"\n\66\3\66\5\66\u01ee\n\66\3\66\3\66\3\66\5\66\u01f3\n\66\3\66\3\66\3"+
		"\66\5\66\u01f8\n\66\3\67\3\67\3\67\38\38\39\59\u0200\n9\39\39\3:\3:\3"+
		";\3;\3<\3<\3<\5<\u020b\n<\3=\3=\5=\u020f\n=\3=\3=\3=\5=\u0214\n=\3=\3"+
		"=\5=\u0218\n=\3>\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3H\3H\3I\3I\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\7O\u0240\n"+
		"O\fO\16O\u0243\13O\3P\3P\3Q\3Q\3R\6R\u024a\nR\rR\16R\u024b\3R\3R\3S\3"+
		"S\7S\u0252\nS\fS\16S\u0255\13S\3S\3S\2\2T\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q"+
		"\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\33k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2"+
		"\177\34\u0081\35\u0083\36\u0085\37\u0087 \u0089!\u008b\"\u008d#\u008f"+
		"$\u0091%\u0093&\u0095\'\u0097(\u0099)\u009b*\u009d+\u009f\2\u00a1\2\u00a3"+
		",\u00a5-\3\2\21\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3"+
		"\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\6\2&&C\\aac|\7\2&&\62;C\\"+
		"aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u025f\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2i\3\2\2\2"+
		"\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\3\u00a7\3\2\2\2\5\u00ac\3\2\2\2\7\u00b4\3\2\2\2\t\u00bb\3\2\2\2\13"+
		"\u00c1\3\2\2\2\r\u00ca\3\2\2\2\17\u00d3\3\2\2\2\21\u00de\3\2\2\2\23\u00ea"+
		"\3\2\2\2\25\u00f2\3\2\2\2\27\u00f9\3\2\2\2\31\u0101\3\2\2\2\33\u010b\3"+
		"\2\2\2\35\u0114\3\2\2\2\37\u011f\3\2\2\2!\u0127\3\2\2\2#\u012e\3\2\2\2"+
		"%\u0133\3\2\2\2\'\u0137\3\2\2\2)\u013b\3\2\2\2+\u0140\3\2\2\2-\u0145\3"+
		"\2\2\2/\u0148\3\2\2\2\61\u0159\3\2\2\2\63\u015b\3\2\2\2\65\u015f\3\2\2"+
		"\2\67\u0163\3\2\2\29\u0167\3\2\2\2;\u016b\3\2\2\2=\u0177\3\2\2\2?\u0179"+
		"\3\2\2\2A\u0182\3\2\2\2C\u0184\3\2\2\2E\u0187\3\2\2\2G\u018d\3\2\2\2I"+
		"\u0190\3\2\2\2K\u0194\3\2\2\2M\u0198\3\2\2\2O\u019f\3\2\2\2Q\u01a2\3\2"+
		"\2\2S\u01a8\3\2\2\2U\u01aa\3\2\2\2W\u01b0\3\2\2\2Y\u01b7\3\2\2\2[\u01ba"+
		"\3\2\2\2]\u01c0\3\2\2\2_\u01c2\3\2\2\2a\u01c6\3\2\2\2c\u01cd\3\2\2\2e"+
		"\u01d0\3\2\2\2g\u01d6\3\2\2\2i\u01da\3\2\2\2k\u01f7\3\2\2\2m\u01f9\3\2"+
		"\2\2o\u01fc\3\2\2\2q\u01ff\3\2\2\2s\u0203\3\2\2\2u\u0205\3\2\2\2w\u0207"+
		"\3\2\2\2y\u0217\3\2\2\2{\u0219\3\2\2\2}\u021c\3\2\2\2\177\u021e\3\2\2"+
		"\2\u0081\u0220\3\2\2\2\u0083\u0222\3\2\2\2\u0085\u0224\3\2\2\2\u0087\u0226"+
		"\3\2\2\2\u0089\u0228\3\2\2\2\u008b\u022a\3\2\2\2\u008d\u022c\3\2\2\2\u008f"+
		"\u022e\3\2\2\2\u0091\u0230\3\2\2\2\u0093\u0232\3\2\2\2\u0095\u0235\3\2"+
		"\2\2\u0097\u0237\3\2\2\2\u0099\u0239\3\2\2\2\u009b\u023b\3\2\2\2\u009d"+
		"\u023d\3\2\2\2\u009f\u0244\3\2\2\2\u00a1\u0246\3\2\2\2\u00a3\u0249\3\2"+
		"\2\2\u00a5\u024f\3\2\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa"+
		"\7k\2\2\u00aa\u00ab\7u\2\2\u00ab\4\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae"+
		"\7z\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7r\2\2\u00b1"+
		"\u00b2\7n\2\2\u00b2\u00b3\7g\2\2\u00b3\6\3\2\2\2\u00b4\u00b5\7U\2\2\u00b5"+
		"\u00b6\7m\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7e\2\2"+
		"\u00b9\u00ba\7j\2\2\u00ba\b\3\2\2\2\u00bb\u00bc\7R\2\2\u00bc\u00bd\7q"+
		"\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7v\2\2\u00c0\n"+
		"\3\2\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7u\2\2\u00c4"+
		"\u00c5\7v\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7e\2\2"+
		"\u00c8\u00c9\7g\2\2\u00c9\f\3\2\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7q"+
		"\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2\16\3\2\2\2\u00d3\u00d4"+
		"\7e\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7u\2\2\u00d7"+
		"\u00d8\7v\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7k\2\2"+
		"\u00db\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\20\3\2\2\2\u00de\u00df\7"+
		"e\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3"+
		"\7v\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7e\2\2\u00e6"+
		"\u00e7\7v\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7t\2\2\u00e9\22\3\2\2\2\u00ea"+
		"\u00eb\7f\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7n\2\2"+
		"\u00ee\u00ef\7c\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7g\2\2\u00f1\24\3\2"+
		"\2\2\u00f2\u00f3\7f\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6"+
		"\7k\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7g\2\2\u00f8\26\3\2\2\2\u00f9\u00fa"+
		"\7f\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7r\2\2\u00fd"+
		"\u00fe\7n\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7{\2\2\u0100\30\3\2\2\2\u0101"+
		"\u0102\7r\2\2\u0102\u0103\7c\2\2\u0103\u0104\7t\2\2\u0104\u0105\7c\2\2"+
		"\u0105\u0106\7o\2\2\u0106\u0107\7g\2\2\u0107\u0108\7v\2\2\u0108\u0109"+
		"\7g\2\2\u0109\u010a\7t\2\2\u010a\32\3\2\2\2\u010b\u010c\7g\2\2\u010c\u010d"+
		"\7s\2\2\u010d\u010e\7w\2\2\u010e\u010f\7c\2\2\u010f\u0110\7v\2\2\u0110"+
		"\u0111\7k\2\2\u0111\u0112\7q\2\2\u0112\u0113\7p\2\2\u0113\34\3\2\2\2\u0114"+
		"\u0115\7g\2\2\u0115\u0116\7z\2\2\u0116\u0117\7r\2\2\u0117\u0118\7t\2\2"+
		"\u0118\u0119\7g\2\2\u0119\u011a\7u\2\2\u011a\u011b\7u\2\2\u011b\u011c"+
		"\7k\2\2\u011c\u011d\7q\2\2\u011d\u011e\7p\2\2\u011e\36\3\2\2\2\u011f\u0120"+
		"\7g\2\2\u0120\u0121\7z\2\2\u0121\u0122\7v\2\2\u0122\u0123\7g\2\2\u0123"+
		"\u0124\7p\2\2\u0124\u0125\7f\2\2\u0125\u0126\7u\2\2\u0126 \3\2\2\2\u0127"+
		"\u0128\7u\2\2\u0128\u0129\7s\2\2\u0129\u012a\7w\2\2\u012a\u012b\7c\2\2"+
		"\u012b\u012c\7t\2\2\u012c\u012d\7g\2\2\u012d\"\3\2\2\2\u012e\u012f\7u"+
		"\2\2\u012f\u0130\7s\2\2\u0130\u0131\7t\2\2\u0131\u0132\7v\2\2\u0132$\3"+
		"\2\2\2\u0133\u0134\7u\2\2\u0134\u0135\7k\2\2\u0135\u0136\7p\2\2\u0136"+
		"&\3\2\2\2\u0137\u0138\7e\2\2\u0138\u0139\7q\2\2\u0139\u013a\7u\2\2\u013a"+
		"(\3\2\2\2\u013b\u013c\7c\2\2\u013c\u013d\7u\2\2\u013d\u013e\7k\2\2\u013e"+
		"\u013f\7p\2\2\u013f*\3\2\2\2\u0140\u0141\7c\2\2\u0141\u0142\7e\2\2\u0142"+
		"\u0143\7q\2\2\u0143\u0144\7u\2\2\u0144,\3\2\2\2\u0145\u0146\7R\2\2\u0146"+
		"\u0147\7K\2\2\u0147.\3\2\2\2\u0148\u0149\7I\2\2\u0149\u014a\7Q\2\2\u014a"+
		"\u014b\7N\2\2\u014b\u014c\7F\2\2\u014c\u014d\7G\2\2\u014d\u014e\7P\2\2"+
		"\u014e\u014f\7a\2\2\u014f\u0150\7T\2\2\u0150\u0151\7C\2\2\u0151\u0152"+
		"\7V\2\2\u0152\u0153\7K\2\2\u0153\u0154\7Q\2\2\u0154\60\3\2\2\2\u0155\u015a"+
		"\5\63\32\2\u0156\u015a\5\65\33\2\u0157\u015a\5\67\34\2\u0158\u015a\59"+
		"\35\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a\62\3\2\2\2\u015b\u015d\5=\37\2\u015c\u015e\5;\36"+
		"\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\64\3\2\2\2\u015f\u0161"+
		"\5K&\2\u0160\u0162\5;\36\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\66\3\2\2\2\u0163\u0165\5U+\2\u0164\u0166\5;\36\2\u0165\u0164\3\2\2\2"+
		"\u0165\u0166\3\2\2\2\u01668\3\2\2\2\u0167\u0169\5_\60\2\u0168\u016a\5"+
		";\36\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a:\3\2\2\2\u016b\u016c"+
		"\t\2\2\2\u016c<\3\2\2\2\u016d\u0178\7\62\2\2\u016e\u0175\5C\"\2\u016f"+
		"\u0171\5? \2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0176\3\2\2"+
		"\2\u0172\u0173\5I%\2\u0173\u0174\5? \2\u0174\u0176\3\2\2\2\u0175\u0170"+
		"\3\2\2\2\u0175\u0172\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u016d\3\2\2\2\u0177"+
		"\u016e\3\2\2\2\u0178>\3\2\2\2\u0179\u017e\5A!\2\u017a\u017c\5E#\2\u017b"+
		"\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\5A"+
		"!\2\u017e\u017b\3\2\2\2\u017e\u017f\3\2\2\2\u017f@\3\2\2\2\u0180\u0183"+
		"\7\62\2\2\u0181\u0183\5C\"\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183"+
		"B\3\2\2\2\u0184\u0185\t\3\2\2\u0185D\3\2\2\2\u0186\u0188\5G$\2\u0187\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"F\3\2\2\2\u018b\u018e\5A!\2\u018c\u018e\7a\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018c\3\2\2\2\u018eH\3\2\2\2\u018f\u0191\7a\2\2\u0190\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193J\3\2\2\2"+
		"\u0194\u0195\7\62\2\2\u0195\u0196\t\4\2\2\u0196\u0197\5M\'\2\u0197L\3"+
		"\2\2\2\u0198\u019d\5O(\2\u0199\u019b\5Q)\2\u019a\u0199\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\5O(\2\u019d\u019a\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019eN\3\2\2\2\u019f\u01a0\t\5\2\2\u01a0P\3\2\2\2\u01a1"+
		"\u01a3\5S*\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2"+
		"\2\u01a4\u01a5\3\2\2\2\u01a5R\3\2\2\2\u01a6\u01a9\5O(\2\u01a7\u01a9\7"+
		"a\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9T\3\2\2\2\u01aa\u01ac"+
		"\7\62\2\2\u01ab\u01ad\5I%\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\5W,\2\u01afV\3\2\2\2\u01b0\u01b5\5Y-\2\u01b1"+
		"\u01b3\5[.\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2"+
		"\2\u01b4\u01b6\5Y-\2\u01b5\u01b2\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6X\3"+
		"\2\2\2\u01b7\u01b8\t\6\2\2\u01b8Z\3\2\2\2\u01b9\u01bb\5]/\2\u01ba\u01b9"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\\\3\2\2\2\u01be\u01c1\5Y-\2\u01bf\u01c1\7a\2\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01bf\3\2\2\2\u01c1^\3\2\2\2\u01c2\u01c3\7\62\2\2\u01c3\u01c4\t\7\2\2"+
		"\u01c4\u01c5\5a\61\2\u01c5`\3\2\2\2\u01c6\u01cb\5c\62\2\u01c7\u01c9\5"+
		"e\63\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01cc\5c\62\2\u01cb\u01c8\3\2\2\2\u01cb\u01cc\3\2\2\2\u01ccb\3\2\2\2"+
		"\u01cd\u01ce\t\b\2\2\u01ced\3\2\2\2\u01cf\u01d1\5g\64\2\u01d0\u01cf\3"+
		"\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"f\3\2\2\2\u01d4\u01d7\5c\62\2\u01d5\u01d7\7a\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d5\3\2\2\2\u01d7h\3\2\2\2\u01d8\u01db\5k\66\2\u01d9\u01db\5w<\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01dbj\3\2\2\2\u01dc\u01dd\5? \2\u01dd"+
		"\u01df\7\60\2\2\u01de\u01e0\5? \2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3\5m\67\2\u01e2\u01e1\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e6\5u;\2\u01e5\u01e4\3\2\2"+
		"\2\u01e5\u01e6\3\2\2\2\u01e6\u01f8\3\2\2\2\u01e7\u01e8\7\60\2\2\u01e8"+
		"\u01ea\5? \2\u01e9\u01eb\5m\67\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2"+
		"\2\u01eb\u01ed\3\2\2\2\u01ec\u01ee\5u;\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\u01f8\3\2\2\2\u01ef\u01f0\5? \2\u01f0\u01f2\5m\67\2\u01f1"+
		"\u01f3\5u;\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f8\3\2\2"+
		"\2\u01f4\u01f5\5? \2\u01f5\u01f6\5u;\2\u01f6\u01f8\3\2\2\2\u01f7\u01dc"+
		"\3\2\2\2\u01f7\u01e7\3\2\2\2\u01f7\u01ef\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f8"+
		"l\3\2\2\2\u01f9\u01fa\5o8\2\u01fa\u01fb\5q9\2\u01fbn\3\2\2\2\u01fc\u01fd"+
		"\t\t\2\2\u01fdp\3\2\2\2\u01fe\u0200\5s:\2\u01ff\u01fe\3\2\2\2\u01ff\u0200"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\5? \2\u0202r\3\2\2\2\u0203\u0204"+
		"\t\n\2\2\u0204t\3\2\2\2\u0205\u0206\t\13\2\2\u0206v\3\2\2\2\u0207\u0208"+
		"\5y=\2\u0208\u020a\5{>\2\u0209\u020b\5u;\2\u020a\u0209\3\2\2\2\u020a\u020b"+
		"\3\2\2\2\u020bx\3\2\2\2\u020c\u020e\5K&\2\u020d\u020f\7\60\2\2\u020e\u020d"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0218\3\2\2\2\u0210\u0211\7\62\2\2"+
		"\u0211\u0213\t\4\2\2\u0212\u0214\5M\'\2\u0213\u0212\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\7\60\2\2\u0216\u0218\5M\'\2\u0217"+
		"\u020c\3\2\2\2\u0217\u0210\3\2\2\2\u0218z\3\2\2\2\u0219\u021a\5}?\2\u021a"+
		"\u021b\5q9\2\u021b|\3\2\2\2\u021c\u021d\t\f\2\2\u021d~\3\2\2\2\u021e\u021f"+
		"\7*\2\2\u021f\u0080\3\2\2\2\u0220\u0221\7+\2\2\u0221\u0082\3\2\2\2\u0222"+
		"\u0223\7}\2\2\u0223\u0084\3\2\2\2\u0224\u0225\7\177\2\2\u0225\u0086\3"+
		"\2\2\2\u0226\u0227\7]\2\2\u0227\u0088\3\2\2\2\u0228\u0229\7_\2\2\u0229"+
		"\u008a\3\2\2\2\u022a\u022b\7=\2\2\u022b\u008c\3\2\2\2\u022c\u022d\7.\2"+
		"\2\u022d\u008e\3\2\2\2\u022e\u022f\7\60\2\2\u022f\u0090\3\2\2\2\u0230"+
		"\u0231\7?\2\2\u0231\u0092\3\2\2\2\u0232\u0233\7<\2\2\u0233\u0234\7?\2"+
		"\2\u0234\u0094\3\2\2\2\u0235\u0236\7-\2\2\u0236\u0096\3\2\2\2\u0237\u0238"+
		"\7/\2\2\u0238\u0098\3\2\2\2\u0239\u023a\7,\2\2\u023a\u009a\3\2\2\2\u023b"+
		"\u023c\7\61\2\2\u023c\u009c\3\2\2\2\u023d\u0241\5\u009fP\2\u023e\u0240"+
		"\5\u00a1Q\2\u023f\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2"+
		"\2\u0241\u0242\3\2\2\2\u0242\u009e\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0245"+
		"\t\r\2\2\u0245\u00a0\3\2\2\2\u0246\u0247\t\16\2\2\u0247\u00a2\3\2\2\2"+
		"\u0248\u024a\t\17\2\2\u0249\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u0249"+
		"\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\bR\2\2\u024e"+
		"\u00a4\3\2\2\2\u024f\u0253\7%\2\2\u0250\u0252\n\20\2\2\u0251\u0250\3\2"+
		"\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\u0256\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0257\bS\2\2\u0257\u00a6\3\2"+
		"\2\2.\2\u0159\u015d\u0161\u0165\u0169\u0170\u0175\u0177\u017b\u017e\u0182"+
		"\u0189\u018d\u0192\u019a\u019d\u01a4\u01a8\u01ac\u01b2\u01b5\u01bc\u01c0"+
		"\u01c8\u01cb\u01d2\u01d6\u01da\u01df\u01e2\u01e5\u01ea\u01ed\u01f2\u01f7"+
		"\u01ff\u020a\u020e\u0213\u0217\u0241\u024b\u0253\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}