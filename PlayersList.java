/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class PlayersList {
    private ArrayList<Players> pl;

    public ArrayList<Players> getPl() {
        return pl;
    }

    public PlayersList() {
        this.pl = new ArrayList<>();
    }
    
    public void populatePlayerList(Players player)
    {
        pl.add(player);
    }
    
    public Players getPlayer(int i)
    {
        return pl.get(i);
    }
}
