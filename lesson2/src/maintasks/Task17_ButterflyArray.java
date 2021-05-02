package maintasks;

public class Task17_ButterflyArray {
    public static void main(String[] args) {

        int n = (int) (3 + Math.random() * 17);
        int array[][] = new int[n][n];
        for (int i = 0; i <= array.length / 2; i++) {
            for (int j = i; j < array[i].length - i; j++) {
                array[i][j] = 1;
            }
        }
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            for (int j = i; j >= array[i].length - i - 1; j--) {
                array[i][j] = 1;
            }
        }
        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
