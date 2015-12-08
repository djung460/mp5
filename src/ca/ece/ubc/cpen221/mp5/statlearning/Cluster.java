package ca.ece.ubc.cpen221.mp5.statlearning;

import ca.ece.ubc.cpen221.mp5.Location;
import ca.ece.ubc.cpen221.mp5.Restaurant;

import java.util.HashSet;
import java.util.Set;

public class Cluster {
	public HashSet<Restaurant> points ;
	public Location centroid ;
	public int name ;
	
	public Cluster(int name){
		this.name = name ;
		this.points = new HashSet<Restaurant>();
		this.centroid = null ;
	}
	
	public Set<Restaurant> getPoints() {
		return points ;
	}
	
	public void addPoint(Restaurant point){
		points.add(point) ;
	}
	
	public Location getCentroid() {
		return centroid ;
	}
	
	public void setCentroid(Location centroid){
		this.centroid = centroid ;
	}
	
	public void clear() {
		points.clear() ;
	}
}
