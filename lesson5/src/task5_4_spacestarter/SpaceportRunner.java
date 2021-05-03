package task5_4_spacestarter;

public class SpaceportRunner {

    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launchRocket(new Shuttle());
        spaceport.launchRocket(new SpaceX());
    }
}
