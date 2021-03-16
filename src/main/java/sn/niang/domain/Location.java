package sn.niang.domain;

public class Location {
    private int id;
    private String date;
    private String periode;
    private User client;
    private Vehicule vehicule;

    public Location(int id, String date, String periode, User client, Vehicule vehicule) {
        this.id = id;
        this.date = date;
        this.periode = periode;
        this.client = client;
        this.vehicule = vehicule;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getPeriode() {
        return periode;
    }

    public User getClient() {
        return client;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }
}
