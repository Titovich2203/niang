package sn.niang.domain;

public class Vehicule {
    private int id;
    private String matricule;
    private User respAuto;
    private Description description;


    public Vehicule(int id, String matricule, User respAuto, Description description) {
        this.id = id;
        this.matricule = matricule;
        this.respAuto = respAuto;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getMatricule() {
        return matricule;
    }

    public User getRespAuto() {
        return respAuto;
    }

    public Description getDescription() {
        return description;
    }
}
