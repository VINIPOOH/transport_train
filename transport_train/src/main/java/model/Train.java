package model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Train {
    private Carriage[] train;

    public Train(Carriage[] train) {
        this.train = train;
    }

    public Carriage[] getTrain() {
        return train;
    }

    public void setTrain(Carriage[] train) {
        this.train = train;
    }

    public PassengerCarriage getPassengerCarriageWithAmountPassengerInRange(){
        throw new NotImplementedException();
    }

    public Carriage[] sortTrainByComfortType(){
        throw new NotImplementedException();
    }
}
