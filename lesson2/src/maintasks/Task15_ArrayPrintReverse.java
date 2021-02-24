package maintasks;

/**
 * Создать массив, заполнить его случайными элементами, распечатать,
 * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
 * еще один массив)
 */
public class Task15_ArrayPrintReverse {

    public static void main(String[] args) {

        int size = (int) (Math.random() * 10);
        int array[] = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        arrayPrint(array);
        arrayReverse(array);
        System.out.println();
        arrayPrint(array);
    }

    public static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void arrayReverse(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
