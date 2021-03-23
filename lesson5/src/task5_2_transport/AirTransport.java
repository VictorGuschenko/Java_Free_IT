package task5_2_transport;

public abstract class AirTransport extends Transport{
    private final double WINGSPAN;
    private final int MIN_LENGTH_RUNWAY;

    public AirTransport(int HORSE_POWER, int MAX_SPEED,
                        Brand brand, int WEIGHT,
                        double WINGSPAN, int MIN_LENGTH_RUNWAY) {
        super(HORSE_POWER, MAX_SPEED, brand, WEIGHT);
        this.WINGSPAN = WINGSPAN;
        this.MIN_LENGTH_RUNWAY = MIN_LENGTH_RUNWAY;
    }

    public double getWINGSPAN() {
        return WINGSPAN;
    }

    public int getMIN_LENGTH_RUNWAY() {
        return MIN_LENGTH_RUNWAY;
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "WINGSPAN=" + WINGSPAN +
                ", MIN_LENGTH_RUNWAY=" + MIN_LENGTH_RUNWAY +
                '}';
    }
}
