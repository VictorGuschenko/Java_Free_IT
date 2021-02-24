package additionaltasks;

/**
 * Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
 */
public class Task5_FindPositiveNegativeNumbers {

    public static void main(String[] args) {

        int counterPositive = 0;
        int counterNegative = 0;
        for (int i = 0; i < 3; i++){
            int number = (int) (Math.random() * 100 - 50);
            System.out.print(number + " ");
            if (number > 0) {
                counterPositive++;
            }
            if (number < 0){
                counterNegative++;
            }
        }
        System.out.println();
        System.out.println("Positive numbers: " + counterPositive);
        System.out.println("Negative numbers: " + counterNegative);
    }
}
