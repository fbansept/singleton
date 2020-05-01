package edu.fbansept.avecSingeton;

public class MainAvecSingleton {

    public static void main(String[] args) {

        Etudiant etudiant1 = new Etudiant();

        Promotion promotion1 = new Promotion();
        promotion1.getListeEtudiant().add(etudiant1);

        Salle salle1 = new Salle();

        Ecole.getInstance().getListePromotion().add(promotion1);
        Ecole.getInstance().getListeSalle().add(salle1);

        etudiant1.entrerDansLaSalle(0);
    }
}
