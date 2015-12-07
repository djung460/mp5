package ca.ece.ubc.cpen221.mp5.query;

import ca.ece.ubc.cpen221.mp5.antlr.QueryBaseListener;
import ca.ece.ubc.cpen221.mp5.antlr.QueryLexer;
import ca.ece.ubc.cpen221.mp5.antlr.QueryParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Author: Dooj
 * Date: 2015-12-02.
 */
public class QueryFactory {

    public QueryFactory() {
    }

    public static Query parse(String queryString) throws Exception {

        //Stream of tokens using the lexer
        CharStream input = new ANTLRInputStream(queryString);
        QueryLexer queryLexer = new QueryLexer(input);
        //queryLexer.reportErrorsAsExceptions();
        TokenStream tokenStream = new CommonTokenStream(queryLexer);
        //Push tokens in parser
        QueryParser queryParser = new QueryParser(tokenStream);
        //queryParser.reportErrorsAsExceptions();

        //Generate a parseTree
        ParseTree parseTree = queryParser.query();

        //Walk over parsetree
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        QueryListener_QueryCreator listener = new QueryListener_QueryCreator();
        parseTreeWalker.walk(listener,parseTree);

        return listener.getQuery();
    }

    private static class QueryListener_QueryCreator extends QueryBaseListener {
        private Stack<Query> stack = new Stack<>();

        @Override
        public void exitName(QueryParser.NameContext ctx) {
            Query name = new Atom(ctx.getRuleIndex(),ctx.STRING().getText());
            stack.push(name);
        }

        @Override
        public void exitRating(QueryParser.RatingContext ctx) {
            Query rating = new Atom(ctx.getRuleIndex(), ctx.RANGE().getText());
            stack.push(rating);
        }

        @Override
        public void exitPrice(QueryParser.PriceContext ctx) {
            Query price = new Atom(ctx.getRuleIndex(), ctx.RANGE().getText());
            stack.push(price);
        }

        @Override
        public void exitCategory(QueryParser.CategoryContext ctx) {
            Query category = new Atom(ctx.getRuleIndex(), ctx.STRING().getText());
            stack.push(category);
        }

        @Override
        public void exitIn(QueryParser.InContext ctx) {
            Query in = new Atom(ctx.getRuleIndex(), ctx.STRING().getText());
            stack.push(in);

        }

        @Override
        public void exitAndExpr(QueryParser.AndExprContext ctx) {
            List<Query> andQueries = new ArrayList<>();
            if (ctx.AND() != null) {
                for(int i = 0 ; i < ctx.atom().size(); i++) {
                    Query query = stack.pop();
                    andQueries.add(query);
                }
                Query andExpr = new AndExpr(andQueries);
                stack.push(andExpr);
            } else {
                // do nothing, because we just matched a literal and its BooleanLiteral is already on the stack
            }
        }

        @Override
        public void exitOrExpr(QueryParser.OrExprContext ctx) {
            List<Query> orQueries = new ArrayList<>();
            if (ctx.OR() != null) {
                for(int i = 0; i < ctx.andExpr().size(); i++) {
                    Query query = stack.pop();
                    orQueries.add(query);
                }
                Query orExpr = new OrExpr(orQueries);
                stack.push(orExpr);
            }
        }

        @Override
        public void exitRandomReview(QueryParser.RandomReviewContext ctx) {
            OtherQuery randomReview = new OtherQuery(ctx.getRuleIndex(),ctx.STRING().getText());
            stack.push(randomReview);
        }

        @Override
        public void exitGetRestaurant(QueryParser.GetRestaurantContext ctx) {
            OtherQuery getRestaurant = new OtherQuery(ctx.getRuleIndex(),ctx.STRING().getText());
            stack.push(getRestaurant);
        }

        @Override
        public void exitAddRestaurant(QueryParser.AddRestaurantContext ctx) {
            OtherQuery addRestaurant = new OtherQuery(ctx.getRuleIndex(),'{'+ctx.json().getText()+'}');
            stack.push(addRestaurant);
        }

        @Override
        public void exitAddUser(QueryParser.AddUserContext ctx) {
            OtherQuery addUser = new OtherQuery(ctx.getRuleIndex(),'{'+ctx.json().getText()+'}');
            stack.push(addUser);
        }

        @Override
        public void exitAddReview(QueryParser.AddReviewContext ctx) {
            OtherQuery addReview = new OtherQuery(ctx.getRuleIndex(),'{'+ctx.json().getText()+'}');
            stack.push(addReview);
        }

        @Override
        public void exitQuery(QueryParser.QueryContext ctx) {
            assert stack.size() == 1;
        }

        public Query getQuery() {
            return stack.get(0);
        }
    }
}
