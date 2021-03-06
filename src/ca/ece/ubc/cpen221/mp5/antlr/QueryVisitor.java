// Generated from C:/Users/Dooj/Desktop/CPEN 221/mp5/src/ca/ece/ubc/cpen221/mp5/antlr\Query.g4 by ANTLR 4.5.1
package ca.ece.ubc.cpen221.mp5.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(QueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#randomReview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomReview(QueryParser.RandomReviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#getRestaurant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetRestaurant(QueryParser.GetRestaurantContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#addRestaurant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddRestaurant(QueryParser.AddRestaurantContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#addUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddUser(QueryParser.AddUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#addReview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddReview(QueryParser.AddReviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(QueryParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(QueryParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(QueryParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(QueryParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#category}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategory(QueryParser.CategoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(QueryParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#rating}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRating(QueryParser.RatingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#price}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrice(QueryParser.PriceContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(QueryParser.JsonContext ctx);
}