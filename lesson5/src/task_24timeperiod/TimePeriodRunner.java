package task_24timeperiod;

/**
 * Создать класс и объекты описывающие промежуток времени. Сам промежуток
 * в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте, сравнения
 * двух объектов (метод должен работать аналогично compareTo в строках). Создать
 * два конструктора: получающий общее количество секунд, и часы, минуты и секунды
 * по отдельности. Сделать метод для вывода данных.
 */
public class TimePeriodRunner {
    public static void main(String[] args) {
        TimePeriod period1 = new TimePeriod(3600131);
        TimePeriod period2 = new TimePeriod(11, 2, 1000);
        System.out.println(period1.compareTo(period2));
        System.out.println("Period 1 all seconds: " + period1.getAllSeconds());
        System.out.println("Period 2 all seconds: " + period2.getAllSeconds());
        System.out.println("Period 1: " + period1.toString());
        System.out.println("Period 2: " + period2.toString());



    }
}
