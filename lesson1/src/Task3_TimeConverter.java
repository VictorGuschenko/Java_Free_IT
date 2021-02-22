/**
 * Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
 * А) минут + секунд,
 * В) часов + минут + секунд,
 * С) дней + часов + минут + секунд,
 * D) недель + дней + часов + минут + секунд.
 * по аналогии с примером выше.
 */
public class Task3_TimeConverter {
    public static void main(String[] args) {
        int seconds = 4500;
        int resultSeconds;
        int minutes;
        int resultMinutes;
        int hours;
        int resultHours;
        int days;
        int resultDays;
        int weeks;
        resultSeconds = seconds % 60;
        minutes = seconds / 60;
        resultMinutes = seconds / 60 % 60;
        hours = seconds / 60 / 60;
        resultHours = hours % 24;
        days = seconds / 60 / 60 / 24;
        resultDays = days % 7;
        weeks = seconds / 60 / 60 /24 / 7;
        System.out.println("A) " + minutes + " minutes " + resultSeconds + " seconds");
        System.out.println("B) " + hours + " hours " + resultMinutes +
                " minutes " + resultSeconds + " seconds");
        System.out.println("C) " + days +" days "+ resultHours + " hours " + resultMinutes +
                " minutes " + resultSeconds + " seconds");
        System.out.println("D) " + weeks + " weeks " + resultDays + " days " + resultHours + " hours "
                + resultMinutes + " minutes " + resultSeconds + " seconds");
    }
}
