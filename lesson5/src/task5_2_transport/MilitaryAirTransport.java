package task5_2_transport;

public class MilitaryAirTransport extends AirTransport {
    private int rocketAmount;
    private final boolean HAS_CATAPULT_SYSTEM;

    public MilitaryAirTransport(int HORSE_POWER, int MAX_SPEED,
                                Brand brand, int WEIGHT, double WINGSPAN,
                                int MIN_LENGTH_RUNWAY, int rocketAmount,
                                boolean HAS_CATAPULT_SYSTEM) {
        super(HORSE_POWER, MAX_SPEED, brand, WEIGHT, WINGSPAN, MIN_LENGTH_RUNWAY);
        this.rocketAmount = rocketAmount;
        this.HAS_CATAPULT_SYSTEM = HAS_CATAPULT_SYSTEM;
    }

    public void launchRocket() {
        System.out.println(rocketAmount-- > 0 ? "Ракета пошла…" : "Боеприпасы отсутствуют");
    }

    public void catapulting() {
        System.out.println(HAS_CATAPULT_SYSTEM ? "Катапультирование прошло успешно" : "У вас нет такой системы");
    }

    public int getRocketAmount() {
        return rocketAmount;
    }

    public boolean isHAS_CATAPULT_SYSTEM() {
        return HAS_CATAPULT_SYSTEM;
    }

    @Override
    public String toString() {
        return "MilitaryAirTransport{" +
                "HORSE_POWER=" + getHORSE_POWER() +
                ", MAX_SPEED=" + getMAX_SPEED() +
                ", brand=" + getBrand() +
                ", WEIGHT=" + getWEIGHT() +
                ", kWattPower=" + powerConvert() +
                ", WINGSPAN=" + getWINGSPAN() +
                ", MIN_LENGTH_RUNWAY=" + getMIN_LENGTH_RUNWAY() +
                ", rocketAmount=" + rocketAmount +
                ", HAS_CATAPULT_SYSTEM=" + HAS_CATAPULT_SYSTEM +
                '}';
    }
}
