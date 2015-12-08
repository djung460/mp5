package ca.ece.ubc.cpen221.mp5.featureFunctions;

import ca.ece.ubc.cpen221.mp5.Restaurant;
import ca.ece.ubc.cpen221.mp5.RestaurantDB;
import ca.ece.ubc.cpen221.mp5.statlearning.MP5Function;

import java.util.LinkedHashMap;
import java.util.List;

public class Category implements MP5Function {

	@Override
	public double f(Restaurant yelpRestaurant, RestaurantDB db) {
		// TODO Auto-generated method stub
		Double[] categoryMap = getCategoryMap(db);
		double randomCategory = categoryMap[0];

		return randomCategory;

	}

	private Double[] getCategoryMap(RestaurantDB db) {
		List<Restaurant> allRestaurants = db.getRestaurants();
		LinkedHashMap<String, Double> types = new LinkedHashMap<String, Double>();

		List<String> category;
		double count = 0.0;
		for (Restaurant r : allRestaurants) {
			category = r.getCategories();
			for (String s : category) {
				if (!types.containsKey(s)) {
					count++;
					types.put(s, count);
				}
			}

		}
		return (Double[]) types.values().toArray();
	}

}