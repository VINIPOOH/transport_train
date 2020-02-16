package model;

public enum ComfortTypes {
    BUSINESS_CLASS(300), ECONOMY_CLASS(100);
    private int priceByCyclometer;

    ComfortTypes(int priceByCyclometer) {
        this.priceByCyclometer = priceByCyclometer;
    }

    public int getPriceByCyclometer() {
        return priceByCyclometer;
    }

    public void setPriceByCyclometer(int priceByCyclometer) {
        this.priceByCyclometer = priceByCyclometer;
    }

    public int countCostForAllWay(int amountCyclometers) {
        return priceByCyclometer * amountCyclometers;
    }

    @Override
    public String toString() {
        return "ComfortTypes{" +
                "priceByCyclometer=" + priceByCyclometer +
                '}';
    }
}
