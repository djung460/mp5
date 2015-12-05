package ca.ece.ubc.cpen221.mp5.query;

import ca.ece.ubc.cpen221.mp5.Restaurant;

/**
 * Author: Dooj
 * Date: 2015-12-04.
 */
public class OtherQueries implements Query {
    private int queryType;
    private String queryInfo;

    public OtherQueries(int queryType, String queryInfo){
        this.queryType = queryType;
        this.queryInfo = queryInfo.replace("\"","");
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
