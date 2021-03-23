package task5_2_transport;

public abstract class LandTransport extends Transport {
    private final int WHEEL_NUMBERS;
    private final double FUEL_CONSUMPTION;

    public LandTransport(int HORSE_POWER, int MAX_SPEED,
                         Brand brand, int WEIGHT,
                         int WHEEL_NUMBERS, double FUEL_CONSUMPTION) {
        super(HORSE_POWER, MAX_SPEED, brand, WEIGHT);
        this.WHEEL_NUMBERS = WHEEL_NUMBERS;
        this.FUEL_CONSUMPTION = FUEL_CONSUMPTION;
    }

    public int getWHEEL_NUMBERS() {
        return WHEEL_NUMBERS;
    }

    public double getFUEL_CONSUMPTION() {
        return FUEL_CONSUMPTION;
    }

    @Override
    public String toString() {
        return "LandTransport{" +
                "WHEEL_NUMBERS=" + WHEEL_NUMBERS +
                ", FUEL_CONSUMPTION=" + FUEL_CONSUMPTION +
                '}';
    }
}
