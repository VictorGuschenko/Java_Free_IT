package additionaltasks;

/**
 * Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Task11_MultiplicationThroughTheSum {

    public static void main(String[] args) {

        int a = 1;
        int b = 9;
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        System.out.println(result);
    }
}
