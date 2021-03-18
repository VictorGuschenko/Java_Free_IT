package task5_1_computer;

import java.util.Scanner;

public class ComputerRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer pc1 = new Computer(new Processor(4, 3300),
                new Ram(8196, 3200),
                new Hdd(500, "HDD"), 3);
        System.out.println(pc1);
        System.out.println("put 1 or 0");
        pc1.turnOn(scanner.nextInt());
        pc1.turnOn(scanner.nextInt());
        pc1.turnOff();
        pc1.turnOff();

    }
}
