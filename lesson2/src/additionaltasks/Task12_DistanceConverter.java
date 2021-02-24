package additionaltasks;

public class Task12_DistanceConverter {

    public static void main(String[] args) {

        double inches = 1;
        double cm;
        System.out.println("inches \t\tcentimetres");
        for (int i = 0; i < 20; i++) {
            cm = inches * 2.54;
            if (inches < 10) {
                System.out.println(inches + "\t\t\t" + cm);
            } else {
                System.out.println(inches + "\t\t" + cm);
            }
            inches++;
        }
    }
}
