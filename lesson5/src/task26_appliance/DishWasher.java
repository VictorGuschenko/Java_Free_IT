package task26_appliance;

public class DishWasher extends WashingAppliance implements Plugging{
    int basketsAmount;

    public DishWasher(Brand brand, Dimensions dimensions,
                      PowerSupply powerSupply, String name,
                      double weight, double waterConsumption,
                      String loadingType, int basketsAmount) {
        super(brand, dimensions, powerSupply, name, weight,
                waterConsumption, loadingType);
        this.basketsAmount = basketsAmount;
    }

    @Override
    public void plugIn() {
        System.out.println("Dish washer's been plugged on");
        isTurnOn = true;
    }

    @Override
    public void plugOut() {
        System.out.println("Dish washer's been plugged off");
        isTurnOn = false;
    }

    public void dishWashing(){
        if (!isTurnOn){
            System.out.println("Dishwasher must be plugged in");
        } else {
            System.out.println("Washing has started");
        }
    }

    @Override
    public String toString() {
        return "DishWasher{" +
                "brand=" + brand +
                ", dimensions=" + dimensions +
                ", powerSupply=" + powerSupply +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", isTurnOn=" + isTurnOn +
                ", basketsAmount=" + basketsAmount +
                ", waterConsumption=" + waterConsumption +
                ", loadingType='" + loadingType + '\'' +
                '}';
    }
}
