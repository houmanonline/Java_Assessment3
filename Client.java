package Question2c;

import Question1.Achievement;
import Question1.DisplayDetails;
import Question1.Players;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ICTPRG523 - Apply advanced programming skills in another language
 * Student ID:10042466
 * Student Name: Man Hou
 * Assessment3 Question 2 Section B & C
 */
public class Client {
    public final static int DEFAULT_PORT = 7000;
    private Socket connection;
    private ObjectOutputStream outStream;
    private ObjectInputStream inStream;
    private InetAddress ipLocal, ipServer;
    private int port;
    //constructor
    public Client(String serverName, int port) {
        try {
            // Identify server
            ipServer = InetAddress.getByName(serverName);  
            this.port = port;
        } catch (UnknownHostException uhx) {
            System.out.println("Cannot find server: " + uhx);
            ipServer = null;
        }
    } 
    //Send object to server
    private void sendPlayer(Players player) throws UnknownHostException, IOException
    {   
        connection = new Socket("localhost", port);
        ipLocal = InetAddress.getLocalHost();
        System.out.println("\n Client connected to:" + ipServer + 
                            "\n Client address is  :" + ipLocal);
        outStream = new ObjectOutputStream(connection.getOutputStream());
        outStream.writeObject(player);
        outStream.flush();
        outStream.close();
        if(player != null)
        System.out.println(player.getUsername() + " has been sent.");
        else
        System.out.println("Operating system signal has been sent. Connection closed.");
    }
    //send NULL to close the connection and recive ArrayList from server, then diaplay it.
    private void quitAndDisplay(Players player) throws UnknownHostException, IOException, ClassNotFoundException
    {   
        ArrayList<Players> playerList = new ArrayList();
        connection = new Socket("localhost", port);
        ipLocal = InetAddress.getLocalHost();
        System.out.println("\n Client connected to:" + ipServer + 
                            "\n Client address is  :" + ipLocal);
        outStream = new ObjectOutputStream(connection.getOutputStream());
        outStream.writeObject(player);
        inStream = new ObjectInputStream(connection.getInputStream());
        playerList = (ArrayList)inStream.readObject();
        //Display in console
        for (int i = 0 ; i < playerList.size(); i++)
        {
            System.out.println("Player:");
            System.out.println("Tag Name: " + playerList.get(i).getTagname());
            System.out.println("User Name: " + playerList.get(i).getUsername());
            ArrayList<Achievement> ach = playerList.get(i).getAchievements();
            for (int j = 0 ; j < ach.size(); j++)
            {
            System.out.println("Achievement: \nDescription = " + ach.get(j).getDescription() +  "\nLevel = " + ach.get(j).getLevel() + "\nMax = "  + ach.get(j).getMaximum());
            }
        }
    }
    // read players from CSV file and return an arraylist of players
    private ArrayList<Players> readFromFile(String path) throws IOException
    {
        Path pathToFile = Paths.get(path);
        ArrayList<Players> pl = new ArrayList();
        try (BufferedReader brPlayers = Files.newBufferedReader(pathToFile,
                    StandardCharsets.UTF_8))
        {
            String line = brPlayers.readLine();
            while (line != null)
            {
            String[] attributes = line.split(",");
            String title = attributes[0];
            if (title.equals("﻿Player"))
                {
                    Players playerInList = new Players();
                    playerInList.setUsername(attributes[1].trim());
                    playerInList.setTagname(attributes[2].trim());
                    // add player into ArrayList            
                    pl.add(playerInList);
                }
            else if(title.equals("Achievement"))
                {
                    String description = attributes[1].trim();
                    int level = Integer.parseInt(attributes[2].trim());
                    int maximum = Integer.parseInt(attributes[3].trim());
                    Achievement achievement = new Achievement(description, level, maximum);
                    // add achievements into player 
                    pl.get(pl.size() - 1).populateAchievements(achievement);
                }
            line = brPlayers.readLine();        
            }
    }catch (IOException ex) {
            Logger.getLogger(DisplayDetails.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return pl;
    }
    

    public static void main(String[] args) throws IOException, UnknownHostException, ClassNotFoundException
    {
        // Default server name
        String serverName = "localhost";	
        Client client = new Client(serverName, DEFAULT_PORT);
        boolean cont = true;
        while(cont){
            System.out.println("Please input command >");
            Scanner input = new Scanner(System.in);
            String cmd = input.nextLine();
            if (cmd.equalsIgnoreCase("send"))
            {
                // Read file and put into an ArrayList
                ArrayList<Players> pl = client.readFromFile("C:\\Users\\PC\\Desktop\\Players.csv");
                for (int i = 0; i < pl.size(); i++)
                {
                    client.sendPlayer(pl.get(i));
                }
            }else if (cmd.equalsIgnoreCase("quit"))
            {
                Players playerNull = new Players();
                playerNull = null;
                client.quitAndDisplay(playerNull);
                cont = false;
            }
            else
            {System.out.println("Unknown Command.");}
        }    
    } 
}
