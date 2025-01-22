package de.das_rsg.cs_workshop.java_app.entities;

import de.das_rsg.cs_workshop.java_app.entities.core.Entity;

public class Room extends Entity{

    private int roomnumber;
    private int kapazitaet;

    public Room(){
        super();
    }

    public Room(int rn, int k){
        super();
        roomnumber = rn;
        kapazitaet = k;
    }

    public int getRoomnumber(){
        return roomnumber;
    }

    public void setRoomnumber(int rn){
        roomnumberm = rn;
    }

    public int getKapazitaet(){
        return kapazitaet;
    }

    public void setKapazitaet(int k){
        kapazitaet = k;
    }

}
