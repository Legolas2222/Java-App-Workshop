package de.das_rsg.cs_workshop.java_app.entities;

import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

import de.das_rsg.cs_workshop.java_app.entities.core.Entity;

public class Timetable extends Entity {
    private static Lesson[] lessons;	// Array of lessons

    public Timetable() {
        super();
    }

    public Lesson[] getLessons() {
        return lessons;
    }

    private void setLessons(Lesson[] lessons) {
        Timetable.lessons = lessons;
    }

    public void createTest() {
        Lesson[] newLessons = new Lesson[4];
        for (int i = 0; i < 4; i++) {
            newLessons[i] = new Lesson(LocalDateTime.of(2025, 1, 29, 7+i, 55, 0), LessonState.FINDET_STATT);
        }
        setLessons(newLessons);
    }

    public String toString() {
        String output = "";
        for (Lesson lesson : lessons) {
            output += lesson.toString() + "\n\n";
        }
        return output;
    }
}
