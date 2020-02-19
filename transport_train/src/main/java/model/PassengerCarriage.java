package model;

public class PassengerCarriage extends Carriage {
    private final ComfortTypes comfortTypes;
    private final int maxAmountPassengers;
    private int carriageNumber;

    public PassengerCarriage(int weight, int max_amount_passengers, ComfortTypes comfortType) {
        super(weight);
        this.comfortTypes = comfortType;
        final int i;

        maxAmountPassengers = max_amount_passengers;
    }

    public ComfortTypes getComfortTypes() {
        return comfortTypes;
    }

    public int getMaxAmountPassengers() {
        return maxAmountPassengers;
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    public String getStringRepresentation() {
        return "PassengerCarriage{" +
                "COMFORT_TYPE=" + comfortTypes +
                ", MAX_AMOUNT_PASSENGERS=" + maxAmountPassengers +
                ", CarriageNumber=" + carriageNumber +
                '}';
    }


}
