package edu.fbansept.avecSingeton;

import java.util.ArrayList;

public class Promotion {
    private ArrayList<Etudiant> listeEtudiant = new ArrayList<>();;

    public ArrayList<Etudiant> getListeEtudiant() {
        return listeEtudiant;
    }

    public void setListeEtudiant(ArrayList<Etudiant> listeEtudiant) {
        this.listeEtudiant = listeEtudiant;
    }
}
