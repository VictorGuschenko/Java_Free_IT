package task5_4_spacestarter;


public class Spaceport {
    public void launchRocket(IStart start) {
        if (start.preparingStart()) {
            System.out.println("Preparing has been completed.");
            start.startEngine();
            countdown();
            start.start();
        } else {
            System.out.println("Preparing has been failed!");
        }
    }

    private static void countdown() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
