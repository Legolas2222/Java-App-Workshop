package de.das_rsg.cs_workshop.java_app.entities.core;

import java.util.UUID;


public class Entity {
    private final String id;

    public Entity() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }
}
