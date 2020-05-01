package edu.fbansept.sansSingleton;

import java.util.ArrayList;

public class Salle {

    private Professeur professeur;

    private ArrayList<Etudiant> listeEtudiant = new ArrayList<>();

    public void ajouterEtudiant(Etudiant etudiant) {
        this.listeEtudiant.add(etudiant);
        System.out.println("nombre d'etudiant : " + this.listeEtudiant.size());
    }






    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public ArrayList<Etudiant> getListeEtudiant() {
        return listeEtudiant;
    }

    public void setListeEtudiant(ArrayList<Etudiant> listeEtudiant) {
        this.listeEtudiant = listeEtudiant;
    }
}
