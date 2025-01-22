package de.das_rsg.cs_workshop.java_app.entities;

import de.das_rsg.cs_workshop.java_app.entities.core.Entity;

public class Room extends Entity{

    private int roomnumber; 

    public Room(){
        super();
    }

    public Room(int rn){
        super();
    }

    public int getRoomnumber(){
        return roomnumber;
    }

    public void setRoomnumber(int rn){
        roomnumberm = rn;
    }    

}
