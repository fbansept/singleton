package edu.fbansept.sansSingleton;

public class Etudiant {

    private Ecole ecole;

    public Etudiant(Ecole ecole) {
        this.ecole = ecole;
    }

    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }

    public void entrerDansLaSalle(int index){
        ecole.getListeSalle().get(index).ajouterEtudiant(this);
    }
}
