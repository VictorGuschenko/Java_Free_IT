package task5_1_computer;

public class Processor {
    int coreAmount;
    int frequency;

    public Processor(int coreAmount, int frequency) {
        this.coreAmount = coreAmount;
        this.frequency = frequency;
    }

    public Processor() {
    }

    public int getCoreAmount() {
        return coreAmount;
    }

    public void setCoreAmount(int coreAmount) {
        this.coreAmount = coreAmount;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "coreAmount=" + coreAmount +
                ", frequency=" + frequency +
                '}';
    }
}
