package de.das_rsg.cs_workshop.java_app.entities.core;

public class Raum extends Entity  {
    private int Nummer;
    private boolean besetzt;

    public Raum(){
        super();
    }
    public int getNummer(){
        return Nummer;
    }
    public void setNummer(int pnummer){
        Nummer=pnummer;
    }
    public boolean istbesetzt(){
        return besetzt ;
    }
    public void besetzen(boolean wechsel)
    {besetzt=wechsel;}
}
