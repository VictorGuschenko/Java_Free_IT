package additionaltasks;

/**
 * Дано целое число. Если оно является положительным, то прибавить к нему 1.
 * Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10.
 * Вывести полученное число
 */
public class Task3_ChangingNumber {

    public static void main(String[] args) {

        int number = (int) (Math.random() * 200 - 100);
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        System.out.println(number);
    }
}
