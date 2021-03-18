package task26_appliance;



public class ApplianceRunner {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine(Brand.BOSH,
                new Dimensions(1.2,0.8, 0.56),
                new PowerSupply("AC", "A+",
                        180.0, 260.0, 230.0,
                        6.5, 850.0),
                "B213l",25.5, 40.5, "Horizontal", 1000);
         WashingMachine washingMachine2 = new WashingMachine(Brand.SAMSUNG,
                new Dimensions(1.2,0.6, 0.4),
                new PowerSupply("AC", "A+++",
                        180.0, 260.0, 230.0,
                        4.5, 650.0),
                "sml541",18.9, 22.5, "Vertical", 800);

        System.out.println(washingMachine);
        System.out.println(washingMachine2);
        washingMachine.plugIn();
        washingMachine.spinning(washingMachine.rpm);
        washingMachine.plugOut();
        washingMachine.spinning(washingMachine.rpm);

        DishWasher dishWasher1 = new DishWasher(Brand.LG,
                new Dimensions(0.9,0.5,0.4),
                new PowerSupply("AC","A+",
                        100.0,250.0,110.0,
                        4.5,500.0),
                "GF3KL", 17.8, 30.0,
                "vertical", 2);
        dishWasher1.plugIn();
        dishWasher1.dishWashing();
        dishWasher1.plugOut();
        dishWasher1.dishWashing();
        DeskTop pc = new DeskTop(Brand.APPLE, new Dimensions(0.2, 0.4, 0.01),
                new PowerSupply("AC", "A++", 110,
                        250, 220, 1.2,
                        0.035),
                "iMac", 0.6, 19.5,
                new Ram(16384, 3200),
                new Hdd("SSD", 1000));
        pc.plugIn();
        pc.plugOut();

    }
}
