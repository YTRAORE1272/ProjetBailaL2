package model;

public class Utlisateur extends Personne {
    private String  login;
    private String motDePasse;
    protected double salaire;

    protected Utlisateur() {
        super();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return   super.toString() +
                "salaire=" + salaire +
                ", login='" + login + '\'' +
                ", motDePasse='" + motDePasse + "\' ";
    }
}
