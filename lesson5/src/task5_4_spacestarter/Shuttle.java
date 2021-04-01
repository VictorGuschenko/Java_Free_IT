package task5_4_spacestarter;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean preparingStart() {
        return new Random().nextInt(11) > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Shuttle starts its engines. All systems are OK!");
    }

    @Override
    public void start() {
        System.out.println("Shuttle STARTS");
    }
}
