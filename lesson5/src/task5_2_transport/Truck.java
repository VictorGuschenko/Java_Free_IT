package task5_2_transport;

public class Truck extends LandTransport{
    private final double liftCapacity;

    public Truck(int horsePower, int maxSpeed,
                 Brand brand, int weight,
                 int wheelNumbers, double fuelConsumption,
                 double liftCapacity) {
        super(horsePower, maxSpeed, brand, weight, wheelNumbers, fuelConsumption);
        this.liftCapacity = liftCapacity;
    }
    public void isTrackOverloaded(double cargo){
        System.out.println(cargo > this.liftCapacity ? "Вам нужен грузовик побольше" : "Грузовик загружен");
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                " lift_capacity" + liftCapacity +
                '}';

    }
}
