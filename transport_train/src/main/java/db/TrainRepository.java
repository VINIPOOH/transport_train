package db;

import model.*;

public class TrainRepository {
    public static Train findTrain() {

        Carriage[] forFirstTrain = {new Locomotive(200, 2000)
                , new PassengerCarriage(100, 30, ComfortTypes.BUSINESS_CLASS)};

        return new Train(forFirstTrain, 1);
    }
}
