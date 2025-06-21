package model;

public class Fournisseur extends Personne{
    private String telephoneF;
    public Fournisseur() {
        super();
    }
    public String getTelephoneF() {
        return telephoneF;
    }
    public void setTelephoneF(String telephoneF) {
        this.telephoneF = telephoneF;
    }

    @Override
    public String toString() {
        return "Fournisseur : " + super.toString() +
                "telephoneF='" + telephoneF + '\'';
    }
}
