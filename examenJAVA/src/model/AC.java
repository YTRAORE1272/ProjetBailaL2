package model;

public class AC extends Article{
    private int qteAchat;
    private double prixAchat;

    public AC() {
        super();
    }

    public int getQteAchat() {
        return qteAchat;
    }

    public void setQteAchat(int qteAchat) {
        this.qteAchat = qteAchat;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    @Override
    public String toString() {
        return "Article de Confection : " + super.toString() +
                "prixAchat=" + prixAchat +
                ", qteAchat=" + qteAchat;
    }
}
