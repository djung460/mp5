package ca.ece.ubc.cpen221.mp5.query;

import ca.ece.ubc.cpen221.mp5.Restaurant;
import ca.ece.ubc.cpen221.mp5.antlr.QueryParser;

/**
 * Author: Dooj
 * Date: 2015-12-03.
 */
public class Atom implements Query {

    private int atomType;
    private String atomString;
    private boolean match;

    public Atom(int atomType, String atomString) {
        this.atomType = atomType;
        this.atomString = atomString.replace("\"","");
    }

    @Override
    public boolean evaluate(Restaurant restaurant) {
        match = false;
        switch (atomType) {
            case QueryParser.RULE_category:
                if(restaurant.getCategories().contains(atomString)) {
                    match = true;
                }
                break;
            case QueryParser.RULE_in:
                if(restaurant.getNeighborhoods().contains(atomString)) {
                    match = true;
                }
                break;
            case QueryParser.RULE_name:
                if(restaurant.getName().equals(atomString)) {
                    match = true;
                }
                break;
            case QueryParser.RULE_rating:
                int minStar = Integer.parseInt(String.valueOf(atomString.charAt(0)));
                int maxStar = Integer.parseInt(String.valueOf(atomString.charAt(3)));

                if(restaurant.getStars() >= minStar && restaurant.getStars() <= maxStar) {
                    match = true;
                }
                break;
            case QueryParser.RULE_price:
                int minPrice = Integer.parseInt(String.valueOf(atomString.charAt(0)));
                int maxPrice = Integer.parseInt(String.valueOf(atomString.charAt(3)));
                if(restaurant.getPrice() >= minPrice && restaurant.getPrice() <= maxPrice) {
                    match = true;
                }
                break;
        }
        return match;
    }
}
