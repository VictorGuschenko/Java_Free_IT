package task5_2_transport;

public class CivilAirTransport extends AirTransport{
    private final int maxPassengers;
    private final boolean hasBusinessClass;

    public CivilAirTransport(int horsePower, int maxSpeed, Brand brand,
                             int weight, double wingspan, int minLengthRunway,
                             int passengers, boolean hasBusinessClass) {
        super(horsePower, maxSpeed, brand, weight, wingspan, minLengthRunway);
        this.maxPassengers = passengers;
        this.hasBusinessClass = hasBusinessClass;
    }
    public void isPlaneOverloaded(int passengers){
        System.out.println(passengers > this.maxPassengers ? "Вам нужен самолет побольше" : "Самолет загружен");
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public boolean isHasBusinessClass() {
        return hasBusinessClass;
    }

    @Override
    public String toString() {
        return "CivilAirTransport{" +
                " HORSE_POWER=" + getHorsePower() +
                ", MAX_SPEED=" + getMaxSpeed() +
                ", brand=" + getBrand() +
                ", WEIGHT=" + getWeight() +
                ", kWattPower=" + powerConvert() +
                ", WINGSPAN=" + getWingspan() +
                ", MIN_LENGTH_RUNWAY=" + getMinLengthRunway() +
                ", MAX_PASSENGERS=" + maxPassengers +
                ", HAS_BUSINESS_CLASS=" + hasBusinessClass +
                '}';
    }
}
