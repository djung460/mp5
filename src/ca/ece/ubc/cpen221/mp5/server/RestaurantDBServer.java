package ca.ece.ubc.cpen221.mp5.server;

// TODO: Implement a server that will instantiate a database, 
// process queries concurrently, etc.

import ca.ece.ubc.cpen221.mp5.RestaurantDB;
import org.antlr.v4.runtime.RecognitionException;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * RestaurantDBServer is a server that recieves queries and responds to queries. It
 * accepts requests of the form:
 * <query> ::= orExpr | randomReview | getRestaurant | addRestaurant | addUser | addReview
 * <randomReview> ::= 'randomReview' <LParen><string><RParen>
 * <getRestaurant> ::= 'getRestaurant' <LParen><string><RParen>
 * <addRestaurant> ::= 'addRestaurant' <LParen><string><RParen>
 * <addUser> ::= 'addUser' <LParen><string><RParen>
 * <addreview> ::= 'addReview' <LParen><string><RParen>
 * <orExpr> ::= <andExpr>(<or><andExpr>)*
 * <andExpr> ::= <atom>(<and><atom>)*
 * <atom> ::= <in>|<category>|<rating>|<price>|<name>|<LParen><orExpr><RParen>
 * <or> ::= "||"
 * <and> ::= "&&"
 * <in> ::= "in" <LParen><string><RParen>
 * <category> ::= "category" <LParen><string><RParen>
 * <name> ::= "name" <LParen><string><RParen>
 * <rating> ::= "rating" <LParen><range><RParen>
 * <price> ::= "price" <LParen><range><RParen>
 * <range> ::= [1-5]..[1-5]
 * <LParen> ::= "("
 * <RParen> ::= ")"
 * for each request, returns a reply of the form:
 * reply ::= (result | "error") "\n"
 * where result is the appropriate response to the query, "error" indicates a misformatted request
 * RestaurantDBServer can handle multiple clients at a time.
 */

public class RestaurantDBServer  {

	// Default port number, that server listens to connections
	public static final int RESTURANT_DB_PORT = 1234;

	private ServerSocket serverSocket;
	private RestaurantDB restaurantDB;
	// Rep Invariant: restaurantDB, serverSocket != null



	/**
	 * Makes a RestaurantDBServer that listens for conection on port
	 * 
	 * @param port port number, requires 0 <= port < 65535
	 * @param restaurants_data the name of a file that contains the restaurant details in JSON format;
	 * @param reviews_data the name of a file that contains user reviews in JSON format;
	 * @param users_data the name of a file with user details in JSON format.
	 * @throws IOException if there is issue creating serverSocket
	 */
	public RestaurantDBServer(int port, String restaurants_data, String reviews_data, String users_data) throws IOException {
		serverSocket = new ServerSocket(port);
		restaurantDB = new RestaurantDB(restaurants_data,reviews_data,users_data);
	}

	/**
	 * Run the server, listening for connections and handling them.
	 *
	 * @throws IOException
	 *             if the main server socket is broken
	 */
	public void serve() throws IOException {
		while (true) {
			// block until a client connects
			final Socket socket = serverSocket.accept();
			// create a new thread to handle that client
			Thread handler = new Thread(new Runnable() {
				public void run() {
					try {
						try {
							handle(socket);
						} finally {
							socket.close();
						}
					} catch (IOException ioe) {
						// this exception wouldn't terminate serve(),
						// since we're now on a different thread, but
						// we still need to handle it
						ioe.printStackTrace();
					}
				}
			});
			// start the thread
			handler.start();
		}
	}

	/**
	 * Handle one client connection. Returns when client disconnects.
	 *
	 * @param socket
	 *            socket where client is connected
	 * @throws IOException
	 *             if connection encounters an error
	 */
	private void handle(Socket socket) throws IOException {
		System.err.println("client connected");

		// get the socket's input stream, and wrap converters around it to read a line at a time
		BufferedReader in = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));

		PrintWriter out = new PrintWriter(new OutputStreamWriter(
				socket.getOutputStream()), true);

		try {
			// each request is a single line containing a query
			for (String line = in.readLine(); line != null; line = in
					.readLine()) {
				System.err.println("query: " + line);
				try {
					String queryString = line;
					// compute answer and send back to client
					String result = restaurantDB.query(queryString);
					System.err.println("reply: " + result);
				} catch (RecognitionException e) {
					// complain about ill-formatted request
					System.err.println("reply: error");
					out.print("err\n");
				}
				// important! our PrintWriter is auto-flushing, but if it were
				// not:
				// out.flush();
			}
		} finally {
			out.close();
			in.close();
		}
	}

}
