package de.das_rsg.cs_workshop.java_app.entities;

import java.time.LocalDateTime;


import de.das_rsg.cs_workshop.java_app.entities.core.Entity;

public class Lesson extends Entity{
    private int durationMinutes = 45;
    private LocalDateTime start;
    private LocalDateTime end;
    private Room room;
    private LessonState state;


    public Lesson(LocalDateTime start, LessonState state) {
        this.start = start;
        this.end = start.plusMinutes(durationMinutes);
        this.room = Room.RoomTest();
        this.state = state;
    }

    public Lesson(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
        this.durationMinutes = (int) (end.toEpochSecond(null) - start.toEpochSecond(null)) / 60;
        this.room = Room.RoomTest();
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String toString() {
        return "Start: " + start.toString() + " bis " + end.toString() + "\n in Raum: " + room.toString() + "\n mit Status" + state.toString() + "\n\t\t\t";
    }
}
