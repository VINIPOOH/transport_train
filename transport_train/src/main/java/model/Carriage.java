package model;

public class Carriage {
    private final int weight;

    public int getWeight() {
        return weight;
    }

    public Carriage(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "WEIGHT=" + weight +
                '}';
    }
}
