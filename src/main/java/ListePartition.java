package main.java;

import java.util.ArrayList;
import java.util.List;

public class ListePartition {

    public static List<List<Integer>> partition(final List<Integer> liste, final Integer taille) {
        List<List<Integer>> listeDeSousListe = new ArrayList<>();

        for (int i = 0; i < liste.size(); i += taille) {
            listeDeSousListe.add(liste.subList(i, Math.min(liste.size(), i + taille)));
        }
        return listeDeSousListe;
    }

    public static void main(String[] args) {
        List<Integer> listeATester = new ArrayList<>();
        listeATester.add(1);
        listeATester.add(2);
        listeATester.add(3);
        listeATester.add(4);
        listeATester.add(5);
        listeATester.add(6);
        listeATester.add(7);
        List<List<Integer>> listeARetourner = ListePartition.partition(listeATester, 3);
        System.out.println(listeARetourner);
    }
}
