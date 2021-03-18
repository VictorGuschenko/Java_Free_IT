package task26_appliance;

public abstract class WashingAppliance extends Appliance {
    double waterConsumption;
    String loadingType;

    public WashingAppliance(Brand brand, Dimensions dimensions,
                            PowerSupply powerSupply, String name,
                            double weight, double waterConsumption,
                            String loadingType) {
        super(brand, dimensions, powerSupply, name, weight);
        this.waterConsumption = waterConsumption;
        this.loadingType = loadingType;
    }


}
