package main.test;

import main.java.ListePartition;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;



public class ListePartitionTest {

    @Test
    public void doitRetournerQuatreSousListeIdentiquesALaListeAttendue() {
        ArrayList<Integer> listeAPartitionner = creationListeAPartitionner();
        List<List<Integer>> resultatListeAttendue = creationResultatListeAttendue();
        List<List<Integer>> listeRetournee = ListePartition.partition(listeAPartitionner, 2);
        assertEquals(4, listeRetournee.size());
        assertEquals(resultatListeAttendue, listeRetournee);
    }

    @Test
    public void doitRetournerTroisSousListeAvecLaDerniereDeDeuxValeurs() {
        ArrayList<Integer> listeAPartitionner = creationListeAPartitionner();
        List<List<Integer>> listeRetournee = ListePartition.partition(listeAPartitionner, 3);
        assertEquals(3, listeRetournee.size());
        assertEquals(2, listeRetournee.get(listeRetournee.size() - 1).size());
    }

    private ArrayList<Integer> creationListeAPartitionner() {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            l1.add(i);
        }
        return l1;
    }

    private List<List<Integer>> creationResultatListeAttendue() {
        List<List<Integer>> resultatListeAttendue = new ArrayList<>();
        resultatListeAttendue.add(new ArrayList<>(Arrays.asList(1, 2)));
        resultatListeAttendue.add(new ArrayList<>(Arrays.asList(3, 4)));
        resultatListeAttendue.add(new ArrayList<>(Arrays.asList(5, 6)));
        resultatListeAttendue.add(new ArrayList<>(Arrays.asList(7, 8)));
        return resultatListeAttendue;
    }
}
