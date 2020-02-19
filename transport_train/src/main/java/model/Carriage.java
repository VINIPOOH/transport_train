package model;

public class Carriage {
    private final int weight;

    public Carriage(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getStringRepresentation() {
        return "Carriage{" +
                "WEIGHT=" + weight +
                '}';
    }

}
