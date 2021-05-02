package task5_2_transport;

public abstract class LandTransport extends Transport {
    private final int wheelNumbers;
    private final double fuelConsumption;

    public LandTransport(int horsePower, int maxSpeed,
                         Brand brand, int weight,
                         int wheelNumbers, double fuelConsumption) {
        super(horsePower, maxSpeed, brand, weight);
        this.wheelNumbers = wheelNumbers;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheelNumbers() {
        return wheelNumbers;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "LandTransport{" +
                "WHEEL_NUMBERS=" + wheelNumbers +
                ", FUEL_CONSUMPTION=" + fuelConsumption +
                '}';
    }
}
