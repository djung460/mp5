// Generated from C:/Users/Dooj/Desktop/CPEN 221/mp5/src/ca/ece/ubc/cpen221/mp5/antlr\Query.g4 by ANTLR 4.5.1
package ca.ece.ubc.cpen221.mp5.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, RANGE=6, LPAREN=7, RPAREN=8, OR=9, 
		AND=10, STRING=11, IN=12, CATEGORY=13, NAME=14, RATING=15, PRICE=16, JSONSTRING=17, 
		WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "RANGE", "LPAREN", "RPAREN", "OR", 
		"AND", "STRING", "IN", "CATEGORY", "NAME", "RATING", "PRICE", "JSONSTRING", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'randomReview'", "'getRestaurant'", "'addRestaurant'", "'addUser'", 
		"'addReview'", null, "'('", "')'", "'||'", "'&&'", null, "'in'", "'category'", 
		"'name'", "'rating'", "'price'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "RANGE", "LPAREN", "RPAREN", "OR", 
		"AND", "STRING", "IN", "CATEGORY", "NAME", "RATING", "PRICE", "JSONSTRING", 
		"WS"
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


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        //removeErrorListeners();

	        addErrorListener(new ExceptionThrowingErrorListener());
	    }

	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public QueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Query.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\6\fu\n\f\r\f\16\fv\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\7\22\u009b\n\22\f\22\16\22\u009e\13\22\3\22\3\22"+
		"\3\23\6\23\u00a3\n\23\r\23\16\23\u00a4\3\23\3\23\2\2\24\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\3\2\6\3\2\63\67\7\2\"\"))\62;C\\c|\4\2>>@@\5\2\13\f\17\17\"\"\u00aa"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\64\3\2\2\2\7B\3\2\2\2\tP\3\2\2\2\13X\3\2"+
		"\2\2\rb\3\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25o\3\2\2\2\27r\3"+
		"\2\2\2\31z\3\2\2\2\33}\3\2\2\2\35\u0086\3\2\2\2\37\u008b\3\2\2\2!\u0092"+
		"\3\2\2\2#\u0098\3\2\2\2%\u00a2\3\2\2\2\'(\7t\2\2()\7c\2\2)*\7p\2\2*+\7"+
		"f\2\2+,\7q\2\2,-\7o\2\2-.\7T\2\2./\7g\2\2/\60\7x\2\2\60\61\7k\2\2\61\62"+
		"\7g\2\2\62\63\7y\2\2\63\4\3\2\2\2\64\65\7i\2\2\65\66\7g\2\2\66\67\7v\2"+
		"\2\678\7T\2\289\7g\2\29:\7u\2\2:;\7v\2\2;<\7c\2\2<=\7w\2\2=>\7t\2\2>?"+
		"\7c\2\2?@\7p\2\2@A\7v\2\2A\6\3\2\2\2BC\7c\2\2CD\7f\2\2DE\7f\2\2EF\7T\2"+
		"\2FG\7g\2\2GH\7u\2\2HI\7v\2\2IJ\7c\2\2JK\7w\2\2KL\7t\2\2LM\7c\2\2MN\7"+
		"p\2\2NO\7v\2\2O\b\3\2\2\2PQ\7c\2\2QR\7f\2\2RS\7f\2\2ST\7W\2\2TU\7u\2\2"+
		"UV\7g\2\2VW\7t\2\2W\n\3\2\2\2XY\7c\2\2YZ\7f\2\2Z[\7f\2\2[\\\7T\2\2\\]"+
		"\7g\2\2]^\7x\2\2^_\7k\2\2_`\7g\2\2`a\7y\2\2a\f\3\2\2\2bc\t\2\2\2cd\7\60"+
		"\2\2de\7\60\2\2ef\3\2\2\2fg\t\2\2\2g\16\3\2\2\2hi\7*\2\2i\20\3\2\2\2j"+
		"k\7+\2\2k\22\3\2\2\2lm\7~\2\2mn\7~\2\2n\24\3\2\2\2op\7(\2\2pq\7(\2\2q"+
		"\26\3\2\2\2rt\7$\2\2su\t\3\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"wx\3\2\2\2xy\7$\2\2y\30\3\2\2\2z{\7k\2\2{|\7p\2\2|\32\3\2\2\2}~\7e\2\2"+
		"~\177\7c\2\2\177\u0080\7v\2\2\u0080\u0081\7g\2\2\u0081\u0082\7i\2\2\u0082"+
		"\u0083\7q\2\2\u0083\u0084\7t\2\2\u0084\u0085\7{\2\2\u0085\34\3\2\2\2\u0086"+
		"\u0087\7p\2\2\u0087\u0088\7c\2\2\u0088\u0089\7o\2\2\u0089\u008a\7g\2\2"+
		"\u008a\36\3\2\2\2\u008b\u008c\7t\2\2\u008c\u008d\7c\2\2\u008d\u008e\7"+
		"v\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091\7i\2\2\u0091 "+
		"\3\2\2\2\u0092\u0093\7r\2\2\u0093\u0094\7t\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7e\2\2\u0096\u0097\7g\2\2\u0097\"\3\2\2\2\u0098\u009c\7}\2\2\u0099"+
		"\u009b\n\4\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\7\177\2\2\u00a0$\3\2\2\2\u00a1\u00a3\t\5\2\2\u00a2\u00a1\3\2\2"+
		"\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\b\23\2\2\u00a7&\3\2\2\2\7\2tv\u009c\u00a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}