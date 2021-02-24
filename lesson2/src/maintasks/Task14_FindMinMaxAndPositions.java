package maintasks;

/**
 * Создать массив оценок произвольной длины, вывести максимальную и
 * минимальную оценку, её (их) номера.
 */
public class Task14_FindMinMaxAndPositions {

    public static void main(String[] args) {

        int size = (int) (Math.random() * 20);
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        int minPosition = 0;
        int maxPosition = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxPosition] < array[i]) {
                maxPosition = i;
            }
            if (array[minPosition] > array[i]) {
                minPosition = i;
            }
        }
        System.out.println("Min rank = " + array[minPosition] + " is on " + minPosition + " position");
        System.out.println("Max rank = " + array[maxPosition] + " is on " + maxPosition + " position");

    }
}
