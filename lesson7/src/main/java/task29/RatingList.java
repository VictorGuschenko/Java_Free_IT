package task29;

import java.util.*;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * оценками. Удалить неудовлетворительные оценки из списка.
 */
public class RatingList {
    static final int UNSATISFACTORY_GRADE = 3;

    public static void main(String[] args) {
        List<Integer> rating = new ArrayList<>();
        initialList(rating, 45);
        List<Integer> result = new ArrayList<>(rating);
        result.removeIf(integer -> integer <= UNSATISFACTORY_GRADE);
        System.out.println(rating);
        System.out.println(result);

    }

    public static void initialList(List<Integer> listNumbers, int number) {
        for (int i = 0; i < number; i++) {
            listNumbers.add(new Random().nextInt(11));
        }
    }
}
