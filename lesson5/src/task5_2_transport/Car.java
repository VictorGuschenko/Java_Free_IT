package task5_2_transport;

public class Car extends LandTransport {
    private final BodyStyle BODY_STYLE;
    private final int MAX_PASSENGERS;

    public Car(int HORSE_POWER, int MAX_SPEED,
               Brand brand, int WEIGHT,
               int WHEEL_NUMBERS, double FUEL_CONSUMPTION,
               BodyStyle bodyStyle, int maxPassengers) {
        super(HORSE_POWER, MAX_SPEED, brand, WEIGHT, WHEEL_NUMBERS, FUEL_CONSUMPTION);
        this.BODY_STYLE = bodyStyle;
        this.MAX_PASSENGERS = maxPassengers;
    }

    public void printCarStatement (double timeHours){
        double distance = getMAX_SPEED() * timeHours;
        System.out.println("За время " + timeHours + " ч, автомобиль " + this.getBRAND() +
                " двигаясь с максимальной скоростью " + getMAX_SPEED() +
                " км/ч проедет " + distance + " км  и израсходует " +
                fuelConsumptionCalculate(distance, getFUEL_CONSUMPTION()) +
                " литров топлива.");
    }
    private double fuelConsumptionCalculate(double distance, double fuelConsumption){
        return distance * fuelConsumption * 0.01;
    }

    @Override
    public String toString() {
        return  "Car{" +
                "HORSE_POWER=" + getHORSE_POWER() +
                ", MAX_SPEED=" + getMAX_SPEED() +
                ", brand=" + getBRAND() +
                ", WEIGHT=" + getWEIGHT() + "kg" +
                ", kWattPower=" + powerConvert() +
                ", WHEEL_NUMBERS=" + getWHEEL_NUMBERS() +
                ", FUEL_CONSUMPTION=" + getFUEL_CONSUMPTION() +
                ", bodyStyle=" + BODY_STYLE +
                ", maxPassengers=" + MAX_PASSENGERS +
                '}';
    }
}
