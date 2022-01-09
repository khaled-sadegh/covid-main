package app.BeanPackage;

import app.BeanPackage.Lieu;

public class Activite {
    private String nom;
    private Lieu lieu;
    private String HeureDebut;
    private String HeureFin;

    public Activite(String nom, Lieu lieu, String HeureDebut, String HeureFin){
        this.nom = nom;
        this.lieu = lieu;
        this.HeureDebut = Heuredebut;
        this.HeureFin = HeureFin;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public String getHeureDebut() {
        return HeureDebut;
    }

    public String getHeureFin() {
        return HeureFin;
    }

    public void setHeureFin(String heureFin) {
        HeureFin = heureFin;
    }

    public void setHeureDebut(String heureDebut) {
        HeureDebut = heureDebut;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }
}