package ca.ece.ubc.cpen221.mp5.tests;

import ca.ece.ubc.cpen221.mp5.RestaurantDB;

import static org.junit.Assert.assertEquals;

/**
 * Author: Dooj
 * Date: 2015-12-05.
 */
public class RestaurantDBTest {

    @org.junit.Test
    public void testDatabase() throws Exception {
        RestaurantDB restaurantDB = new RestaurantDB("test_restaurants.json","test_reviews.json","test_users.json");

        //Test query
        String expected = "{\"open\": true, \"url\": \"http://www.yelp.com/biz/cafe-3-berkeley\", \"longitude\": -122.260408, \"neighborhoods\": [\"Telegraph Ave\", \"UC Campus Area\"], \"business_id\": \"1\", \"name\": \"Cafe 3\", \"categories\": [\"Cafes\", \"Restaurants\"], \"state\": \"CA\", \"type\": \"business\", \"stars\": 2.0, \"city\": \"Berkeley\", \"full_address\": \"2400 Durant Ave\\nTelegraph Ave\\nBerkeley, CA 94701\", \"review_count\": 9, \"photo_url\": \"http://s3-media1.ak.yelpcdn.com/bphoto/AaHq1UzXiT6zDBUYrJ2NKA/ms.jpg\", \"schools\": [\"University of California at Berkeley\"], \"latitude\": 37.867417, \"price\": 1}\n";
        String actual = restaurantDB.query("in(\"Telegraph Ave\") && in(\"UC Campus Area\")");

        assertEquals(expected,actual);
    }
}