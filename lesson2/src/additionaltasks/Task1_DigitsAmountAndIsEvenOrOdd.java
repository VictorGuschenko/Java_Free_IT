package additionaltasks;

/**
 * )В переменную записываем число. Надо вывести на экран сколько в этом
 * числе цифр и положительное оно или отрицательное. Например,
 * "это однозначное положительное число". Достаточно будет определить,
 * является ли число однозначным, "двухзначным или трехзначным и более.
 */
public class Task1_DigitsAmountAndIsEvenOrOdd {

    public static void main(String[] args) {

        int number = (int) (-2000 + Math.random() * 4000);
        if (number > -10 && number < 10) {
            System.out.print(number + " is a one-digit ");
        } else if (number > -100 && number < -9 || number > 9 && number < 100) {
            System.out.print(number + " is  a two-digit ");
        } else {
            System.out.print(number + " is a three- and more digit ");
        }
        if (number < 0) {
            System.out.print("negative number.");
        } else if (number > 0) {
            System.out.print("positive number.");
        }else {
            System.out.print("zero number.");
        }

    }
}
