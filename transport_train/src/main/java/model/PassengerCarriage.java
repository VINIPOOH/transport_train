package model;

public class PassengerCarriage extends Carriage {
    private final ComfortTypes COMFORT_TYPE;
    private final int MAX_AMOUNT_PASSENGERS;
    private int CarriageNumber;
    
    public PassengerCarriage(int weight, int max_amount_passengers,ComfortTypes comfortType) {
        super(weight);
        this.COMFORT_TYPE =comfortType;
        MAX_AMOUNT_PASSENGERS = max_amount_passengers;
    }
}
