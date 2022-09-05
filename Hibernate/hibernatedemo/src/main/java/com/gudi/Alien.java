package com.gudi;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity(name="AName")
public class Alien {

    @Id
    private int aid;
    
    private AlienName aname;
    
    private String color;

    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public AlienName getAname() {
        return aname;
    }
    public void setAname(AlienName aname) {
        this.aname = aname;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
    }

    
    
    
}
