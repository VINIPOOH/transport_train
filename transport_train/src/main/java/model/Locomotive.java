package model;

public class Locomotive extends Carriage{
    private final  int maxCarriageWeight;

    public Locomotive(int weight, int maxCarriageWeight) {
        super(weight);
        this.maxCarriageWeight = maxCarriageWeight;
    }

    @Override
    public String toString() {
        return "Locomotive{" +
                "maxCarriageWeight=" + maxCarriageWeight +
                '}';
    }
}
