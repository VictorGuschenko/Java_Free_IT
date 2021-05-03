package task5_4_spacestarter;

import java.util.Random;

public class SpaceX implements IStart {

    @Override
    public boolean preparingStart() {
        return new Random().nextInt() > 1;
    }

    @Override
    public void startEngine() {
        System.out.println("SpaceX starts its engines. All systems are OK!");
    }

    @Override
    public void start() {
        System.out.println("SpaceX STARTS");
    }
}
