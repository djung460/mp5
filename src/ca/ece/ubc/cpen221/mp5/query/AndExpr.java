package ca.ece.ubc.cpen221.mp5.query;

import ca.ece.ubc.cpen221.mp5.Restaurant;

import java.util.List;

/**
 * Author: Dooj
 * Date: 2015-12-03.
 */
public class AndExpr implements Query {
    private List<Query> andQueries;
    private boolean match;

    public AndExpr(List<Query> andQueries) {
        this.andQueries = andQueries;
    }

    @Override
    public boolean evaluate(Restaurant restaurant) {
        match = true;
        for(Query q : andQueries){
            if(!q.evaluate(restaurant)) {
                match = false;
                return false;
            }
        }
        //TODO CONSIDER SINGLE QUERY
        return true;
    }
}
