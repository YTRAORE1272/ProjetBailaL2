package model;

public class AV extends Article{
    private double prixVente;

    public AV() {
        super();
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    @Override
    public String toString() {
        return "Article de Vente: " + super.toString() +
                "prixVente=" + prixVente;
    }
}
