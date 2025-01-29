package de.das_rsg.cs_workshop.java_app.entities;

import de.das_rsg.cs_workshop.java_app.entities.core.Entity;

// Wie ihr sehen könnt, erbt die Klasse Teacher von der Klasse Entity
// Das bedeutet, dass die Klasse Teacher alle Methoden und Attribute von Entity übernimmt
// Das ist in diesem Fall sinnvoll, da jede Entität eine eindeutige ID haben muss
public class Teacher extends Entity {
    private String firstName;
    private String lastName;
    // Repraesenteiert das Kuerzel
    private String acronym;

    public Teacher() {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    @Override
    public String toString() {
        return "Lehrer: " + firstName + " " + lastName + " (" + acronym + ")";
    }
}