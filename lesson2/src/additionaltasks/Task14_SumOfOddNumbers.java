package additionaltasks;

/**
 * Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */
public class Task14_SumOfOddNumbers {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 99; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
