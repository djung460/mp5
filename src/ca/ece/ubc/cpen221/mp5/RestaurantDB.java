package ca.ece.ubc.cpen221.mp5;

import ca.ece.ubc.cpen221.mp5.antlr.QueryParser;
import ca.ece.ubc.cpen221.mp5.query.OtherQuery;
import ca.ece.ubc.cpen221.mp5.query.Query;
import ca.ece.ubc.cpen221.mp5.query.QueryFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class RestaurantDB {

    Map<String, List<String>> name_id = new HashMap<>();
    Map<String, Restaurant> id_restaurants = new HashMap<>();
    Map<String, User> id_users = new HashMap<>();

    //Rep invariant :
        //name_id, id_restaurants, id_users != null
        //id_restaurants key maps to unique Restaurant
        //name_id key maps to atleast one Restaurant with key as its name
        //id_users key maps to unique User
    //Abstraction function:
        //TODO ABSTRACTION FUNCTION

    /**
     * Create a database from the Yelp dataset given the names of three files:
     * <ul>
     * <li>One that contains data about the restaurants;</li>
     * <li>One that contains reviews of the restaurants;</li>
     * <li>One that contains information about the users that submitted reviews.
     * </li>
     * </ul>
     * The files contain data in JSON format.
     *
     * @param restaurantJSONfilename the filename for the restaurant data
     * @param reviewsJSONfilename    the filename for the reviews
     * @param usersJSONfilename      the filename for the users
     */
    public RestaurantDB(String restaurantJSONfilename, String reviewsJSONfilename, String usersJSONfilename) {
        this.setRestaurants(restaurantJSONfilename);
        this.addReviews(reviewsJSONfilename);
        this.setUsers(usersJSONfilename);
    }

    /**
     * Adds restaurants to the database
     *
     * @param restaurantJSONfilename the filename for the restaurant data
     */
    private void setRestaurants(String restaurantJSONfilename) {
        JSONParser parser = new JSONParser();

        //String line
        String line = null;
        try {
            FileReader fileReader = new FileReader("data/" + restaurantJSONfilename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                Object obj = parser.parse(line);

                JSONObject jsonObject = (JSONObject) obj;

                String business_id = (String) jsonObject.get("business_id");
                String name = (String) jsonObject.get("name");

                if (name_id.containsKey(name)) {
                    //add the business id provided the name has already been added
                    name_id.get(name).add(business_id);
                } else {
                    //if the name is new, put a new list and add the business id
                    List<String> list_business_id = new ArrayList<>();
                    list_business_id.add(business_id);
                    name_id.put(name, list_business_id);
                }

                id_restaurants.put(business_id, new Restaurant(jsonObject));

            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds reviews for the restaurants in the database
     *
     * @param reviewsJSONfilename the filename for the review data
     */
    private void addReviews(String reviewsJSONfilename) {
        JSONParser parser = new JSONParser();

        //String line
        String line = null;
        try {
            FileReader fileReader = new FileReader("data/" + reviewsJSONfilename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                Object obj = parser.parse(line);

                JSONObject jsonObject = (JSONObject) obj;

                String business_id = (String) jsonObject.get("business_id");

                id_restaurants.get(business_id).setReview(new Review(jsonObject));
            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Sets users for the restaurants in the database
     *
     * @param usersJSONfilename the filename for the review data
     */
    private void setUsers(String usersJSONfilename) {
        JSONParser parser = new JSONParser();

        //String line
        String line = null;
        try {
            FileReader fileReader = new FileReader("data/" + usersJSONfilename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                Object obj = parser.parse(line);

                JSONObject jsonObject = (JSONObject) obj;

                String user_id = (String) jsonObject.get("user_id");

                id_users.put(user_id, new User(jsonObject));

            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return an unmodifiable list of all restaurants stored in the database
     */

    public List<Restaurant> getRestaurants() {
        List<Restaurant> restaurants = new ArrayList<>();

        for (String restaurant_id : id_restaurants.keySet()) {
            restaurants.add(id_restaurants.get(restaurant_id));
        }

        return Collections.unmodifiableList(restaurants);
    }

    /**
     * Handles queries sent to the server.
     *
     * @param queryString the query from which the server responds accordingly
     * @return the result of the query
     */
    public String query(String queryString) throws Exception{
        QueryHandler queryHandler = new QueryHandler(queryString);

        return queryHandler.handleQuery();
    }

    /**
     * Handles all queries given to the database passed from the server
     */
    private class QueryHandler {

        Query query;

        //Generates a query from the given query String
        public QueryHandler(String queryString) throws Exception{
            query = QueryFactory.parse(queryString);
        }

        private String handleQuery() {
            String result = "";
            Set<Restaurant> matchedRestaurants = new HashSet<>();

            if(query instanceof OtherQuery) {
                OtherQuery otherQuery = (OtherQuery) query;
                switch(otherQuery.getQueryType()) {
                    case QueryParser.RULE_addRestaurant:
                        addRestaurant(otherQuery.getQueryInfo());
                        result = "Restaurant added!";
                        break;
                    case QueryParser.RULE_addReview:
                        addReview(otherQuery.getQueryInfo());
                        result = "Review added!";
                        break;
                    case QueryParser.RULE_addUser:
                        addUser(otherQuery.getQueryInfo());
                        result = "User added!";
                        break;
                    case QueryParser.RULE_randomReview:
                        result = randomReview(otherQuery.getQueryInfo());
                        break;
                    case QueryParser.RULE_getRestaurant:
                        result = getRestaurant(otherQuery.getQueryInfo());
                        break;

                }
            } else {
                matchedRestaurants = search();
                StringBuilder stringBuilder = new StringBuilder();

                for(int i = 0 ; i < matchedRestaurants.size(); i++)
                for(Restaurant r : matchedRestaurants) {
                    stringBuilder.append(getRestaurant(r.getBusiness_id()));
                    if(i < matchedRestaurants.size() - 1)
                        stringBuilder.append(",");
                }

                result = stringBuilder.toString();
            }

            return result;
        }

        /**
         * Searches the restaurants in the database that match the query.
         * Requires the query to be valid
         *
         * @return a set of resturants matching the query
         */
        private Set<Restaurant> search() {

            Set<Restaurant> matchedRestaurants = new HashSet<>();

            for (Restaurant r : getRestaurants()) {
                Boolean queryEvaluated;
                queryEvaluated = query.evaluate(r);
                if (queryEvaluated)
                    matchedRestaurants.add(r);
            }
            return matchedRestaurants;
        }

        /**
         * Adds a new restaurant to the database provided it does not already exist.
         * Requires the restaurant to have all Restaurant fields
         *
         * @param jsonString a JSON formatted String of a Restaurant
         */
        private void addRestaurant(String jsonString) {
            JSONParser parser = new JSONParser();
            try {
                Object obj = parser.parse(jsonString);

                JSONObject jsonObject = (JSONObject) obj;

                String business_id = (String) jsonObject.get("business_id");
                String name = (String) jsonObject.get("name");

                if (name_id.containsKey(name)) {
                    //add the business id provided the name has already been added
                    name_id.get(name).add(business_id);
                } else {
                    //if the name is new, put a new list and add the business id
                    List<String> list_business_id = new ArrayList<>();
                    list_business_id.add(business_id);
                    name_id.put(name, list_business_id);
                }

                id_restaurants.put(business_id, new Restaurant(jsonObject));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        /**
         * Adds a new review to the database in the corresponding restaurant provided it exists.
         * Requires the review to have all Review fields
         *
         * @param jsonString a JSON formatted String of a Review
         */

        private void addReview(String jsonString) {
            JSONParser parser = new JSONParser();

            try {
                Object obj = parser.parse(jsonString);

                JSONObject jsonObject = (JSONObject) obj;

                String business_id = (String) jsonObject.get("business_id");

                id_restaurants.get(business_id).setReview(new Review(jsonObject));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        /**
         * Adds a new user to the database provided the user does not already exist
         * Requires the user to have all User fields
         *
         * @param jsonString a JSON formatted String of a User
         */
        private void addUser(String jsonString) {
            JSONParser parser = new JSONParser();
            try {
                Object obj = parser.parse(jsonString);

                JSONObject jsonObject = (JSONObject) obj;

                String user_id = (String) jsonObject.get("user_id");

                id_users.put(user_id, new User(jsonObject));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /**
         * Gets the restaurant in JSON format for the restaurant that has the provided business identifier
         *
         * @param restaurant_id business identifier to get JSON formatted String
         * @return a JSON formatted String of the restaurant if it exists otherwise returns "Restaurant, not found"
         */

        private String getRestaurant(String restaurant_id) {
            Restaurant restaurant = id_restaurants.get(restaurant_id);
            if(restaurant == null)
                return "Sorry, restaurant not found";

            String jsonString =
                    "{\"open\": " + restaurant.isOpen() +
                            ", \"url\": \"" + restaurant.getUrl() +
                            "\", \"longitude\": " + restaurant.getLongitude() +
                            ", \"neighborhoods\": " + javaListToJSONStringArray(restaurant.getNeighborhoods()) +
                            ", \"business_id\": \"" + restaurant.getBusiness_id() +
                            "\", \"name\": \"" + restaurant.getName() +
                            "\", \"categories\": " + javaListToJSONStringArray(restaurant.getCategories()) +
                            ", \"state\": \"" + restaurant.getState() +
                            "\", \"type\": \"" + restaurant.getType() +
                            "\", \"stars\": " + restaurant.getStars() +
                            ", \"city\": \"" + restaurant.getCity() +
                            "\", \"full_address\": \"" + restaurant.getFull_address().replace("\n", "\\n") +
                            "\", \"review_count\": " + restaurant.getReview_count() +
                            ", \"photo_url\": \"" + restaurant.getPhoto_url() +
                            "\", \"schools\": " + javaListToJSONStringArray(restaurant.getSchools()) +
                            ", \"latitude\": " + restaurant.getLatitude() +
                            ", \"price\": " + restaurant.getPrice() + "}";

            return jsonString;
        }

        /**
         * Gets a random review in JSON format for the restaurant that has the provided name. If there are multiple
         * restaurants with the same name, a random restuarant is first chosen.
         *
         * @param restaurant_name restaurant name to get a random review from
         * @return a JSON formatted String of the review
         */
        private String randomReview(String restaurant_name) {
            List<String> restaurant_ids = name_id.get(restaurant_name);
            Random random_id = new Random();

            int randIndex1 = random_id.nextInt(restaurant_ids.size());
            String id = restaurant_ids.get(randIndex1);

            List<Review> reviews = id_restaurants.get(id).getReviews();
            int randIndex2 = random_id.nextInt(reviews.size());
            Review randReview = reviews.get(randIndex2);

            String jsonString =
                    "{\"type\": " + randReview.getType() +
                            ", \"business_id\": " + randReview.getBusiness_id() +
                            ", \"votes\": " +
                            "{\"cool\": " + randReview.getVote().getCool() +
                            ", \"useful\": " + randReview.getVote().getUseful() +
                            ", \"funny\": " + randReview.getVote().getFunny() + "}" +
                            ", \"review_id\": " + randReview.getReview_id() +
                            ", \"text\": " + randReview.getText() +
                            ", \"stars\": " + randReview.getStars() + "" +
                            ", \"user_id\": " + randReview.getUser_id() +
                            ", \"date\": " + randReview.getDate() + "}";

            return jsonString;
        }

        private String javaListToJSONStringArray(List<String> strings) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            for(int i = 0; i < strings.size(); i ++){
                stringBuilder.append("\"");
                stringBuilder.append(strings.get(i));
                stringBuilder.append("\"");
                if(i < strings.size() - 1)
                    stringBuilder.append(", ");
            }
            stringBuilder.append("]");

            return stringBuilder.toString();
        }
    }
}


