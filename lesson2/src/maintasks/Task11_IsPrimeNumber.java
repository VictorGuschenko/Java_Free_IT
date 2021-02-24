package maintasks;

/**
 * Имеется целое число, определить является ли это число простым, т.е.
 * делится без остатка только на 1 и себя.
 */
public class Task11_IsPrimeNumber {

    public static void main(String[] args) {

        int number = (int) (Math.random() * 1000);
        int counter = 2;
        boolean isPrime = true;
        while (number > counter) {
            if (number % counter == 0) {
                isPrime = false;
                break;
            }
            counter++;
        }
        System.out.println("Number is prime: " + isPrime);
    }
}
