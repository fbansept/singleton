package edu.fbansept.sansSingleton;

import java.util.ArrayList;

public final class Ecole {

    private ArrayList<Salle> listeSalle = new ArrayList<>();
    private ArrayList<Promotion> listePromotion = new ArrayList<>();

    public ArrayList<Salle> getListeSalle() {
        return listeSalle;
    }

    public void setListeSalle(ArrayList<Salle> listeSalle) {
        this.listeSalle = listeSalle;
    }

    public ArrayList<Promotion> getListePromotion() {
        return listePromotion;
    }

    public void setListePromotion(ArrayList<Promotion> listePromotion) {
        this.listePromotion = listePromotion;
    }
}
