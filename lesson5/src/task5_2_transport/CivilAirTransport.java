package task5_2_transport;

public class CivilAirTransport extends AirTransport{
    private final int MAX_PASSENGERS;
    private final boolean HAS_BUSINESS_CLASS;

    public CivilAirTransport(int HORSE_POWER, int MAX_SPEED, Brand brand,
                             int WEIGHT, double WINGSPAN, int MIN_LENGTH_RUNWAY,
                             int PASSENGERS, boolean HAS_BUSINESS_CLASS) {
        super(HORSE_POWER, MAX_SPEED, brand, WEIGHT, WINGSPAN, MIN_LENGTH_RUNWAY);
        this.MAX_PASSENGERS = PASSENGERS;
        this.HAS_BUSINESS_CLASS = HAS_BUSINESS_CLASS;
    }
    public void isPlaneOverloaded(int passengers){
        System.out.println(passengers > this.MAX_PASSENGERS ? "Вам нужен самолет побольше" : "Самолет загружен");
    }

    public int getMAX_PASSENGERS() {
        return MAX_PASSENGERS;
    }

    public boolean isHAS_BUSINESS_CLASS() {
        return HAS_BUSINESS_CLASS;
    }

    @Override
    public String toString() {
        return "CivilAirTransport{" +
                " HORSE_POWER=" + getHORSE_POWER() +
                ", MAX_SPEED=" + getMAX_SPEED() +
                ", brand=" + getBRAND() +
                ", WEIGHT=" + getWEIGHT() +
                ", kWattPower=" + powerConvert() +
                ", WINGSPAN=" + getWINGSPAN() +
                ", MIN_LENGTH_RUNWAY=" + getMIN_LENGTH_RUNWAY() +
                ", MAX_PASSENGERS=" + MAX_PASSENGERS +
                ", HAS_BUSINESS_CLASS=" + HAS_BUSINESS_CLASS +
                '}';
    }
}
