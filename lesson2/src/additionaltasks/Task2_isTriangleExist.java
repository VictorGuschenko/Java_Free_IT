package additionaltasks;

/**
 * Треугольник существует только тогда, когда сумма любых двух его
 * сторон больше третьей. Определить существует ли такой треугольник.
 */
public class Task2_isTriangleExist {

    public static void main(String[] args) {

        double sideA = Math.random() * 20;
        double sideB = Math.random() * 20;
        double sideC = Math.random() * 20;
        boolean result;
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            result = false;
            System.out.println("The triangle with sides " + sideA + ","
                    + sideB + "," + sideC + " is exist: " + result);
        } else {
            result = true;
            System.out.println("The triangle with sides " + sideA + ","
                    + sideB + "," + sideC + " is exist: " + result);
        }

    }
}
