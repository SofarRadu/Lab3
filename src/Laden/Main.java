package Laden;

import java.util.ArrayList;

public class Main {
    public void sortByRabatt(ArrayList<Produkt> liste) {

    }

    public String findeTeuerste(ArrayList<Produkt> liste) {
        double min = 9999;
        String name = "";
        for (Produkt i : liste) {
            if (i.getBasisPreis() < min) {
                min = i.getBasisPreis();
                name = i.getName();
            }
        }
        return name;
    }

    public String gunstigste(ArrayList<Produkt> liste){
        int min = 999;
        String name = "";
        for(Produkt i:liste){
            if(i.getAnzahlTage()<min){
                min = i.getAnzahlTage();
                name = i.getName();
            }
        }
        return name;
    }

    public static void main(String args[]) {
        ArrayList<Produkt> produktListe = new ArrayList<Produkt>();
        Produkt prod1 = new Produkt("Colgate", 22.23, 20);
        Produkt prod2 = new Produkt("Clorox", 250, 15);
        Produkt prod3 = new Produkt("Tide Pods", 180.05, 21);
        Produkt prod4 = new Produkt("Dog Food", 150.32, 4);
        Produkt prod5 = new Produkt("Beer", 160.42, 25);
        produktListe.add(prod1);
        produktListe.add(prod2);
        produktListe.add(prod3);
        produktListe.add(prod4);
        produktListe.add(prod5);
        Produkt neuListe[];
        for (Produkt p : produktListe) {
            p.rabbatAddieren();
            System.out.println(p.getBasisPreis());
        }

    }

}