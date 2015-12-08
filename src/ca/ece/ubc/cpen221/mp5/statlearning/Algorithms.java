package ca.ece.ubc.cpen221.mp5.statlearning;

import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

import ca.ece.ubc.cpen221.mp5.*;
import ca.ece.ubc.cpen221.mp5.featureFunctions.LinearRegressionFunction;
import ca.ece.ubc.cpen221.mp5.featureFunctions.Price;

public class Algorithms {

	/**
	 * Use k-means clustering to compute k clusters for the restaurants in the
	 * database.
	 * 
	 * @param db
	 * @return
	 */
	public static List<Set<Restaurant>> kMeansClustering(int k, RestaurantDB db) {
		List<Restaurant> allRestaurants = db.getRestaurants();

		List<Cluster> clusters = null;

		// create k random centroids
		for (int i = 0; i <= k - 1; i++) {
			Cluster cluster = new Cluster(i);
			Location centroid = randomLocation();
			cluster.setCentroid(centroid);
		}

		boolean done = false;
		// continue to organize restaurants into clusters until centroids do not
		// change
		while (!done) {
			// clear current list of clusters
			clusters.clear();

			List<Location> lastCentroids = getCentroid(clusters);

			// for every restaurant, calculate which centroid is closest
			// add restaurant to cluster containing closest centroid
			double distance;
			int assignedCluster = 0;
			for (Restaurant r : allRestaurants) {
				double minDistance = Double.MAX_VALUE;
				for (int i = 0; i < k - 1; i++) {
					Cluster c = clusters.get(i);
					distance = getEuclideanDistance(new Location(r), c.getCentroid());
					if (distance < minDistance) {
						minDistance = distance;
						assignedCluster = i;
					}
				}
				clusters.get(assignedCluster).addPoint(r);
			}
			// for every cluster, find a new centroid
			Location newCentroid;
			for (int i = 0; i < k - 1; i++) {
				newCentroid = getNewCentroid(clusters.get(i).getPoints());
				clusters.get(i).setCentroid(newCentroid);
			}

			// if centroid does not change, done computing
			List<Location> newCentroids = getCentroid(clusters);
			double d = 0.0;
			for (int i = 0; i < lastCentroids.size(); i++) {
				d += getEuclideanDistance((Location) newCentroids.get(i), (Location) lastCentroids.get(i));
			}
			if (d == 0.0)
				done = true;
		}
		// create a list of restaurant set to return
		List<Set<Restaurant>> finalClusters = new ArrayList<Set<Restaurant>>();
		for (Cluster cluster : clusters) {
			finalClusters.add(cluster.getPoints());
		}
		return finalClusters;
	}

	public static String convertClustersToJSON(List<Set<Restaurant>> clusters) {
		JSONArray array = new JSONArray();

		for (Set<Restaurant> x : clusters) {
			for (Restaurant r : x) {
				JSONObject obj = new JSONObject();
				obj.put("x", r.getLatitude());
				obj.put("y", r.getLongitude());
				obj.put("name", r.getName());
				obj.put("cluster", r.getCluster());
				obj.put("weight", 1.0);
				array.add(obj);
			}
		}
		return array.toJSONString();
	}

	public static MP5Function getPredictor(User u, RestaurantDB db, MP5Function featureFunction) {
		// TODO: Implement this method

		// x value is from feature function
		// y value is rating
		
		//variables for calculating sum of squares
		double sxx = 0;
		double syy = 0;
		double sxy = 0;
		
		//regression coefficients
		double a ;
		double b ;
		double rSquared ;
		
		//average x and  y values
		double meanx;
		double meany;

		List<Restaurant> allRestaurants = db.getRestaurants();
		long rating = 0;
		double x;

		double xsum = 0.0;
		int count = 0;

		// find average value of feature function so long that the restaurant is
		// rated by the user
		for (Restaurant r : allRestaurants) {
			List<Review> allReviews = r.getReview();
			for (Review z : allReviews) {
				if (!z.getUser_id().equals(u.getUser_id()))
					allReviews.remove(z);
				else {
					xsum = +featureFunction.f(r, db);
					rating = +z.getStars();
					count++;
				}
			}
		}

		meanx = xsum / (double) count;
		meany = (double) (rating / count);
		
		// Find user's rating
		for (Restaurant r : allRestaurants) {
			List<Review> allReviews = r.getReview();
			for (Review z : allReviews) {
				if (!z.getUser_id().equals(u.getUser_id()))
					allReviews.remove(z);
				else {
					x = featureFunction.f(r, db);
					sxx =+ Math.pow((x - meanx), 2);
					syy =+ Math.pow((z.getStars()), 2) ;
					sxy =+ sxx*syy ;
				}
			}
		}
		
		b = sxy/sxx ;
		a = meany - b*meanx ;
		rSquared = Math.pow(sxy, 2)/(sxx*syy) ;
		
		
		MP5Function LRF = new LinearRegressionFunction(a, b, rSquared) ;
		return LRF ;
		
		
	}
	

	public static MP5Function getBestPredictor(User u, RestaurantDB db, List<MP5Function> featureFunctionList) {
		// TODO: Implement this method
		double rSquared = 0.0 ;
		MP5Function bestPredictor = null ;
		
		for(MP5Function function : featureFunctionList){
			LinearRegressionFunction predict = (LinearRegressionFunction) getPredictor(u, db, function) ;
			if(predict.getR2() > rSquared){
				bestPredictor = function ;
				rSquared = predict.getR2();
			}
		}
		
		return bestPredictor;
	}

	private static List<Location> getCentroid(List<Cluster> clusters) {
		List<Location> centroids = new ArrayList<Location>();
		for (Cluster cluster : clusters) {
			Location x = cluster.getCentroid();
			centroids.add(x);
		}
		return centroids;
	}

	private static Location getNewCentroid(Set<Restaurant> restaurants) {

		double xSum = 0.0;
		double ySum = 0.0;

		for (Restaurant x : restaurants) {
			xSum += x.getLatitude();
			ySum += x.getLongitude();

		}

		double xAvg = xSum / (restaurants.size() - 1);
		double yAvg = ySum / (restaurants.size() - 1);

		return new Location(xAvg, yAvg);

	}

	private static double getEuclideanDistance(Location x, Location loc) {
		double x1 = x.getX();
		double x2 = loc.getX();
		double y1 = x.getY();
		double y2 = loc.getY();

		// Calculate Euclidean Distance
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

	}

	private static Location randomLocation() {
		Random rand = new Random();
		double x = rand.nextDouble();
		double y = rand.nextDouble();

		return new Location(x, y);
	}
	
}
