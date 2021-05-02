package maintasks;

import java.util.Random;

/**
 * Имеется целое число (задать с помощью Random rand = new Random(); int x =
 * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
 * нему слово «рублей» в правильном падеже.
 */
public class Task8_RubleOrRubles {

    public static void main(String[] args) {

        Random rand = new Random();
        int x = 10;
        switch (x % 100) {
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println(x + " рублей");
                return;
        }
        switch (x % 10) {
            case 1:
                System.out.println(x + " рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(x + " рубля");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                System.out.println(x + " рублей");
                break;
        }
    }
}
