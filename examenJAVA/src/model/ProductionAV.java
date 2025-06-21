package model;

public class ProductionAV extends OperationStock{
    public ProductionAV() {
        super();
    }

    @Override
    public String toString() {
        return "Production d'Article de Vente : " + super.toString();
    }
}
