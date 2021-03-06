// Generated from C:/Users/Dooj/Desktop/CPEN 221/mp5/src/ca/ece/ubc/cpen221/mp5/antlr\Query.g4 by ANTLR 4.5.1
package ca.ece.ubc.cpen221.mp5.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryParser}.
 */
public interface QueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(QueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(QueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#randomReview}.
	 * @param ctx the parse tree
	 */
	void enterRandomReview(QueryParser.RandomReviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#randomReview}.
	 * @param ctx the parse tree
	 */
	void exitRandomReview(QueryParser.RandomReviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#getRestaurant}.
	 * @param ctx the parse tree
	 */
	void enterGetRestaurant(QueryParser.GetRestaurantContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#getRestaurant}.
	 * @param ctx the parse tree
	 */
	void exitGetRestaurant(QueryParser.GetRestaurantContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#addRestaurant}.
	 * @param ctx the parse tree
	 */
	void enterAddRestaurant(QueryParser.AddRestaurantContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#addRestaurant}.
	 * @param ctx the parse tree
	 */
	void exitAddRestaurant(QueryParser.AddRestaurantContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#addUser}.
	 * @param ctx the parse tree
	 */
	void enterAddUser(QueryParser.AddUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#addUser}.
	 * @param ctx the parse tree
	 */
	void exitAddUser(QueryParser.AddUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#addReview}.
	 * @param ctx the parse tree
	 */
	void enterAddReview(QueryParser.AddReviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#addReview}.
	 * @param ctx the parse tree
	 */
	void exitAddReview(QueryParser.AddReviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(QueryParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(QueryParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(QueryParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(QueryParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(QueryParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(QueryParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(QueryParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(QueryParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#category}.
	 * @param ctx the parse tree
	 */
	void enterCategory(QueryParser.CategoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#category}.
	 * @param ctx the parse tree
	 */
	void exitCategory(QueryParser.CategoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(QueryParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(QueryParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#rating}.
	 * @param ctx the parse tree
	 */
	void enterRating(QueryParser.RatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#rating}.
	 * @param ctx the parse tree
	 */
	void exitRating(QueryParser.RatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#price}.
	 * @param ctx the parse tree
	 */
	void enterPrice(QueryParser.PriceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#price}.
	 * @param ctx the parse tree
	 */
	void exitPrice(QueryParser.PriceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(QueryParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(QueryParser.JsonContext ctx);
}