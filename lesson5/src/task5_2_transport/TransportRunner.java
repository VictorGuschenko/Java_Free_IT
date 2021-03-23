package task5_2_transport;

public class TransportRunner {

    public static void main(String[] args) {
        Car myCar = new Car(102,255,Brand.MERCEDES,
                2450,4,14.6,BodyStyle.SEDAN,5);
        myCar.printCarStatement(4.5);
        System.out.println(myCar);
        MilitaryAirTransport f22 = new MilitaryAirTransport(5000, 4500, Brand.LOCKHEED_MARTIN,
                19000,17,50,4,true);
        f22.catapulting();
        f22.launchRocket();
        f22.launchRocket();
        f22.launchRocket();
        f22.launchRocket();
        f22.launchRocket();
        f22.launchRocket();
        f22.launchRocket();
        f22.launchRocket();
        System.out.println(f22);

        Truck truck1 = new Truck(1000, 200, Brand.VOLVO,
                10000,16, 29,15000.0);
        truck1.isTrackOverloaded(15001.5);
        truck1.isTrackOverloaded(14999.9);
        System.out.println(truck1);
        CivilAirTransport plane = new CivilAirTransport(5000, 1800, Brand.AIRBUS,
                60000, 67.0,2360, 698,true);
        System.out.println(plane);

    }
}
