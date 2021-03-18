package task_24timeperiod;

public class TimePeriod {
    final static int SECONDS_IN_HOUR = 3600;
    final static int SECONDS_IN_MINUTE = 60;
    private int seconds;
    private int minutes;
    private int hours;

    public TimePeriod(int seconds) {
        hours = seconds / SECONDS_IN_HOUR;
        minutes = seconds % SECONDS_IN_HOUR / SECONDS_IN_MINUTE;
        this.seconds = seconds % 60;

    }

    public TimePeriod(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getAllSeconds() {
        return hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE + seconds;
    }

    public int compareTo(TimePeriod period) {
        return this.getAllSeconds() - period.getAllSeconds();
    }

    @Override
    public String toString() {
        return "TimePeriod{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }
}
