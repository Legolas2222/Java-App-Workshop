package de.das_rsg.cs_workshop.java_app.entities;

import de.das_rsg.cs_workshop.java_app.entities.core.Entity;


public class Raum extends Entity  {
    private int Nummer;
    private int anzahl;

    public Raum(){
        super();
    }
    public int getNummer(){
        return Nummer;
    }
    public void setNummer(int pnummer){
        Nummer=pnummer;
    }
    public int getAnzahl(){
        return anzahl ;
    }
    public void SetAnzahl(int panzahl)
    {anzahl=panzahl;}

    @Override
    public String toString(){
     return id+"Nummer"+"anzahl" ;  
    }
}
