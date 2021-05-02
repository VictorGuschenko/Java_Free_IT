package task5_2_transport;

public class Car extends LandTransport {
    private final BodyStyle bodyStyle;
    private final int maxPassengers;

    public Car(int horsePower, int maxSpeed,
               Brand brand, int weight,
               int wheelNumbers, double fuelConsumption,
               BodyStyle bodyStyle, int maxPassengers) {
        super(horsePower, maxSpeed, brand, weight, wheelNumbers, fuelConsumption);
        this.bodyStyle = bodyStyle;
        this.maxPassengers = maxPassengers;
    }

    public void printCarStatement (double timeHours){
        double distance = getMaxSpeed() * timeHours;
        System.out.println("За время " + timeHours + " ч, автомобиль " + this.getBrand() +
                " двигаясь с максимальной скоростью " + getMaxSpeed() +
                " км/ч проедет " + distance + " км  и израсходует " +
                fuelConsumptionCalculate(distance, getFuelConsumption()) +
                " литров топлива.");
    }
    private double fuelConsumptionCalculate(double distance, double fuelConsumption){
        return distance * fuelConsumption * 0.01;
    }

    @Override
    public String toString() {
        return  "Car{" +
                "HORSE_POWER=" + getHorsePower() +
                ", MAX_SPEED=" + getMaxSpeed() +
                ", brand=" + getBrand() +
                ", WEIGHT=" + getWeight() + "kg" +
                ", kWattPower=" + powerConvert() +
                ", WHEEL_NUMBERS=" + getWheelNumbers() +
                ", FUEL_CONSUMPTION=" + getFuelConsumption() +
                ", bodyStyle=" + bodyStyle +
                ", maxPassengers=" + maxPassengers +
                '}';
    }
}
