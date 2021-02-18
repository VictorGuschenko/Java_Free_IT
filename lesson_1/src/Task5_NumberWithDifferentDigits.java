

public class Task5_NumberWithDifferentDigits {
    public static void main(String[] args) {
        int number = 1334;
        boolean result = true;
        int firstDigit = number / 1000 % 10;
        int secondDigit = number / 100 % 10;
        int thirdDigit = number /10 % 10;
        int fourthDigit = number % 10;
        if (firstDigit == secondDigit || firstDigit == thirdDigit ||
                firstDigit == fourthDigit || secondDigit == thirdDigit ||
                secondDigit == fourthDigit || thirdDigit == fourthDigit) {
            result = false;
        }
        System.out.println("All digits are different: " + result);
    }
}
