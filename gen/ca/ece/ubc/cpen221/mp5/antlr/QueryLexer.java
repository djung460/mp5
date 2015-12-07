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
		RANGE=1, LPAREN=2, RPAREN=3, OR=4, AND=5, STRING=6, IN=7, CATEGORY=8, 
		NAME=9, RATING=10, PRICE=11, WS=12, RANDOMREVIEW=13, GETRESTAURANT=14, 
		ADDRESTAURANT=15, ADDUSER=16, ADDREVIEW=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"RANGE", "LPAREN", "RPAREN", "OR", "AND", "STRING", "IN", "CATEGORY", 
		"NAME", "RATING", "PRICE", "WS", "RANDOMREVIEW", "GETRESTAURANT", "ADDRESTAURANT", 
		"ADDUSER", "ADDREVIEW"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'('", "')'", "'||'", "'&&'", null, "'in'", "'category'", 
		"'name'", "'rating'", "'price'", null, "'randomReview'", "'getRestaurant'", 
		"'addRestaurant'", "'addUser'", "'addReview'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "RANGE", "LPAREN", "RPAREN", "OR", "AND", "STRING", "IN", "CATEGORY", 
		"NAME", "RATING", "PRICE", "WS", "RANDOMREVIEW", "GETRESTAURANT", "ADDRESTAURANT", 
		"ADDUSER", "ADDREVIEW"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\6\78\n\7\r\7\16\79\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\r]\n\r\r\r\16\r^\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23\3\2\5\3\2\63\67\6\2\"\"\62;C\\c|\5\2\13\f\17\17\""+
		"\"\u009e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3%\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\62\3\2\2"+
		"\2\r\65\3\2\2\2\17=\3\2\2\2\21@\3\2\2\2\23I\3\2\2\2\25N\3\2\2\2\27U\3"+
		"\2\2\2\31\\\3\2\2\2\33b\3\2\2\2\35o\3\2\2\2\37}\3\2\2\2!\u008b\3\2\2\2"+
		"#\u0093\3\2\2\2%&\t\2\2\2&\'\7\60\2\2\'(\7\60\2\2()\3\2\2\2)*\t\2\2\2"+
		"*\4\3\2\2\2+,\7*\2\2,\6\3\2\2\2-.\7+\2\2.\b\3\2\2\2/\60\7~\2\2\60\61\7"+
		"~\2\2\61\n\3\2\2\2\62\63\7(\2\2\63\64\7(\2\2\64\f\3\2\2\2\65\67\7$\2\2"+
		"\668\t\3\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;"+
		"<\7$\2\2<\16\3\2\2\2=>\7k\2\2>?\7p\2\2?\20\3\2\2\2@A\7e\2\2AB\7c\2\2B"+
		"C\7v\2\2CD\7g\2\2DE\7i\2\2EF\7q\2\2FG\7t\2\2GH\7{\2\2H\22\3\2\2\2IJ\7"+
		"p\2\2JK\7c\2\2KL\7o\2\2LM\7g\2\2M\24\3\2\2\2NO\7t\2\2OP\7c\2\2PQ\7v\2"+
		"\2QR\7k\2\2RS\7p\2\2ST\7i\2\2T\26\3\2\2\2UV\7r\2\2VW\7t\2\2WX\7k\2\2X"+
		"Y\7e\2\2YZ\7g\2\2Z\30\3\2\2\2[]\t\4\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_`\3\2\2\2`a\b\r\2\2a\32\3\2\2\2bc\7t\2\2cd\7c\2\2de\7p\2"+
		"\2ef\7f\2\2fg\7q\2\2gh\7o\2\2hi\7T\2\2ij\7g\2\2jk\7x\2\2kl\7k\2\2lm\7"+
		"g\2\2mn\7y\2\2n\34\3\2\2\2op\7i\2\2pq\7g\2\2qr\7v\2\2rs\7T\2\2st\7g\2"+
		"\2tu\7u\2\2uv\7v\2\2vw\7c\2\2wx\7w\2\2xy\7t\2\2yz\7c\2\2z{\7p\2\2{|\7"+
		"v\2\2|\36\3\2\2\2}~\7c\2\2~\177\7f\2\2\177\u0080\7f\2\2\u0080\u0081\7"+
		"T\2\2\u0081\u0082\7g\2\2\u0082\u0083\7u\2\2\u0083\u0084\7v\2\2\u0084\u0085"+
		"\7c\2\2\u0085\u0086\7w\2\2\u0086\u0087\7t\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a \3\2\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008d\7f\2\2\u008d\u008e\7f\2\2\u008e\u008f\7W\2\2\u008f\u0090\7u\2\2"+
		"\u0090\u0091\7g\2\2\u0091\u0092\7t\2\2\u0092\"\3\2\2\2\u0093\u0094\7c"+
		"\2\2\u0094\u0095\7f\2\2\u0095\u0096\7f\2\2\u0096\u0097\7T\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7x\2\2\u0099\u009a\7k\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7y\2\2\u009c$\3\2\2\2\6\2\679^\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}