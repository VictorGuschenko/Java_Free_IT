package task5_2_transport;

public abstract class AirTransport extends Transport{
    private final double wingspan;
    private final int minLengthRunway;

    public AirTransport(int horsePower, int maxSpeed,
                        Brand brand, int weight,
                        double wingspan, int minLengthRunway) {
        super(horsePower, maxSpeed, brand, weight);
        this.wingspan = wingspan;
        this.minLengthRunway = minLengthRunway;
    }

    public double getWingspan() {
        return wingspan;
    }

    public int getMinLengthRunway() {
        return minLengthRunway;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " wingspan=" + wingspan +
                ", min_length_runway=" + minLengthRunway +
                ',';
    }
}
