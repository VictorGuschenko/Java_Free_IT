package additionaltasks;

/**
 * Даны 2 числа. Вывести большее из них.
 */
public class Task6_FindMaxOfTwo {

    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 100 -50);
        int number2 = (int) (Math.random() * 100 -50);
        System.out.println("number1: " + number1 + " number2: " + number2);
        if(number1 > number2) {
            System.out.println("Max is " + number1);
        } else if (number1 < number2){
            System.out.println("Max is " + number2);
        } else {
            System.out.println("number1 = number2");
        }
    }
}
