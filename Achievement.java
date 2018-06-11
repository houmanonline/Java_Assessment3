package Question1;

import java.io.Serializable;
/**
 * ICTPRG523 Apply Advanced Programming Skills In Another Language
 * Student Name: Man Hou
 * Student ID :10042466
 */
public class Achievement implements Serializable{
    
    private static final long serialVersionUID = 5950169519310163575L;
    //Constructor
    public Achievement(String description, int level, int maximum) {
        this.description = description;
        this.level = level;
        this.maximum = maximum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
    private String description;
    private int level;
    private int maximum;
    
}
