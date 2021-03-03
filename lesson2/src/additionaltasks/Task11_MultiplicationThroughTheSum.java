package additionaltasks;

/**
 * Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Task11_MultiplicationThroughTheSum {

    public static void main(String[] args) {

        int a = (int) (Math.random() * 20);
        int b = (int) (Math.random() * 20);
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        System.out.println(a + " * " + b + " = " + result);
    }
}
