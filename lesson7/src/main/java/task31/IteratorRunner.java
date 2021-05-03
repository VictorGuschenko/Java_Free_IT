package task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * оценками. Найти самую высокую оценку с использованием итератора.
 */
public class IteratorRunner {

    public static void main(String[] args) {
        List<Integer> gradesList = new ArrayList<>();
        initialList(gradesList, 10);
        System.out.println(gradesList);
        int result = findMaxGrade(gradesList);
        System.out.println(result);

    }

    /**
     * @return the random value form 0 to 10
     */
    public static int getValue() {
        return new Random().nextInt(11);
    }

    /**
     * @param listNumbers the list for initialization
     * @param number      the number of random values
     */
    public static void initialList(List<Integer> listNumbers, int number) {
        for (int i = 0; i < number; i++) {
            listNumbers.add(getValue());
        }
    }
    public static int findMaxGrade(List<Integer> gradesList){
        Iterator<Integer> iterator = gradesList.listIterator();
        int max = Integer.MIN_VALUE;
        while (iterator.hasNext()) {
            int nextValue = iterator.next();
            if (nextValue > max) {
                max = nextValue;
            }
        }
        return max;
    }
}
