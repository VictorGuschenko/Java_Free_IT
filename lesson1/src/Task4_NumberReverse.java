/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 * любого 4-х значного натурального числа n.
 */
public class Task4_NumberReverse {
    public static void main(String[] args) {
        int number = -9998;
        int reverseNumber;
        if((number >= -9999 && number <= -1000) || (number >= 1000 && number <= 9999)) {
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
        } else {
            System.out.println("Wrong input");
        }

    }
}
