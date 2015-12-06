package ca.ece.ubc.cpen221.mp5.server;

import ca.ece.ubc.cpen221.mp5.RestaurantDB;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Author: Dooj
 * Date: 2015-12-05.
 */
class QueryFinder {
    private final BlockingQueue<String> in;
    private final BlockingQueue<QueryResult> out;
    private final RestaurantDB database;
    // Rep invariant: in, out != null

    /**
     * Make a QueryFinder that will listen for requests and generate replies.
     *
     * @param requests queue to receive requests from
     * @param replies  queue to send replies to
     */
    public QueryFinder(BlockingQueue<String> requests, BlockingQueue<QueryResult> replies, RestaurantDB database) {
        this.in = requests;
        this.out = replies;
        this.database = database;
    }

    /**
     * Start handling query requests.
     */
    public void start() {
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        // block until a request arrives
                        String query = in.take();
                        // compute the answer and send it back
                        String result = database.query(query);
                        out.put(new QueryResult(query,result));
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
            }
        }).start();
    }
}

class QueryResult {
    private final String input;
    private final String output;

    public QueryResult(String input, String output) {
        this.input = input;
        this.output = output;
    }
}

public class ServerQueue {

    ServerQueue(RestaurantDBServer server){

        BlockingQueue<String> requests = new LinkedBlockingQueue<>();
        BlockingQueue<QueryResult> replies = new LinkedBlockingQueue<>();

        QueryFinder finder = new QueryFinder(requests,replies,server.getRestaurantDB());
    }
}
