package model;

public class Vente extends OperationStock {
    private double prixVente;
    private double montantVente;

    public Vente() {
        super();
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public double getMontantVente() {
        return montantVente;
    }

    public void setMontantVente(double montantVente) {
        this.montantVente = montantVente;
    }

    @Override
    public String toString() {
        return "Vente : " +  super.toString() +
                "prixVente=" + prixVente +
                ", montantVente=" + montantVente;
    }
}
