package de.das_rsg.cs_workshop.java_app.entities.core;

// Paket um UUIDs zu generieren
import java.util.UUID;


public class Entity {
    private final String id;

    public Entity() {
        // Legt fest, das jede Entität eine eindeutige UUID haben muss
        // Eine UUID sieht ungefähr so aus: 550e8400-e29b-41d4-a716-446655440000
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }
}
