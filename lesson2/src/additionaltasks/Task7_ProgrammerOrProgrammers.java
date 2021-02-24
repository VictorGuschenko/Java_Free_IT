package additionaltasks;

/**
 * В переменную записываете количество программистов.
 * В зависимости от количества программистов необходимо вывести правильно окончание.
 * Например: • 2 программиста • 1 программист • 10 программистов • и т.д.
 */
public class Task7_ProgrammerOrProgrammers {

    public static void main(String[] args) {

        int programmersAmount = (int) (Math.random() * 120);
        if (programmersAmount % 100 == 11 || programmersAmount % 100 == 12
                || programmersAmount % 100 == 13 || programmersAmount % 100 == 14) {
            System.out.println(programmersAmount + " программистов");
        } else {
            switch (programmersAmount % 10) {
                case 1:
                    System.out.println(programmersAmount + " программист");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(programmersAmount + " программиста");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    System.out.println(programmersAmount + " программистов");
            }
        }
    }
}
