package db;

import model.Carriage;
import model.ComfortTypes;
import model.Locomotive;
import model.PassengerCarriage;

public class TrainRepository {
    public static Carriage[] getCarriages() {

        Carriage[] carriages = {new Locomotive(100, 3000)
                , new PassengerCarriage(100, 1, ComfortTypes.BUSINESS_CLASS)
                , new PassengerCarriage(100, 2, ComfortTypes.ECONOMY_CLASS)
                , new PassengerCarriage(100, 3, ComfortTypes.BUSINESS_CLASS)
        };
        return carriages;
    }
}
