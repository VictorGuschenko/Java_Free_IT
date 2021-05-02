package task5_2_transport;

public class MilitaryAirTransport extends AirTransport {
    private final boolean hasCatapultSystem;
    private int rocketAmount;

    public MilitaryAirTransport(int horsePower, int maxSpeed,
                                Brand brand, int weight, double wingspan,
                                int minLengthRunway, int rocketAmount,
                                boolean hasCatapultSystem) {
        super(horsePower, maxSpeed, brand, weight, wingspan, minLengthRunway);
        this.rocketAmount = rocketAmount;
        this.hasCatapultSystem = hasCatapultSystem;
    }

    public void launchRocket() {
        System.out.println(rocketAmount-- > 0 ? "Ракета пошла…" : "Боеприпасы отсутствуют");
    }

    public void catapulting() {
        System.out.println(hasCatapultSystem ? "Катапультирование прошло успешно" : "У вас нет такой системы");
    }

    public int getRocketAmount() {
        return rocketAmount;
    }

    public boolean isHasCatapultSystem() {
        return hasCatapultSystem;
    }

    @Override
    public String toString() {
        return "MilitaryAirTransport{" +
                "HORSE_POWER=" + getHorsePower() +
                ", MAX_SPEED=" + getMaxSpeed() +
                ", brand=" + getBrand() +
                ", WEIGHT=" + getWeight() +
                ", kWattPower=" + powerConvert() +
                ", WINGSPAN=" + getWingspan() +
                ", MIN_LENGTH_RUNWAY=" + getMinLengthRunway() +
                ", rocketAmount=" + rocketAmount +
                ", HAS_CATAPULT_SYSTEM=" + hasCatapultSystem +
                '}';
    }
}