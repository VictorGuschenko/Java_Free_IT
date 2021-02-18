

/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 * любого 4-х значного натурального числа n.
 */
public class Task4_NumberReverse {
    public static void main(String[] args) {
        int number = 5252;
        int reverseNumber;

        reverseNumber = number % 10;
        number /= 10;
        reverseNumber *= 10;
        reverseNumber += number % 10;
        number /= 10;
        reverseNumber *= 10;
        reverseNumber += number % 10;
        number /= 10;
        reverseNumber *= 10;
        reverseNumber += number % 10;

        System.out.println(reverseNumber);
    }
}
