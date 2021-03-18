package task26_appliance;

public class Ram {
    int size;
    int frequency;

    public Ram(int size, int frequency) {
        this.size = size;
        this.frequency = frequency;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
                "size=" + size +
                ", frequency=" + frequency +
                '}';
    }
}
