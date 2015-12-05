package ca.ece.ubc.cpen221.mp5.query;

import ca.ece.ubc.cpen221.mp5.Restaurant;

/**
 * Author: Dooj
 * Date: 2015-12-02.
 */
public interface Query {
    public boolean evaluate(Restaurant restaurant);
}
