package task26_appliance;

public class DeskTop extends EdutainmentAppliance implements Plugging{
    Ram ram;
    Hdd hdd;
    boolean isTurnOn;

    public DeskTop(Brand brand, Dimensions dimensions,
                   PowerSupply powerSupply, String name,
                   double weight, double displayDiagonal,
                   Ram ram, Hdd hdd) {
        super(brand, dimensions, powerSupply, name, weight, displayDiagonal);
        this.ram = ram;
        this.hdd = hdd;
    }

    public void openBrowser(){
        if(!isTurnOn){
            System.out.println("Desktop must be plugged in!");
        } else {
            System.out.println("Browser has been opened.");
        }
    }

    @Override
    public void plugIn() {
        System.out.println("Desktop has been plugged in");
    }

    @Override
    public void plugOut() {
        System.out.println("Desktop has been plugged out");
    }
}
