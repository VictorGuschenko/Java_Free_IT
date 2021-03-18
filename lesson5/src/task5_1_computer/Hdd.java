package task5_1_computer;

public class Hdd {
    int capacity;
    String type;

    public Hdd(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public Hdd() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}
