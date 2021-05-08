package additionaltasks.task3_censorcheker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Проверка на цензуру:
 * Создаете 2 файла.
 * 1 - й. Содержит исходный текст.
 * 2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
 * определите сами, хотите каждое слово на новой строке, хотите через запятую
 * разделяйте, ваша программа делайте как считаете нужным.
 * Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
 * встретилось ни одного недопустимого слова, то выводите сообщение о том что
 * текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
 * сообщение, кол-во предложений не прошедших проверку и сами предложения
 * подлежащие исправлению.
 */
public class CensorChecker {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/additionaltasks/task3_censorcheker/sourcetext.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] sentences = text.toString().split("(?<=[.?!])");
        List<String> badWordsList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/additionaltasks/task3_censorcheker/badlist.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                badWordsList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> badSentencesList = new ArrayList<>();
        for (String sentence : sentences) {
            for (String word : badWordsList) {
                if (sentence.toLowerCase().contains(word.toLowerCase())) {
                    badSentencesList.add(sentence);
                    break;
                }
            }
        }
        if (badSentencesList.size() == 0) {
            System.out.println("This text has been checked successfully");
        } else {
            System.out.println("Bad sentences: " + badSentencesList.size());
            for (String sentence : badSentencesList) {
                System.out.println(sentence);
            }
        }
    }
}
