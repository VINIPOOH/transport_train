package db;

import model.*;

public class TrainRepository {
    public static Train findTrain() {

        Carriage[] carriages = {new Locomotive(100, 3000)
                , new PassengerCarriage(100, 1, ComfortTypes.BUSINESS_CLASS)
                , new PassengerCarriage(100, 2, ComfortTypes.ECONOMY_CLASS)
                , new PassengerCarriage(100, 3, ComfortTypes.BUSINESS_CLASS)
        };
        return new Train(carriages, 1);
    }
}
