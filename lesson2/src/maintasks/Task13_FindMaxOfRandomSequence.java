package maintasks;

/**
 * Создать последовательность случайных чисел, найти и вывести наибольшее
 * из них.
 */
public class Task13_FindMaxOfRandomSequence {

    public static void main(String[] args) {

        int size = (int) (Math.random() * 20 + 1);
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
