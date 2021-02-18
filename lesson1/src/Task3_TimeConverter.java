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
        int resultMinutes;
        int resultHours;
        int resultDays;
        int resultWeeks;
        resultMinutes = seconds / 60;
        resultSeconds = seconds % 60;
        System.out.println("A) " + resultMinutes + " minutes " + resultSeconds + " seconds");
        resultHours = seconds / 3600;
        resultMinutes = seconds % 3600 / 60;
        resultSeconds = seconds % 3600 % 60;
        System.out.println("B) " + resultHours + " hours " + resultMinutes + " minutes " + resultSeconds + " seconds");
        resultDays = seconds / 3600 / 24;
        resultHours = seconds % (3600 * 24) / 60 /60;
        resultMinutes = seconds % (3600 * 24) % (60 * 60) / 60;
        resultSeconds = seconds % (3600 * 24) % (60 * 60) % 60;
        System.out.println("C) " + resultDays +" days "+ resultHours + " hours " + resultMinutes + " minutes " + resultSeconds + " seconds");
        resultWeeks = seconds / 3600 / 24 / 7;
        resultDays = seconds % (3600 * 24 * 7) / 3600 / 24;
        resultHours = seconds % (3600 * 24 * 7) % (3600 * 24) / 60 / 60;
        resultMinutes = seconds % (3600 * 24 * 7) % (3600 * 24) % (60 * 60) / 60;
        resultSeconds = seconds % (3600 * 24 * 7) % (3600 * 24) % (60 * 60) % 60;
        System.out.println("D) " + resultWeeks + " weeks " + resultDays + " days " + resultHours + " hours "
                + resultMinutes + " minutes " + resultSeconds + " seconds");
    }
}
