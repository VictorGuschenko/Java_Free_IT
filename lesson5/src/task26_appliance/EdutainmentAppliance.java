package task26_appliance;

public abstract class EdutainmentAppliance extends Appliance implements Plugging{

    double displayDiagonal;

    public EdutainmentAppliance(Brand brand, Dimensions dimensions,
                                PowerSupply powerSupply, String name,
                                double weight, double displayDiagonal) {
        super(brand, dimensions, powerSupply, name, weight);
        this.displayDiagonal = displayDiagonal;
    }

}
