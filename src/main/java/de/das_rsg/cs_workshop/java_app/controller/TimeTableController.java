package de.das_rsg.cs_workshop.java_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter; 


import de.das_rsg.cs_workshop.java_app.services.TimetableService;
@RestController
@RequestMapping("/timetable")
public class TimeTableController {
    private static TimetableService tts = new TimetableService();
    public TimeTableController() {
        
    }

    @GetMapping
    public String getTimetable() {
        /*ObjectWriter om = new ObjectMapper().writer().withDefaultPrettyPrinter();
        try {
            String json = om.writeValueAsString(timetable);
            return json;
        } catch (Exception e) {
            return e.getMessage();
        }*/
    try {
        return tts.createNewLesson().get();
    } catch (Exception e) {
        return e.getMessage();
    }
    }


    
}
