package de.das_rsg.cs_workshop.java_app.services;

import java.util.concurrent.FutureTask;

public class TimetableService {
    public FutureTask<String> createNewLesson() {
        return new FutureTask<>(() -> {
            return "Neue Stunde";
        });
    }

}
