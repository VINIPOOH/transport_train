package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TrainTest {

    Train train;

    @Before
    public void setUp() throws Exception {
        Carriage[] carriages = {new Locomotive(100, 3000)
                , new PassengerCarriage(100, 1, ComfortTypes.BUSINESS_CLASS)
                , new PassengerCarriage(100, 2, ComfortTypes.ECONOMY_CLASS)
                , new PassengerCarriage(100, 3, ComfortTypes.BUSINESS_CLASS)
        };
        train = new Train(carriages, 3);
    }

    @Test
    public void getPassengerCarriageWithAmountPassengerInRangeCheckOnIncludeBorderValues() {
        int amountCorrectWagons = 3;
        int flor = 1;
        int ceiling = 3;
        ArrayList<PassengerCarriage> carriages = train.getPassengerCarriageWithAmountPassengerInRange(flor, ceiling);
        for (PassengerCarriage carriage : carriages) {
            Assert.assertTrue(carriage.getMaxAmountPassengers() >= flor
                    && carriage.getMaxAmountPassengers() <= ceiling);
        }
        Assert.assertTrue(carriages.size() == amountCorrectWagons);
    }

    @Test
    public void sortTrainByComfortType() {
        train.sortTrainByComfortType();
        Carriage[] carriages = train.getCarriages();
        Assert.assertTrue(((PassengerCarriage) carriages[0]).getComfortTypes()
                .equals(ComfortTypes.BUSINESS_CLASS));
        Assert.assertTrue(((PassengerCarriage) carriages[1]).getComfortTypes()
                .equals(ComfortTypes.BUSINESS_CLASS));
        Assert.assertTrue(((PassengerCarriage) carriages[2]).getComfortTypes()
                .equals(ComfortTypes.ECONOMY_CLASS));
        Assert.assertTrue(carriages[3] instanceof Locomotive);
    }

    @Test
    public void countAmountPassengers() {
        Assert.assertTrue(train.countAmountPassengers() == 6);
    }

    @Test
    public void getWeightTrain() {
        Assert.assertTrue(train.getWeightTrain() == 400);
    }
}