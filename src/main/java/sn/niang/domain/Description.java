package sn.niang.domain;

public class Description {
    private int id;
    private String marque;
    private String couleur;
    private int nbRoues;

    public Description(int id, String marque, String couleur, int nbRoues) {
        this.id = id;
        this.marque = marque;
        this.couleur = couleur;
        this.nbRoues = nbRoues;
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getNbRoues() {
        return nbRoues;
    }
}
