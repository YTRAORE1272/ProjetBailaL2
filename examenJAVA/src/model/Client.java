package model;

public class Client extends Personne {
    private String observation;
    public Client() {
        super();
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return "Client: "  + super.toString() +
                "observation='" + observation;
    }
}
