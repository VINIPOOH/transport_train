package model;

public class Carriage {
    private final int weight;

    public Carriage(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "WEIGHT=" + weight +
                '}';
    }
}
