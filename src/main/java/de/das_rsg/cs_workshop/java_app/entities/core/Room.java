package de.das_rsg.cs_workshop.java_app.entities.core;

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

    public static Room roomTest(){
        return new Room(104,30);
    }

    public int getRoomnumber(){
        return roomnumber;
    }

    public int getKapazitaet(){
        return kapazitaet;
    }

    public void setRoomnumber(int rn){
        roomnumber = rn;
    }

    public void setKapazitaet(int k){
        kapazitaet = k;
    }

}