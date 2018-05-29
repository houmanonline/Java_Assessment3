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
public class Players {

    private ArrayList<Achievement> achievements;
    private String username;
    private String tagname;
    
    public Players() {
        this.username = " ";
        this.tagname = " "; 
        this.achievements = new ArrayList<>();
    }
    
     public ArrayList<Achievement> getAchievements() {
        return achievements;
    }
    public void populateAchievements(Achievement achievement)
    {
        achievements.add(achievement);
    }
    public Achievement getAchievement(int i)
    {
        return achievements.get(i);
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    
   
    
}
