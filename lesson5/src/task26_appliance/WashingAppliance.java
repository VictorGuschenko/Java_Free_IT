package task26_appliance;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WashingAppliance that = (WashingAppliance) o;
        return Double.compare(that.waterConsumption, waterConsumption) == 0 && Objects.equals(loadingType, that.loadingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waterConsumption, loadingType);
    }

    @Override
    public String toString() {
        return  "waterconsumption" + waterConsumption +
                " loadingType" + loadingType + super.toString();
    }
}
