package model;

public class ApprovisionnementAC extends OperationStock {
    private double prixApprovisionnementAC;
    private double montantApprovisionnementAC;

    public ApprovisionnementAC() {
        super();
    }

    public double getPrixApprovisionnementAC() {
        return prixApprovisionnementAC;
    }

    public void setPrixApprovisionnementAC(double prixApprovisionnementAC) {
        this.prixApprovisionnementAC = prixApprovisionnementAC;
    }

    public double getMontantApprovisionnementAC() {
        return montantApprovisionnementAC;
    }

    public void setMontantApprovisionnementAC(double montantApprovisionnementAC) {
        this.montantApprovisionnementAC = montantApprovisionnementAC;
    }

    @Override
    public String toString() {
        return "Approvisionnementd'Article de Confection :" + super.toString() +
                "prixApprovisionnementAC=" + prixApprovisionnementAC +
                ", montantApprovisionnementAC=" + montantApprovisionnementAC;
    }
}
