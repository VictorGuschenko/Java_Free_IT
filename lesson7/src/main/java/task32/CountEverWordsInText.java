package task32;

import java.util.*;

/**
 * Имеется текст. Следует составить для него частотный словарь.
 */
public class CountEverWordsInText {
    public static void main(String[] args) {

        String text = "In his first prime, day, day time address as president, Mr Biden said he " +
                "would order states Biden to make all adults eligible for vaccinations by May." +
                "Current measures   prioritise people by age or day health condition." +
                "Mr Biden was speaking exactly Biden, a year to Biden the day after the " +
                "outbreak was classified a global pandemic pandemic pandemic.";

        Map<String, Integer> result = frequencyWordPrint(text);
        System.out.println(result);
    }

    public static Map<String, Integer> frequencyWordPrint(String text) {
        List<String> wordList = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(text.trim(), ", .!?");
        while (tokenizer.hasMoreElements()) {
            wordList.add(tokenizer.nextToken());
        }
        Map<String, Integer> frequencyDictionary = new TreeMap<>();
        for (String word : wordList) {
            frequencyDictionary.merge(word, 1, Integer::sum);
        }
        return frequencyDictionary;
    }

}
