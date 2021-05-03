package task5_2_transport;

public abstract class Transport {
    private final int horsePower;
    private final int maxSpeed;
    private final Brand brand;
    private final int weight;

    public Transport(int horsePower, int maxSpeed, Brand brand, int weight) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.weight = weight;
    }

    public double powerConvert() {
        return this.horsePower * 0.74;
    }

    @Override
    public String toString() {
        return "Horse_power=" + horsePower +
                ", max_speed=" + maxSpeed +
                ", brand=" + brand +
                ", weight=" + weight +
                ", kWattPower=" + powerConvert() +
                ',';
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getWeight() {
        return weight;
    }
}
