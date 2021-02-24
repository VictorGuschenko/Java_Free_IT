package additionaltasks;

/**
 * Треугольник существует только тогда, когда сумма любых двух его
 * сторон больше третьей. Определить существует ли такой треугольник.
 */
public class Task2_isTriangleExist {

    public static void main(String[] args) {

        double sideA = 8.99999;
        double sideB = 4;
        double sideC = 5;
        boolean result;
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA){
            result = false;
            System.out.println("The triangle with sides " + sideA +","
                    + sideB + "," + sideC +" is exist: " + result);
        } else {
            result = true;
            System.out.println("The triangle with sides " + sideA +","
                    + sideB + "," + sideC +" is exist: " + result);
        }

    }
}
