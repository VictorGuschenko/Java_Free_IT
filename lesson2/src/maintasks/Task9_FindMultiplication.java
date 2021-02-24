package maintasks;

import java.util.Random;

/**
 * Надо получить ряд случайных чисел, и посчитать их
 * произведение. Ввод чисел прекращается, если очередным числом
 * будет ноль.
 */
public class Task9_FindMultiplication {

    public static void main(String[] args) {

        double result = 1;
        int x = (int) (Math.random() * 10);
        while (x != 0) {
            result *= x;
            x = (int) (Math.random() * 10);
        }
        System.out.println(result);
    }
}
