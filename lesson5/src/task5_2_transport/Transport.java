package task5_2_transport;

public abstract class Transport {
    private final int HORSE_POWER;
    private final int MAX_SPEED;
    private final Brand brand;
    private final int WEIGHT;

    public Transport(int HORSE_POWER, int MAX_SPEED, Brand brand, int WEIGHT) {
        this.HORSE_POWER = HORSE_POWER;
        this.MAX_SPEED = MAX_SPEED;
        this.brand = brand;
        this.WEIGHT = WEIGHT;
    }

    public double powerConvert() {
        return this.HORSE_POWER * 0.74;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "HORSE_POWER=" + HORSE_POWER +
                ", MAX_SPEED=" + MAX_SPEED +
                ", brand=" + brand +
                ", WEIGHT=" + WEIGHT +
                ", kWattPower=" + powerConvert() +
                '}';
    }

    public int getHORSE_POWER() {
        return HORSE_POWER;
    }

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getWEIGHT() {
        return WEIGHT;
    }
}
