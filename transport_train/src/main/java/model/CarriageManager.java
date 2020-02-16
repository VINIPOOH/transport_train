package model;

import db.TrainRepository;

public class CarriageManager {
    private Train train;

    public CarriageManager() {
        this.train = TrainRepository.findTrain();
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public void sortTrainByComfortType() {
        train.sortTrainByComfortType();
    }

    public Carriage[] getWagonsWithAmountPassengersInRange(int flor, int ceiling) {
        return train.getPassengerCarriageWithAmountPassengerInRange(flor, ceiling);
    }

    public int countAmountPassengers() {
        return train.countAmountPassengers();
    }

    public int WeightTrain() {
        return train.WeightTrain();
    }
}
