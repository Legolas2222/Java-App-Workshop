package de.das_rsg.cs_workshop.java_app.entities;

import de.das_rsg.cs_workshop.java_app.entities.core.Entity;

public class Room extends Entity {
    private int number;
    private int capacity;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public Room() {
        super();
    }

    public static Room RoomTest() {
        Room room = new Room();
        room.setNumber(401);
        room.setCapacity(30);
        return room;
    }
    
    @Override
    public String toString() {
        return "Raum: " + number + " (Plätze: " + capacity + ")";
    }
}
