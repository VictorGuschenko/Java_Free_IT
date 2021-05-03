package task30;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Задание 30
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
 * числа.
 */
public class RandomnessCollection {

    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        initialList(listNumbers, 15);
        System.out.println(listNumbers);
        List<Integer> resultList = listNumbers.stream().distinct().collect(Collectors.toList());
        System.out.println(resultList);

        List<Integer> resultSecond = new ArrayList<>(removeDuplicates(listNumbers));
        System.out.println(resultSecond);
    }

    private static Set<Integer> removeDuplicates(List<Integer> listNumbers) {
        return new LinkedHashSet<>(listNumbers);
    }

    public static void initialList(List<Integer> listNumbers, int number) {
        for (int i = 0; i < number; i++) {
            listNumbers.add(new Random().nextInt(6));
        }
    }
}
