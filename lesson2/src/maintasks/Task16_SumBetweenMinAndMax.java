package maintasks;

/**
 * Определите сумму элементов одномерного массива, расположенных между
 * минимальным и максимальным значениями.
 */
public class Task16_SumBetweenMinAndMax {

    public static void main(String[] args) {

        int n = (int) (Math.random() * 20);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        int minElement = 0;
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minElement] > array[i]) {
                minElement = i;
            }
            if (array[maxElement] < array[i]) {
                maxElement = i;
            }
        }
        if (minElement > maxElement) {
            System.out.println(sumFromMinToMax(array, maxElement, minElement));
        } else if (maxElement > minElement) {
            System.out.println(sumFromMinToMax(array, minElement, maxElement));
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int sumFromMinToMax(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start + 1; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
