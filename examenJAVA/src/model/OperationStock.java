package model;

import java.time.LocalDate;

public abstract class OperationStock {
    private int id;
    private int cptIdOperationStock;
    protected LocalDate date = LocalDate.now();
    protected int qte;
    protected String observation;

    protected OperationStock() {
        cptIdOperationStock = 0;
        id = cptIdOperationStock++;
    }
    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", date=" + date +
                ", qte=" + qte +
                ", observation= " + observation + '\'';
    }
}
