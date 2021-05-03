package task26_appliance;

public class Dimensions {
    private double length;
    private double width;
    private double depth;

    public Dimensions(double length, double width, double depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Dimensions{" +
                "length=" + length + "m" +
                ", width=" + width + "m" +
                ", depth=" + depth + "m" +
                '}';
    }
}
