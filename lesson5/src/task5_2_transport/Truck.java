package task5_2_transport;

public class Truck extends LandTransport{
    private final double LIFT_CAPACITY;

    public Truck(int HORSE_POWER, int MAX_SPEED,
                 Brand brand, int WEIGHT,
                 int WHEEL_NUMBERS, double FUEL_CONSUMPTION,
                 double LIFT_CAPACITY) {
        super(HORSE_POWER, MAX_SPEED, brand, WEIGHT, WHEEL_NUMBERS, FUEL_CONSUMPTION);
        this.LIFT_CAPACITY = LIFT_CAPACITY;
    }
    public void isTrackOverloaded(double cargo){
        System.out.println(cargo > this.LIFT_CAPACITY ? "Вам нужен грузовик побольше" : "Грузовик загружен");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "HORSE_POWER=" + getHORSE_POWER() +
                ", MAX_SPEED=" + getMAX_SPEED() +
                ", brand=" + getBRAND() +
                ", WEIGHT=" + getWEIGHT() + "kg" +
                ", kWattPower=" + powerConvert() +
                ", WHEEL_NUMBERS=" + getWHEEL_NUMBERS() +
                ", FUEL_CONSUMPTION=" + getFUEL_CONSUMPTION() +
                "liftCapacity=" + LIFT_CAPACITY +
                '}';
    }
}
