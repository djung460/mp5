package ca.ece.ubc.cpen221.mp5.query;

import ca.ece.ubc.cpen221.mp5.Restaurant;

import java.util.List;

/**
 * Author: Dooj
 * Date: 2015-12-03.
 */
public class OrExpr implements Query {
    private List<Query> orQueries;
    private boolean match;
    public OrExpr(List<Query> orQueries) {
        this.orQueries = orQueries;
    }

    @Override
    public boolean evaluate(Restaurant restaurant) {
        match = false;
        for(Query q : orQueries){
            if(q.evaluate(restaurant)) {
                match = true;
                break;
            }
        }
        return match;
    }
}
