package ca.ece.ubc.cpen221.mp5.server;

import java.io.*;
import java.net.Socket;

/**
 * Author: Dooj
 * Date: 2015-12-05.
 */
public class RestaurantDBClient {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    // Rep invariant : socket, in, out != null

    /**
     * Make a RestaurantDBClient and connect it to a server running on
     * hostname at the specified port.
     * @throws IOException if can't connect
     */
    public RestaurantDBClient(String hostname, int port) throws IOException {
        socket = new Socket(hostname,port);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
    }

    /**
     * Send a request to the server. Requires this is "open".
     * @param query to send off to server
     * @throws IOException if network or server failure
     */
    public void sendQuery(String query) throws IOException {
        out.print(query + "\n");
        out.flush();
    }

    /**
     * Get a reply from the next request that was submitted.
     * Requires this is "open".
     * @return the requested query results
     * @throws IOException if network or server failure
     */
    public String getReply() throws IOException {
        String reply = in.readLine();
        if (reply == null) {
            throw new IOException("connection terminated unexpectedly");
        }

        try {
            return in.readLine();
        } catch (NumberFormatException nfe) {
            throw new IOException("misformatted reply: " + reply);
        }
    }

    /**
     * Closes the client's connection to the server.
     * This client is now "closed". Requires this is "open".
     * @throws IOException if close fails
     */
    public void close() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}
