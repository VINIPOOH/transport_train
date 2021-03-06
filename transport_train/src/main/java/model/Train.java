package model;

import db.TrainRepository;

import java.util.ArrayList;
import java.util.Arrays;

public class Train {
    private Carriage[] carriages;
    private int trainNumber;

    public Train(Carriage[] carriages, int trainNumber) {
        this.carriages = carriages;
        this.trainNumber = trainNumber;
    }

    public Train(int trainNumber) {
        this.carriages = TrainRepository.getCarriages();
        this.trainNumber = trainNumber;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Carriage[] getCarriages() {
        return carriages;
    }

    public void setCarriages(Carriage[] carriages) {
        this.carriages = carriages;
    }

    public ArrayList<PassengerCarriage> getPassengerCarriageWithAmountPassengerInRange(int flor, int ceiling) {
        ArrayList<PassengerCarriage> toReturn = new ArrayList<>();
        for (Carriage carriage : carriages) {
            if (carriage instanceof PassengerCarriage
                    && ((PassengerCarriage) carriage).getMaxAmountPassengers() >= flor
                    && ((PassengerCarriage) carriage).getMaxAmountPassengers() <= ceiling) {
                toReturn.add((PassengerCarriage) carriage);
            }
        }
        return toReturn;
    }

    public void sortTrainByComfortType() {
        Arrays.sort(carriages, (Carriage c1, Carriage c2) -> {
            if (c1 instanceof PassengerCarriage) {
                if (c2 instanceof PassengerCarriage) {
                    return (((PassengerCarriage) c1).getComfortTypes().compareTo(((PassengerCarriage) c2).getComfortTypes()));
                } else {
                    return -1;
                }
            } else {
                if (c2 instanceof PassengerCarriage) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public int countAmountPassengers() {
        int toReturn = 0;
        for (Carriage carriage : carriages) {
            if (carriage instanceof PassengerCarriage) {
                toReturn += ((PassengerCarriage) carriage).getMaxAmountPassengers();
            }
        }
        return toReturn;
    }

    public int getWeightTrain() {
        int toReturn = 0;
        for (Carriage carriage : carriages) {
            toReturn += carriage.getWeight();
        }
        return toReturn;
    }
}
