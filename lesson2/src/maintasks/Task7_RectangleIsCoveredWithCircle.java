package maintasks;

/**
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 * полностью закрыть круглой картонкой радиусом r.
 */
public class Task7_RectangleIsCoveredWithCircle {

    public static void main(String[] args) {

        double sideA = Math.random() * 10;
        double sideB = Math.random() * 10;
        double rad = Math.random() * 10;
        boolean result;
        double radMin = Math.sqrt(Math.pow(sideA/2, 2) + Math.pow(sideB/2, 2));
        System.out.println(radMin);
        result = (rad >= radMin);
        System.out.println("side a: " + sideA);
        System.out.println("side b: " + sideB);
        System.out.println("Circle with radius " + rad + " covers the rectangle: " + result);
    }
}
