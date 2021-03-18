package task26_appliance;

public class WashingMachine extends WashingAppliance implements Plugging {

    int rpm;

    public WashingMachine(Brand brand, Dimensions dimensions,
                          PowerSupply powerSupply, String name,
                          double weight, double waterConsumption,
                          String loadingType, int rpm) {
        super(brand, dimensions, powerSupply, name, weight,
                waterConsumption, loadingType);
        this.rpm = rpm;
    }

    public void spinning(int rpm) {
        if(!isTurnOn){
            System.out.println("Please plug the washing machine in!");
            return;
        }
        System.out.println("Spinning with " + rpm + " rpm");
    }

    @Override
    public void plugIn() {
        System.out.println("Washing machine's been plugged in");
        isTurnOn = true;
    }

    @Override
    public void plugOut() {
        System.out.println("Washing machine's been plugged out");
        isTurnOn = false;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "brand=" + brand +
                ", dimensions=" + dimensions +
                ", powerSupply=" + powerSupply +
                ", name='" + name + '\'' +
                ", weight=" + weight + "kg" +
                ", waterConsumption=" + waterConsumption + "l per/h" +
                ", loadingType='" + loadingType + '\'' +
                ", rpm=" + rpm +
                '}';
    }
}
