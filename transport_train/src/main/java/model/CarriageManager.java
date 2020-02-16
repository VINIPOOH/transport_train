package model;

import db.TrainRepository;

import java.util.ArrayList;

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

    public ArrayList<PassengerCarriage> getWagonsWithAmountPassengersInRange(int flor, int ceiling) {
        return train.getPassengerCarriageWithAmountPassengerInRange(flor, ceiling);
    }

    public int countAmountPassengers() {
        return train.countAmountPassengers();
    }

    public int WeightTrain() {
        return train.getWeightTrain();
    }
}
