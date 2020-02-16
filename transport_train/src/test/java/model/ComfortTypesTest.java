package model;

import org.junit.Assert;
import org.junit.Test;

public class ComfortTypesTest {

    @Test()
    public void setPriceByCyclometer() {
        int amountKM = 1000;
        for (ComfortTypes comfortTypes : ComfortTypes.values()) {
            int priceForKM = comfortTypes.getPriceByCyclometer();
            int correctAnswer = priceForKM * amountKM;
            Assert.assertTrue(correctAnswer == comfortTypes.countCostForAllWay(amountKM));
        }
    }
}