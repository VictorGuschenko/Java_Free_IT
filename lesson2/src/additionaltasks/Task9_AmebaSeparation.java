package additionaltasks;

/**
 * Одноклеточная амеба каждые 3 часа делится на 2 клетки.
 * Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */
public class Task9_AmebaSeparation {

    public static void main(String[] args) {

        int amoebaAmount = 1;
        for (int hours = 3; hours <= 24; hours += 3) {
            amoebaAmount *= 2;
            System.out.println(amoebaAmount + " amoebas after " + hours + " hours");
        }
    }
}
