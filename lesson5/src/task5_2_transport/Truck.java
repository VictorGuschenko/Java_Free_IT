package task5_2_transport;

public class Truck extends LandTransport{
    private double liftCapacity;

    public Truck(int HORSE_POWER, int MAX_SPEED,
                 Brand brand, int WEIGHT,
                 int WHEEL_NUMBERS, double FUEL_CONSUMPTION,
                 double liftCapacity) {
        super(HORSE_POWER, MAX_SPEED, brand, WEIGHT, WHEEL_NUMBERS, FUEL_CONSUMPTION);
        this.liftCapacity = liftCapacity;
    }
    public boolean isTrackOverloaded(double cargo){
        if (cargo > this.liftCapacity) {
            System.out.println("Вам нужен грузовик побольше");
            return true;
        } else {
            System.out.println("Грузовик загружен");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "HORSE_POWER=" + getHORSE_POWER() +
                ", MAX_SPEED=" + getMAX_SPEED() +
                ", brand=" + getBrand() +
                ", WEIGHT=" + getWEIGHT() + "kg" +
                ", kWattPower=" + powerConvert() +
                ", WHEEL_NUMBERS=" + getWHEEL_NUMBERS() +
                ", FUEL_CONSUMPTION=" + getFUEL_CONSUMPTION() +
                "liftCapacity=" + liftCapacity +
                '}';
    }
}
