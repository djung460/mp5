package ca.ece.ubc.cpen221.mp5.tests;

import ca.ece.ubc.cpen221.mp5.RestaurantDB;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Dooj
 * Date: 2015-12-05.
 */
public class RestaurantDBTest {

    private RestaurantDB restaurantDB;

    @Before
    public void setUp() {
        restaurantDB = new RestaurantDB("test_restaurants.json", "test_reviews.json", "test_users.json");
    }

    /**
     * Tears down the test fixture.
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
        restaurantDB = null;
    }

    @org.junit.Test
    public void testQuery() throws Exception {
        //Test query
        String expected = "{\"open\": true, \"url\": \"http://www.yelp.com/biz/cafe-3-berkeley\", \"longitude\": -122.260408, \"neighborhoods\": [\"Telegraph Ave\", \"UC Campus Area\"], \"business_id\": \"1\", \"name\": \"Cafe 3\", \"categories\": [\"Cafes\", \"Restaurants\"], \"state\": \"CA\", \"type\": \"business\", \"stars\": 2.0, \"city\": \"Berkeley\", \"full_address\": \"2400 Durant Ave\\nTelegraph Ave\\nBerkeley, CA 94701\", \"review_count\": 9, \"photo_url\": \"http://s3-media1.ak.yelpcdn.com/bphoto/AaHq1UzXiT6zDBUYrJ2NKA/ms.jpg\", \"schools\": [\"University of California at Berkeley\"], \"latitude\": 37.867417, \"price\": 1}";
        String actual = restaurantDB.query("in(\"Telegraph Ave\") && in(\"UC Campus Area\")");
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testGetRestaurant() throws Exception {
        RestaurantDB restaurantDB = new RestaurantDB("test_restaurants.json", "test_reviews.json", "test_users.json");

        //Test query
        String expected = "{\"open\": true, \"url\": \"http://www.yelp.com/biz/fondue-fred-berkeley\", \"longitude\": -122.25894, \"neighborhoods\": [\"UC Campus Area\"], \"business_id\": \"3\", \"name\": \"Fondue Fred\", \"categories\": [\"Fondue\", \"Restaurants\"], \"state\": \"CA\", \"type\": \"business\", \"stars\": 3.0, \"city\": \"Berkeley\", \"full_address\": \"2556 Telegraph Ave\\nUC Campus Area\\nBerkeley, CA 94704\", \"review_count\": 172, \"photo_url\": \"http://s3-media1.ak.yelpcdn.com/bphoto/07PJUIzisU--faHrNi3vTw/ms.jpg\", \"schools\": [\"University of California at Berkeley\"], \"latitude\": 37.863919, \"price\": 3}";
        String actual = restaurantDB.query("getRestaurant(\"3\")");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddUser() throws Exception {
        restaurantDB.query("addUser({\"url\": \"http://www.yelp.com/user_details?userid=testAdd\", \"votes\": {\"funny\": 3, \"useful\": 17, \"cool\": 4}, \"review_count\": 37, \"type\": \"user\", \"user_id\": \"testAdd\", \"name\": \"Erin C.\", \"average_stars\": 3.83783783783784})");
        String actual = restaurantDB.getId_users().get("testAdd").getName();
        String expected = "Erin C.";

        assertEquals(expected, actual);
    }

    @Test
    public void testAddRestaurant() throws Exception {
        restaurantDB.query("addRestaurant({\"open\": true, \"url\": \"http://www.yelp.com/biz/fondue-fred-berkeley\", \"longitude\": -122.25894, \"neighborhoods\": [\"UC Campus Area\"], \"business_id\": \"5\", \"name\": \"Fondue Fred\", \"categories\": [\"Fondue\", \"Restaurants\"], \"state\": \"CA\", \"type\": \"business\", \"stars\": 3.0, \"city\": \"Berkeley\", \"full_address\": \"2556 Telegraph Ave\\nUC Campus Area\\nBerkeley, CA 94704\", \"review_count\": 172, \"photo_url\": \"http://s3-media1.ak.yelpcdn.com/bphoto/07PJUIzisU--faHrNi3vTw/ms.jpg\", \"schools\": [\"University of California at Berkeley\"], \"latitude\": 37.863919, \"price\": 3})");
        String actual = restaurantDB.query("getRestaurant(\"5\")");
        String expected = "{\"open\": true, \"url\": \"http://www.yelp.com/biz/fondue-fred-berkeley\", \"longitude\": -122.25894, \"neighborhoods\": [\"UC Campus Area\"], \"business_id\": \"5\", \"name\": \"Fondue Fred\", \"categories\": [\"Fondue\", \"Restaurants\"], \"state\": \"CA\", \"type\": \"business\", \"stars\": 3.0, \"city\": \"Berkeley\", \"full_address\": \"2556 Telegraph Ave\\nUC Campus Area\\nBerkeley, CA 94704\", \"review_count\": 172, \"photo_url\": \"http://s3-media1.ak.yelpcdn.com/bphoto/07PJUIzisU--faHrNi3vTw/ms.jpg\", \"schools\": [\"University of California at Berkeley\"], \"latitude\": 37.863919, \"price\": 3}";

        assertEquals(expected, actual);
    }

    @Test
    public void testAddReview() throws Exception {
        restaurantDB.query("addReview({\"type\": \"review\", \"business_id\": \"2\", \"votes\": {\"cool\": 0, \"useful\": 0, \"funny\": 0}, \"review_id\": \"0a-pCW4guXIlWNpVeBHChg\", \"text\": \"The pizza is terrible, but if you need a place to watch a game or just down some pitchers, this place works.\\n\\nOh, and the pasta is even worse than the pizza.\", \"stars\": 2, \"user_id\": \"90wm_01FAIqhcgV_mPON9Q\", \"date\": \"2006-07-26\"})");
        String actual = restaurantDB.query("randomReview(\"Jasmine Thai\")");
        String expected = "{\"type\": \"review\", \"business_id\": \"2\", \"votes\": {\"cool\": 0, \"useful\": 0, \"funny\": 0}, \"review_id\": \"0a-pCW4guXIlWNpVeBHChg\", \"text\": \"The pizza is terrible, but if you need a place to watch a game or just down some pitchers, this place works.\\n\\nOh, and the pasta is even worse than the pizza.\", \"stars\": 2, \"user_id\": \"90wm_01FAIqhcgV_mPON9Q\", \"date\": \"2006-07-26\"}";

        assertEquals(expected, actual);
    }

    @Test
    public void testRandomReview() throws Exception {

        String actual = restaurantDB.query("randomReview(\"Cafe 3\")");
        String expected = "{\"type\": \"review\", \"business_id\": \"1\", \"votes\": {\"cool\": 0, \"useful\": 0, \"funny\": 0}, \"review_id\": \"0a-pCW4guXIlWNpVeBHChg\", \"text\": \"The pizza is terrible, but if you need a place to watch a game or just down some pitchers, this place works.\\n\\nOh, and the pasta is even worse than the pizza.\", \"stars\": 2, \"user_id\": \"90wm_01FAIqhcgV_mPON9Q\", \"date\": \"2006-07-26\"}";
        assertEquals(expected, actual);
    }
}