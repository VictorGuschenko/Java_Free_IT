package maintasks;

/**
 * Создайте число. Определите, является ли число трехзначным. Определите, является
 * ли его последняя цифра семеркой. Определите, является ли число четным.
 */
public class Task6_IsThreeDigitsNumberLastDigitIsSevenIsEven {

    public static void main(String[] args) {

        int number = (int) (Math.random() * 2002 - 1001); // random int range [-1000, 1000]
        if ((number >= -999 && number <= -100) || (number >= 100 && number <= 999)) {
            System.out.println(number + " is  a three-digits number");
        } else {
            System.out.println(number + " is not a three-digits number");
        }
        if (number % 10 == 7 || number % 10 == -7) {
            System.out.println("The last digit of " + number + " is 7");
        } else {
            System.out.println("The last digit of " + number + " is not 7");
        }
        if (number % 2 != 0) {
            System.out.println(number + " is an odd number");
        } else {
            System.out.println(number + " is an even number");
        }
    }
}
