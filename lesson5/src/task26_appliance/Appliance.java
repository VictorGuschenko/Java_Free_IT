package task26_appliance;

public abstract class Appliance implements Plugging {
    Brand brand;
    Dimensions dimensions;
    PowerSupply powerSupply;
    String name;
    double weight;
    boolean isTurnOn;

    public Appliance(Brand brand, Dimensions dimensions,
                     PowerSupply powerSupply, String name, double weight) {
        this.brand = brand;
        this.dimensions = dimensions;
        this.powerSupply = powerSupply;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "brand=" + brand +
                ", dimensions=" + dimensions +
                ", powerSupply=" + powerSupply +
                ", name='" + name + '\'' +
                ", weight=" + weight + "kg";
    }
}



