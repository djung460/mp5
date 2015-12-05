package ca.ece.ubc.cpen221.mp5;

import ca.ece.ubc.cpen221.mp5.query.Query;
import ca.ece.ubc.cpen221.mp5.query.QueryFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

// TODO: This class represents the Restaurant Database.
// Define the internal representation and 
// state the rep invariant and the abstraction function.

public class RestaurantDB {

	Map<String,List<String>> name_id = new HashMap<>();
	Map<String,Restaurant> id_restaurants = new HashMap<>();
    Map<String,User> id_users = new HashMap<>();

	public static void main(String[] args) {
		RestaurantDB resDB = new RestaurantDB("restaurants.json","reviews.json","users.json");
		printRestaurants(resDB.query("(price(4..5) && in(\"Downtown Berkeley\")) && name(\"Top Dog\")"));
        System.out.println("done!");
	}

	private static void printRestaurants(Set<Restaurant> restaurantList){
		for(Restaurant r : restaurantList)
			System.out.println(r.getName());
	}

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
	 * @param restaurantJSONfilename
	 *            the filename for the restaurant data
	 * @param reviewsJSONfilename
	 *            the filename for the reviews
	 * @param usersJSONfilename
	 *            the filename for the users
	 */
	public RestaurantDB(String restaurantJSONfilename, String reviewsJSONfilename, String usersJSONfilename) {
		// TODO: Implement this method
		this.setRestaurants(restaurantJSONfilename);
		this.addReviews(reviewsJSONfilename);
		this.setUsers(usersJSONfilename);
	}

	/**
	 * Adds restaurants to the database
	 *
	 * @param restaurantJSONfilename the filename for the restaurant data
	 */
	private void setRestaurants(String restaurantJSONfilename){
		JSONParser parser = new JSONParser();

		//String line
		String line = null;
		try {
			FileReader fileReader = new FileReader("data/"+restaurantJSONfilename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while((line = bufferedReader.readLine()) != null) {
				Object obj = parser.parse(line);

				JSONObject jsonObject = (JSONObject) obj;

				String business_id = (String) jsonObject.get("business_id");
				String name = (String) jsonObject.get("name");

				if(name_id.containsKey(name)){
					//add the business id provided the name has already been added
					name_id.get(name).add(business_id);
				} else {
					//if the name is new, put a new list and add the business id
					List<String> list_business_id = new ArrayList<>();
					list_business_id.add(business_id);
					name_id.put(name,list_business_id);
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
			FileReader fileReader = new FileReader("data/"+reviewsJSONfilename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while((line = bufferedReader.readLine()) != null) {
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
    private void setUsers(String usersJSONfilename){
        JSONParser parser = new JSONParser();

        //String line
        String line = null;
        try {
            FileReader fileReader = new FileReader("data/"+usersJSONfilename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
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
	 *
	 * @return an unmodifiable list of all restaurants stored in the database
     */

	public  List<Restaurant> getRestaurants(){
		List<Restaurant> restaurants  = new ArrayList<>();

		for(String restaurant_id : id_restaurants.keySet()){
			restaurants.add(id_restaurants.get(restaurant_id));
		}

		return Collections.unmodifiableList(restaurants);
	}

	/**
	 *
	 * @param queryString the query from which a set of resturants will be returned
	 * @return a set of resturants matching the query
	 */
	public Set<Restaurant> query(String queryString) {
		// TODO: Implement this method

		Set<Restaurant> matchedRestaurants = new HashSet<>();

		Query q = QueryFactory.parse(queryString);

		for(Restaurant r : getRestaurants()) {
			Boolean queryEvaluated;
			queryEvaluated = q.evaluate(r);
			if (queryEvaluated)
				matchedRestaurants.add(r);
		}

		return matchedRestaurants;
	}

}
