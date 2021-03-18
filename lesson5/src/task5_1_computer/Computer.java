package task5_1_computer;

public class Computer {
    Processor processor;
    Ram ram;
    Hdd hdd;
    int fullCycleResource;
    boolean isTurn;
    boolean isDamage;

    public Computer(Processor processor, Ram ram, Hdd hdd, int fullCycleResource) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.fullCycleResource = fullCycleResource;
    }

    public void turnOn(int number) {
        if (isDamage) {
            System.out.println("Not working");
            return;
        }
        if (!isTurn) {
            if (number == (int)(Math.random() + 0.5) && fullCycleResource != 0) {
                System.out.println("Computer has been turned on");
                isTurn = true;
            } else {
                System.out.println("Computer has been broken");
                isDamage = true;
            }
        } else {
            System.out.println("It's already turned on");
        }
    }

    public void turnOff() {
        if (isTurn) {
            System.out.println("Computer has been turned off");
            isTurn = false;
            fullCycleResource--;
        } else {
            System.out.println("Computer is turned off");
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", fullCycleResource=" + fullCycleResource +
                '}';
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public int getFullCycleResource() {
        return fullCycleResource;
    }

    public void setFullCycleResource(int fullCycleResource) {
        this.fullCycleResource = fullCycleResource;
    }
}
