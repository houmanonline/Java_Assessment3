package Question1;

import java.util.ArrayList;

/**
 * ICTPRG523 Apply Advanced Programming Skills In Another Language
 * Student Name: Man Hou
 * Student ID :10042466
 */
public class PlayersList {
    private ArrayList<Players> pl;

    public ArrayList<Players> getPl() {
        return pl;
    }
    //Constructor
    public PlayersList() {
        this.pl = new ArrayList<>();
    }
    // add objects into an ArrayList
    public void populatePlayerList(Players player)
    {
        pl.add(player);
    }
    
    public Players getPlayer(int i)
    {
        return pl.get(i);
    }
}
