package de.das_rsg.cs_workshop.java_app.entities.core;

public class Schueler extends Entity{
    private String vorname;
    private String nachname;
    private int jahrgang;

    public Schueler(int jg, String vn, String nn){
        super();
        vorname = vn;
        nachname = nn;
        jahrgang = jg;
    }

    public String getVorname(){
        return vorname;
    }

    public String getNachname(){
        return nachname;
    }

    public int getJahrgang(){
        return jahrgang;
    }

    public void setJahrgang(int jg){
        jahrgang = jg;
    }
}