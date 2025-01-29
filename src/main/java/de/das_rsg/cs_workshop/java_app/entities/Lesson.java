package de.das_rsg.cs_workshop.java_app.entities;

import java.time.LocalDateTime;


import de.das_rsg.cs_workshop.java_app.entities.core.Entity;

public class Lesson extends Entity{
    private int durationMinutes = 45;
    private LocalDateTime start;
    private LocalDateTime end;
    private Room room;
    private LessonState state;


    public Lesson(LocalDateTime start) {
        this.start = start;
        this.end = start.plusMinutes(durationMinutes);
    }

    public Lesson(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
        this.durationMinutes = (int) (end.toEpochSecond(null) - start.toEpochSecond(null)) / 60;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String toString() {
        return start.toString() + " - " + end.toString() + " in " + room.toString() + "with State" + state.toString();
    }
}
