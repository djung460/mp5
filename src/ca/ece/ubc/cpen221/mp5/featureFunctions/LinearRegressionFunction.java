package ca.ece.ubc.cpen221.mp5.featureFunctions;

import ca.ece.ubc.cpen221.mp5.Restaurant;
import ca.ece.ubc.cpen221.mp5.RestaurantDB;
import ca.ece.ubc.cpen221.mp5.statlearning.MP5Function;

public class LinearRegressionFunction implements MP5Function {
	
	double a ;
	double b ;
	double rSquared ;
	

	public LinearRegressionFunction (double a, double b, double rSquared){
		this.a = a ;
		this.b = b ;
		this.rSquared = rSquared ;
		
	}
	
	public double getR2() {
	      
		return rSquared ;
	   }
	

	@Override
	public double f(Restaurant yelpRestaurant, RestaurantDB db) {
		// TODO Auto-generated method stub
		return 0;
	}
}
