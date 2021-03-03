package additionaltasks;

/**
 * Начав тренировки, спортсмен в первый день пробежал 10 км.
 * Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
 * Какой суммарный путь пробежит спортсмен за 7 дней?
 */
public class Task8_ResultRunningDistance {

    public static void main(String[] args) {

        double distancePerDay = 10;
        double sumDistance = 10;
        int days = 7;
        for (int i = 0; i < days - 1; i++) {
            distancePerDay *= 1.1;
            sumDistance += distancePerDay;
        }
        System.out.format("%.3f", sumDistance);
    }
}
