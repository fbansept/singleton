package edu.fbansept.sansSingleton;

public class MainSansSingleton {

    public static void main(String[] args) {

        Ecole ecole = new Ecole();

        Etudiant etudiant1 = new Etudiant(ecole);

        Promotion promotion1 = new Promotion(ecole);
        promotion1.getListeEtudiant().add(etudiant1);

        Salle salle1 = new Salle();

        ecole.getListePromotion().add(promotion1);
        ecole.getListeSalle().add(salle1);

        etudiant1.entrerDansLaSalle(0);
    }
}
