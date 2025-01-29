package de.das_rsg.cs_workshop.java_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.das_rsg.cs_workshop.java_app.entities.Timetable;

@RestController
@RequestMapping("/timetable")
public class TimeTableController {
    private static Timetable timetable = new Timetable();
    public TimeTableController() {
        timetable.createTest();
    }

    @GetMapping
    public String getTimetable() {
        return timetable.toString();
    }


    
}
