package ca.ece.ubc.cpen221.mp5.tests;

import ca.ece.ubc.cpen221.mp5.RestaurantDB;

/**
 * Author: Dooj
 * Date: 2015-12-05.
 */
public class RestaurantDBTest {

    @org.junit.Test
    public void testQuery() throws Exception {
        RestaurantDB restaurantDB = new RestaurantDB("test_restaurants.json","test_reviews.json","test_users");

    }
}