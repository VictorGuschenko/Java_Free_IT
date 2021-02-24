package additionaltasks;

/**
 * Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */
public class Task4_FindPositiveNumbers {

    public static void main(String[] args) {

        int counter = 0;
        for (int i = 0; i < 3; i++){
            int number = (int) (Math.random() * 100 - 50);
            System.out.print(number + " ");
            if (number > 0) {
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter);
    }
}
