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
		RANGE=1, LPAREN=2, RPAREN=3, OR=4, AND=5, STRING=6, IN=7, CATEGORY=8, 
		NAME=9, RATING=10, PRICE=11, WS=12, RANDOMREVIEW=13, GETRESTAURANT=14, 
		ADDRESTAURANT=15, ADDUSER=16, ADDREVIEW=17;
	public static final int
		RULE_query = 0, RULE_orExpr = 1, RULE_andExpr = 2, RULE_atom = 3, RULE_in = 4, 
		RULE_category = 5, RULE_name = 6, RULE_rating = 7, RULE_price = 8, RULE_randomReview = 9, 
		RULE_getRestaurant = 10, RULE_addRestaurant = 11, RULE_addUser = 12, RULE_addReview = 13;
	public static final String[] ruleNames = {
		"query", "orExpr", "andExpr", "atom", "in", "category", "name", "rating", 
		"price", "randomReview", "getRestaurant", "addRestaurant", "addUser", 
		"addReview"
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
			setState(35);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				orExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				randomReview();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				getRestaurant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				addRestaurant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				addUser();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(33);
				addReview();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(34);
				match(EOF);
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
		enterRule(_localctx, 2, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			andExpr();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(38);
				match(OR);
				setState(39);
				andExpr();
				}
				}
				setState(44);
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
		enterRule(_localctx, 4, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			atom();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(46);
				match(AND);
				setState(47);
				atom();
				}
				}
				setState(52);
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
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(62);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				in();
				}
				break;
			case CATEGORY:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				category();
				}
				break;
			case RATING:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				rating();
				}
				break;
			case PRICE:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				price();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				name();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				match(LPAREN);
				setState(59);
				orExpr();
				setState(60);
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
		enterRule(_localctx, 8, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IN);
			setState(65);
			match(LPAREN);
			setState(66);
			match(STRING);
			setState(67);
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
		enterRule(_localctx, 10, RULE_category);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CATEGORY);
			setState(70);
			match(LPAREN);
			setState(71);
			match(STRING);
			setState(72);
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
		enterRule(_localctx, 12, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(NAME);
			setState(75);
			match(LPAREN);
			setState(76);
			match(STRING);
			setState(77);
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
		enterRule(_localctx, 14, RULE_rating);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(RATING);
			setState(80);
			match(LPAREN);
			setState(81);
			match(RANGE);
			setState(82);
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
		enterRule(_localctx, 16, RULE_price);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(PRICE);
			setState(85);
			match(LPAREN);
			setState(86);
			match(RANGE);
			setState(87);
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

	public static class RandomReviewContext extends ParserRuleContext {
		public TerminalNode RANDOMREVIEW() { return getToken(QueryParser.RANDOMREVIEW, 0); }
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
		enterRule(_localctx, 18, RULE_randomReview);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(RANDOMREVIEW);
			setState(90);
			match(LPAREN);
			setState(91);
			match(STRING);
			setState(92);
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
		public TerminalNode GETRESTAURANT() { return getToken(QueryParser.GETRESTAURANT, 0); }
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
		enterRule(_localctx, 20, RULE_getRestaurant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(GETRESTAURANT);
			setState(95);
			match(LPAREN);
			setState(96);
			match(STRING);
			setState(97);
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
		public TerminalNode ADDRESTAURANT() { return getToken(QueryParser.ADDRESTAURANT, 0); }
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
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
		enterRule(_localctx, 22, RULE_addRestaurant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ADDRESTAURANT);
			setState(100);
			match(LPAREN);
			setState(101);
			match(STRING);
			setState(102);
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
		public TerminalNode ADDUSER() { return getToken(QueryParser.ADDUSER, 0); }
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
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
		enterRule(_localctx, 24, RULE_addUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ADDUSER);
			setState(105);
			match(LPAREN);
			setState(106);
			match(STRING);
			setState(107);
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
		public TerminalNode ADDUSER() { return getToken(QueryParser.ADDUSER, 0); }
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
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
		enterRule(_localctx, 26, RULE_addReview);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ADDUSER);
			setState(110);
			match(LPAREN);
			setState(111);
			match(STRING);
			setState(112);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2&\n"+
		"\2\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\7\4\63\n\4\f\4\16\4"+
		"\66\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\2\2"+
		"\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2s\2%\3\2\2\2\4\'\3\2\2\2\6"+
		"/\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fG\3\2\2\2\16L\3\2\2\2\20Q\3\2\2\2\22"+
		"V\3\2\2\2\24[\3\2\2\2\26`\3\2\2\2\30e\3\2\2\2\32j\3\2\2\2\34o\3\2\2\2"+
		"\36&\5\4\3\2\37&\5\24\13\2 &\5\26\f\2!&\5\30\r\2\"&\5\32\16\2#&\5\34\17"+
		"\2$&\7\2\2\3%\36\3\2\2\2%\37\3\2\2\2% \3\2\2\2%!\3\2\2\2%\"\3\2\2\2%#"+
		"\3\2\2\2%$\3\2\2\2&\3\3\2\2\2\',\5\6\4\2()\7\6\2\2)+\5\6\4\2*(\3\2\2\2"+
		"+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\5\3\2\2\2.,\3\2\2\2/\64\5\b\5\2\60\61"+
		"\7\7\2\2\61\63\5\b\5\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65"+
		"\3\2\2\2\65\7\3\2\2\2\66\64\3\2\2\2\67A\5\n\6\28A\5\f\7\29A\5\20\t\2:"+
		"A\5\22\n\2;A\5\16\b\2<=\7\4\2\2=>\5\4\3\2>?\7\5\2\2?A\3\2\2\2@\67\3\2"+
		"\2\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2A\t\3\2\2\2BC\7"+
		"\t\2\2CD\7\4\2\2DE\7\b\2\2EF\7\5\2\2F\13\3\2\2\2GH\7\n\2\2HI\7\4\2\2I"+
		"J\7\b\2\2JK\7\5\2\2K\r\3\2\2\2LM\7\13\2\2MN\7\4\2\2NO\7\b\2\2OP\7\5\2"+
		"\2P\17\3\2\2\2QR\7\f\2\2RS\7\4\2\2ST\7\3\2\2TU\7\5\2\2U\21\3\2\2\2VW\7"+
		"\r\2\2WX\7\4\2\2XY\7\3\2\2YZ\7\5\2\2Z\23\3\2\2\2[\\\7\17\2\2\\]\7\4\2"+
		"\2]^\7\b\2\2^_\7\5\2\2_\25\3\2\2\2`a\7\20\2\2ab\7\4\2\2bc\7\b\2\2cd\7"+
		"\5\2\2d\27\3\2\2\2ef\7\21\2\2fg\7\4\2\2gh\7\b\2\2hi\7\5\2\2i\31\3\2\2"+
		"\2jk\7\22\2\2kl\7\4\2\2lm\7\b\2\2mn\7\5\2\2n\33\3\2\2\2op\7\22\2\2pq\7"+
		"\4\2\2qr\7\b\2\2rs\7\5\2\2s\35\3\2\2\2\6%,\64@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}