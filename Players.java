/*
 * This is the code of Question1 B
 */
package Question1;

import java.util.ArrayList;

/**
 * ICTPRG523 Apply Advanced Programming Skills In Another Language
 * Student Name: Man Hou
 * Student ID :10042466
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
