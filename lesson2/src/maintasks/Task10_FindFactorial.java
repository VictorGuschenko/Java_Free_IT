package maintasks;

/**
 * Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */
public class Task10_FindFactorial {

    public static void main(String[] args) {

        int min = 10;
        int max = 15;
        int number = (int) (min + Math.random() * (max - min + 1));
        long result = 1;
        while (number != 1) {
            result *= number;
            number--;
        }
        System.out.println(result);
    }
}
