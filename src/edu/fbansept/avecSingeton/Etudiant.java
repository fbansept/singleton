package edu.fbansept.avecSingeton;

public class Etudiant {

    public void entrerDansLaSalle(int index){
        Ecole.getInstance().getListeSalle().get(index).ajouterEtudiant(this);
    }
}
