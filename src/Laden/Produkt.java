package Laden;

import java.util.ArrayList;

public class Produkt {

    private String name;
    private double basisPreis;
    private int anzahlTage;

    public Produkt(String name, double basisPreis, int anzahlTage) {
        double rounded = Math.round(basisPreis * 20.0) / 20.0;
        this.basisPreis = rounded;
        this.name = name;
        this.anzahlTage = anzahlTage;
    }

    public void rabbatAddieren() {
        if (this.anzahlTage > 10 && this.anzahlTage < 21) {
            this.basisPreis = this.basisPreis + (this.basisPreis * 0.1);
            update(this);
        } else if (this.anzahlTage > 20) {
            this.basisPreis += this.basisPreis * 0.2;
            update(this);
        }
    }

    public String hoherAlsHundert() {
        if (this.basisPreis > 100) {
            return this.name+"\n";
        }
        return "";
    }

//    public void sortNachRabatt(Array){
//
//    }

//    public String findeTeuerste(){
//        if this.basisPreis
//    }

    public void update(Produkt prod) {
        double rounded = Math.round(prod.basisPreis * 20.0) / 20.0;
        this.basisPreis = rounded;
    }

    public double getBasisPreis() {
        return basisPreis;
    }

    public void setBasisPreis(float basisPreis) {
        this.basisPreis = basisPreis;
    }

    public int getAnzahlTage() {
        return anzahlTage;
    }

    public void setAnzahlTage(int anzahlTage) {
        this.anzahlTage = anzahlTage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
