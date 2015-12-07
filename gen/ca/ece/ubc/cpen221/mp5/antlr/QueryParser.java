// Generated from C:/Users/Dooj/Desktop/CPEN 221/mp5/src/ca/ece/ubc/cpen221/mp5/antlr\Query.g4 by ANTLR 4.5.1
package ca.ece.ubc.cpen221.mp5.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, RANGE=6, LPAREN=7, RPAREN=8, OR=9, 
		AND=10, STRING=11, IN=12, CATEGORY=13, NAME=14, RATING=15, PRICE=16, JSONSTRING=17, 
		WS=18;
	public static final int
		RULE_query = 0, RULE_randomReview = 1, RULE_getRestaurant = 2, RULE_addRestaurant = 3, 
		RULE_addUser = 4, RULE_addReview = 5, RULE_orExpr = 6, RULE_andExpr = 7, 
		RULE_atom = 8, RULE_in = 9, RULE_category = 10, RULE_name = 11, RULE_rating = 12, 
		RULE_price = 13, RULE_json = 14;
	public static final String[] ruleNames = {
		"query", "randomReview", "getRestaurant", "addRestaurant", "addUser", 
		"addReview", "orExpr", "andExpr", "atom", "in", "category", "name", "rating", 
		"price", "json"
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

	@Override
	public String getGrammarFileName() { return "Query.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public QueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public RandomReviewContext randomReview() {
			return getRuleContext(RandomReviewContext.class,0);
		}
		public GetRestaurantContext getRestaurant() {
			return getRuleContext(GetRestaurantContext.class,0);
		}
		public AddRestaurantContext addRestaurant() {
			return getRuleContext(AddRestaurantContext.class,0);
		}
		public AddUserContext addUser() {
			return getRuleContext(AddUserContext.class,0);
		}
		public AddReviewContext addReview() {
			return getRuleContext(AddReviewContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QueryParser.EOF, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			setState(37);
			switch (_input.LA(1)) {
			case LPAREN:
			case IN:
			case CATEGORY:
			case NAME:
			case RATING:
			case PRICE:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				orExpr();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				randomReview();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				getRestaurant();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				addRestaurant();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				addUser();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				addReview();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 7);
				{
				setState(36);
				match(EOF);
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

	public static class RandomReviewContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(QueryParser.RPAREN, 0); }
		public RandomReviewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randomReview; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterRandomReview(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitRandomReview(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitRandomReview(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RandomReviewContext randomReview() throws RecognitionException {
		RandomReviewContext _localctx = new RandomReviewContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_randomReview);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			match(LPAREN);
			setState(41);
			match(STRING);
			setState(42);
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

	public static class GetRestaurantContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(QueryParser.RPAREN, 0); }
		public GetRestaurantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getRestaurant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterGetRestaurant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitGetRestaurant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitGetRestaurant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetRestaurantContext getRestaurant() throws RecognitionException {
		GetRestaurantContext _localctx = new GetRestaurantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_getRestaurant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__1);
			setState(45);
			match(LPAREN);
			setState(46);
			match(STRING);
			setState(47);
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

	public static class AddRestaurantContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QueryParser.RPAREN, 0); }
		public AddRestaurantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addRestaurant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterAddRestaurant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitAddRestaurant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitAddRestaurant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddRestaurantContext addRestaurant() throws RecognitionException {
		AddRestaurantContext _localctx = new AddRestaurantContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addRestaurant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__2);
			setState(50);
			match(LPAREN);
			setState(51);
			json();
			setState(52);
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

	public static class AddUserContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QueryParser.RPAREN, 0); }
		public AddUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addUser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterAddUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitAddUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitAddUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddUserContext addUser() throws RecognitionException {
		AddUserContext _localctx = new AddUserContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__3);
			setState(55);
			match(LPAREN);
			setState(56);
			json();
			setState(57);
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

	public static class AddReviewContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QueryParser.RPAREN, 0); }
		public AddReviewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addReview; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterAddReview(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitAddReview(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitAddReview(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddReviewContext addReview() throws RecognitionException {
		AddReviewContext _localctx = new AddReviewContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_addReview);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__4);
			setState(60);
			match(LPAREN);
			setState(61);
			json();
			setState(62);
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

	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(QueryParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(QueryParser.OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			andExpr();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(65);
				match(OR);
				setState(66);
				andExpr();
				}
				}
				setState(71);
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

	public static class AndExprContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(QueryParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(QueryParser.AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			atom();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(73);
				match(AND);
				setState(74);
				atom();
				}
				}
				setState(79);
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

	public static class AtomContext extends ParserRuleContext {
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public CategoryContext category() {
			return getRuleContext(CategoryContext.class,0);
		}
		public RatingContext rating() {
			return getRuleContext(RatingContext.class,0);
		}
		public PriceContext price() {
			return getRuleContext(PriceContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QueryParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atom);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				in();
				}
				break;
			case CATEGORY:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				category();
				}
				break;
			case RATING:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				rating();
				}
				break;
			case PRICE:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				price();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				name();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(LPAREN);
				setState(86);
				orExpr();
				setState(87);
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

	public static class InContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(QueryParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(QueryParser.RPAREN, 0); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IN);
			setState(92);
			match(LPAREN);
			setState(93);
			match(STRING);
			setState(94);
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

	public static class CategoryContext extends ParserRuleContext {
		public TerminalNode CATEGORY() { return getToken(QueryParser.CATEGORY, 0); }
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(QueryParser.RPAREN, 0); }
		public CategoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterCategory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitCategory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitCategory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CategoryContext category() throws RecognitionException {
		CategoryContext _localctx = new CategoryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_category);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(CATEGORY);
			setState(97);
			match(LPAREN);
			setState(98);
			match(STRING);
			setState(99);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(QueryParser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(QueryParser.RPAREN, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(NAME);
			setState(102);
			match(LPAREN);
			setState(103);
			match(STRING);
			setState(104);
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

	public static class RatingContext extends ParserRuleContext {
		public TerminalNode RATING() { return getToken(QueryParser.RATING, 0); }
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public TerminalNode RANGE() { return getToken(QueryParser.RANGE, 0); }
		public TerminalNode RPAREN() { return getToken(QueryParser.RPAREN, 0); }
		public RatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterRating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitRating(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitRating(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatingContext rating() throws RecognitionException {
		RatingContext _localctx = new RatingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rating);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(RATING);
			setState(107);
			match(LPAREN);
			setState(108);
			match(RANGE);
			setState(109);
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

	public static class PriceContext extends ParserRuleContext {
		public TerminalNode PRICE() { return getToken(QueryParser.PRICE, 0); }
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public TerminalNode RANGE() { return getToken(QueryParser.RANGE, 0); }
		public TerminalNode RPAREN() { return getToken(QueryParser.RPAREN, 0); }
		public PriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_price; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterPrice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitPrice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriceContext price() throws RecognitionException {
		PriceContext _localctx = new PriceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_price);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(PRICE);
			setState(112);
			match(LPAREN);
			setState(113);
			match(RANGE);
			setState(114);
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

	public static class JsonContext extends ParserRuleContext {
		public TerminalNode JSONSTRING() { return getToken(QueryParser.JSONSTRING, 0); }
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(JSONSTRING);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2(\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bF\n\b\f\b\16"+
		"\bI\13\b\3\t\3\t\3\t\7\tN\n\t\f\t\16\tQ\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\\\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2v\2\'\3\2"+
		"\2\2\4)\3\2\2\2\6.\3\2\2\2\b\63\3\2\2\2\n8\3\2\2\2\f=\3\2\2\2\16B\3\2"+
		"\2\2\20J\3\2\2\2\22[\3\2\2\2\24]\3\2\2\2\26b\3\2\2\2\30g\3\2\2\2\32l\3"+
		"\2\2\2\34q\3\2\2\2\36v\3\2\2\2 (\5\16\b\2!(\5\4\3\2\"(\5\6\4\2#(\5\b\5"+
		"\2$(\5\n\6\2%(\5\f\7\2&(\7\2\2\3\' \3\2\2\2\'!\3\2\2\2\'\"\3\2\2\2\'#"+
		"\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\3\3\2\2\2)*\7\3\2\2*+\7\t\2"+
		"\2+,\7\r\2\2,-\7\n\2\2-\5\3\2\2\2./\7\4\2\2/\60\7\t\2\2\60\61\7\r\2\2"+
		"\61\62\7\n\2\2\62\7\3\2\2\2\63\64\7\5\2\2\64\65\7\t\2\2\65\66\5\36\20"+
		"\2\66\67\7\n\2\2\67\t\3\2\2\289\7\6\2\29:\7\t\2\2:;\5\36\20\2;<\7\n\2"+
		"\2<\13\3\2\2\2=>\7\7\2\2>?\7\t\2\2?@\5\36\20\2@A\7\n\2\2A\r\3\2\2\2BG"+
		"\5\20\t\2CD\7\13\2\2DF\5\20\t\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2"+
		"\2H\17\3\2\2\2IG\3\2\2\2JO\5\22\n\2KL\7\f\2\2LN\5\22\n\2MK\3\2\2\2NQ\3"+
		"\2\2\2OM\3\2\2\2OP\3\2\2\2P\21\3\2\2\2QO\3\2\2\2R\\\5\24\13\2S\\\5\26"+
		"\f\2T\\\5\32\16\2U\\\5\34\17\2V\\\5\30\r\2WX\7\t\2\2XY\5\16\b\2YZ\7\n"+
		"\2\2Z\\\3\2\2\2[R\3\2\2\2[S\3\2\2\2[T\3\2\2\2[U\3\2\2\2[V\3\2\2\2[W\3"+
		"\2\2\2\\\23\3\2\2\2]^\7\16\2\2^_\7\t\2\2_`\7\r\2\2`a\7\n\2\2a\25\3\2\2"+
		"\2bc\7\17\2\2cd\7\t\2\2de\7\r\2\2ef\7\n\2\2f\27\3\2\2\2gh\7\20\2\2hi\7"+
		"\t\2\2ij\7\r\2\2jk\7\n\2\2k\31\3\2\2\2lm\7\21\2\2mn\7\t\2\2no\7\b\2\2"+
		"op\7\n\2\2p\33\3\2\2\2qr\7\22\2\2rs\7\t\2\2st\7\b\2\2tu\7\n\2\2u\35\3"+
		"\2\2\2vw\7\23\2\2w\37\3\2\2\2\6\'GO[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}