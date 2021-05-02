package additionaltasks;

/**
 * Напишите программу печати таблицы перевода расстояний из
 * дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
public class Task12_DistanceConverter {

    public static void main(String[] args) {

        double inches = 1;
        double cm;
        final double CONVERSION = 2.54;
        System.out.println("inches \t\tcentimetres");
        for (int i = 0; i < 20; i++) {
            cm = inches * CONVERSION;
            if (inches < 10) {
                System.out.println(inches + "\t\t\t" + cm);
            } else {
                System.out.println(inches + "\t\t" + cm);
            }
            inches++;
        }
    }
}
