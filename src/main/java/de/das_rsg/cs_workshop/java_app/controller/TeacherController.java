package de.das_rsg.cs_workshop.java_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/lehrer")
@RestController
public class TeacherController {

    private String[] lehrer;
    public TeacherController() {
        this.lehrer = new String[] {"SBK", "TES", "ZAP"};
    }

    @GetMapping
    public String testLehrer(@RequestParam int index) {
        if (index == 0) {
            return lehrer[0];
            // Test
        }
        if (index - 1 == lehrer.length) {
            return lehrer[index - 1];
        } else {
            return "Lehrer nicht gefunden";
            
        }
    } 
}
