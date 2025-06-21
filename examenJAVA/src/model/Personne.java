package model;

public abstract class Personne {
    private  int idPersonne;
    private int cptIdPersonne;
    protected String nom;
    protected String prenom;
    protected String adresse;
    protected String telephoneP;
    private String photo;

    protected Personne() {
        cptIdPersonne = 0;
        this.idPersonne = cptIdPersonne++;
    }

    public int getId() {
        return idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephoneP() {
        return telephoneP;
    }

    public void setTelephoneP(String telephoneP) {
        this.telephoneP = telephoneP;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return  "id= " + idPersonne +
                ", nom= " + nom + '\'' +
                ", prenom= " + prenom + '\'' +
                ", adresse= " + adresse + '\'' +
                ", telephoneP= " + telephoneP + '\'' +
                ", photo= " + photo + "\' ";
    }
}
