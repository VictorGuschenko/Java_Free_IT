package maintasks;

/**
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class Task12_FindSumOfFirstNNumbers {

    public static void main(String[] args) {

        int amountOfNumbers = (int) (Math.random() * 10);
        int sum = 0;
        int number = 0;
        for (int i = 0; i < amountOfNumbers; i++) {
            number += 3;
            sum += number;
        }
        System.out.println(sum);
    }
}
