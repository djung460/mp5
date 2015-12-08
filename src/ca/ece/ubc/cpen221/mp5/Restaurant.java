package ca.ece.ubc.cpen221.mp5;

// TODO: Use this class to represent a restaurant.
// State the rep invariant and abs

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private boolean open;
    private String url;
    private double longitude;
    private List<String> neighborhoods;
    private String business_id;
    private String name;
    private List<String> categories;
    private String state;
    private String type;
    private Double stars;
    private String city;
    private String full_address;
    private long review_count;
    private String photo_url;
    private List<String> schools;
    private double latitude;
    private long price;
    private List<Review> review;
    private int cluster ;

    public Restaurant(JSONObject jsonObject){
        open = (Boolean) jsonObject.get("open");
        url = (String) jsonObject.get("url");
        longitude = (Double) jsonObject.get("longitude");
        neighborhoods = jsonArrayToList((JSONArray) jsonObject.get("neighborhoods"));
        business_id = (String) jsonObject.get("business_id");
        name = (String) jsonObject.get("name");
        categories = jsonArrayToList((JSONArray) jsonObject.get("categories"));
        state = (String) jsonObject.get("state");
        type = (String) jsonObject.get("type");
        stars = (double) jsonObject.get("stars");
        city = (String) jsonObject.get("city");
        full_address = (String) jsonObject.get("full_address");
        review_count = (long) jsonObject.get("review_count");
        photo_url = (String) jsonObject.get("photo_url");
        schools = jsonArrayToList((JSONArray) jsonObject.get("schools"));
        latitude = (double) jsonObject.get("latitude");
        price = (long) jsonObject.get("price");
        review = new ArrayList<>();
    }

    public void setReview(Review review){
        this.review.add(review);
    }


    private static ArrayList<String> jsonArrayToList(JSONArray jsonArray){

        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<jsonArray.size(); i++) {
            String value = (String) jsonArray.get(i);
            list.add(value);
        }

        return list;
    }


    public List<Review> getReview() {
        return review;
    }


    public void setCluster(int assignedCluster){
        this.cluster = assignedCluster ;
    }

    public int getCluster() {
        return cluster ;
    }

    public boolean isOpen() {
        return open;
    }

    public String getUrl() {
        return url;
    }

    public double getLongitude() {
        return longitude;
    }

    public List<String> getNeighborhoods() {
        return neighborhoods;
    }

    public String getBusiness_id() {
        return business_id;
    }

    public String getName() {
        return name;
    }

    public List<String> getCategories() {
        return categories;
    }

    public String getState() {
        return state;
    }

    public String getType() {
        return type;
    }

    public Double getStars() {
        return stars;
    }

    public String getCity() {
        return city;
    }

    public String getFull_address() {
        return full_address;
    }

    public long getReview_count() {
        return review_count;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public List<String> getSchools() {
        return schools;
    }

    public double getLatitude() {
        return latitude;
    }

    public long getPrice() {
        return price;
    }
}
