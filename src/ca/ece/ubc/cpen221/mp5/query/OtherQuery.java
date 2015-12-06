package ca.ece.ubc.cpen221.mp5.query;

import ca.ece.ubc.cpen221.mp5.Restaurant;

/**
 * Author: Dooj
 * Date: 2015-12-04.
 */
public class OtherQuery implements Query {
    private int queryType;
    private String queryInfo;

    public OtherQuery(int queryType, String queryInfo){
        this.queryType = queryType;
        this.queryInfo = queryInfo.substring(1,queryInfo.length()-1);
    }

    public int getQueryType() {
        return queryType;
    }

    public String getQueryInfo() {
        return queryInfo;
    }

    @Override
    public boolean evaluate(Restaurant restaurant) {
        return false;
    }
}
