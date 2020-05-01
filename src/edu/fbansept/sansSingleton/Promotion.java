package edu.fbansept.sansSingleton;

import java.util.ArrayList;

public class Promotion {

    private Ecole ecole;

    private ArrayList<Etudiant> listeEtudiant = new ArrayList<>();;

    public Promotion(Ecole ecole) {
        this.ecole = ecole;
    }

    public ArrayList<Etudiant> getListeEtudiant() {
        return listeEtudiant;
    }

    public void setListeEtudiant(ArrayList<Etudiant> listeEtudiant) {
        this.listeEtudiant = listeEtudiant;
    }
}
