package Question2c;

import Question1.Players;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * ICTPRG523 - Apply advanced programming skills in another language
 * Student ID:10042466
 * Student Name: Man Hou
 * Assessment3 Question 2 Section B & C
 */
public class Server {
    public final static int DEFAULT_PORT = 7000;
    
    private InetAddress ipClient;
    private ObjectInputStream inStream;
    private ObjectOutputStream outStream;
    private ServerSocket server;
    private Socket connection;
    //Constructor
    public Server(int port) {		// Set up server on a port
        try {
            // create a socket object
            server = new ServerSocket(port);
        } catch (IOException iox) {
            System.out.println("Cannot establish connection: " + iox);
        }
    }
    
    private ArrayList<Players> receivePlayersByOjects() throws IOException, ClassNotFoundException 
    {
        ArrayList<Players> playerList = new ArrayList();
        boolean cont = true;
        try{         
           while(cont){
              System.out.println("Waiting on port: " + server.getLocalPort());
              //Waiting for connection
              connection = server.accept();
              ipClient = connection.getInetAddress();
              System.out.println("\n Connected to:" + ipClient);
              inStream = new ObjectInputStream(connection.getInputStream());
              //Read objects from stream
              Players playerIn = (Players)inStream.readObject();
              //Add objects into an ArrayList
              if(playerIn != null)
              {             
                 playerList.add(playerIn);
                 System.out.println("Object received and added into ArrayList.");
              }
              else
              { 
                //if recive NULL object, send the ArrayList to client
                outStream = new ObjectOutputStream(connection.getOutputStream());
                outStream.writeObject(playerList);
                System.out.println("Send Players back to the client.");
                connection.close();
                System.out.println("Server is closed.");
                cont = false;}
           }
        }catch(EOFException e){
           //System.out.println(e.printStackTrace());
        }       
        return playerList;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {
        // Create an ArrayList of Players
        ArrayList<Players> players = new ArrayList();
        //Create the server object
        Server server = new Server(DEFAULT_PORT);
        players = server.receivePlayersByOjects();
        // Display the ArraList of Players
        System.out.println("Object in  ArrayList: " + players.size());
    }
}
