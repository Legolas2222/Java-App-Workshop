package de.das_rsg.cs_workshop.java_app.entities;

import de.das_rsg.cs_workshop.java_app.entities.core.Entity;

public class Teacher extends Entity {
    private String firstName;
    private String lastName;
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
}