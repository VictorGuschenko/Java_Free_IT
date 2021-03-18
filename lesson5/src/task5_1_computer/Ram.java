package task5_1_computer;

public class Ram {
    int capacity;
    int frequency;

    public Ram(int capacity, int frequency) {
        this.capacity = capacity;
        this.frequency = frequency;
    }

    public Ram() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "capacity=" + capacity +
                ", frequency=" + frequency +
                '}';
    }
}
