package de.das_rsg.cs_workshop.java_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/room")
@RestController
public class RoomController {
    
    private String[] room;
    public RoomController(){
    
    }

    @GetMapping
    public String testRoom(@RequestParam int index) {
        if (index == 0) {
            return room[0];
        }
        if (index - 1 == room.length) {
            return room[index - 1];
        } else {
            return "Raum nicht gefunden";
            
        }
    } 
}