package model;

public abstract class Article {
    private int idArticle;
    private int cptIdArticle;
    protected String libelle;
    protected int qteStock;
    protected double montant;
    private String photo;

    protected Article() {
        cptIdArticle = 0;
        idArticle = cptIdArticle++;
    }

    public int getIdArticle() {
        return idArticle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getQteStock() {
        return qteStock;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "id= " + idArticle +
                ", libelle= " + libelle + '\'' +
                ", qteStock= " + qteStock +
                ", montant= " + montant +
                ", photo= " + photo + '\'';
    }
}
