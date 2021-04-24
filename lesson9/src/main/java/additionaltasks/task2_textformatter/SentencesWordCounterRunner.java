package additionaltasks.task2_textformatter;

import java.io.*;

/**
 * Текстовый файл содержит текст. После запуска программы в другой файл
 * должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
 * предложении присутствует слово-палиндром, то не имеет значения какое кол-во
 * слов в предложении, оно попадает в новый файл.
 * <p>
 * Пишем все в ООП стиле. Создаём класс TextFormatter
 * в котором два статических метода:
 * 1. Метод принимает строку и возвращает кол-во слов в строке.
 * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
 * есть возвращает true, если нет false
 * <p>
 * В main считываем файл.
 * Разбиваем текст на предложения. Используя методы класса TextFormatter
 * определяем подходит ли нам предложение. Если подходит добавляем его в
 * новый файл
 */
public class SentencesWordCounterRunner {
    public static void main(String[] args) {
        File myFile = new File("Text.txt");

        StringBuilder text = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] sentences = text.toString().trim().split("(?<=[.!])");
        for (String sentence : sentences) {
            if (TextFormatter.hasPalindromeInSentence(sentence)) {
                System.out.println(sentence.trim().replaceAll("\n"," "));
            } else if (TextFormatter.wordCount(sentence) >= 3 && TextFormatter.wordCount(sentence) <= 5) {
                System.out.println(sentence.trim().replaceAll("\n"," "));
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/additionaltasks/task2_textformatter/ResultFile.txt"))) {
            for (String sentence : sentences) {
                if (TextFormatter.hasPalindromeInSentence(sentence)) {
                    bufferedWriter.write(sentence.trim().replaceAll("\n"," "));
                    bufferedWriter.newLine();
                } else if (TextFormatter.wordCount(sentence) >= 3 && TextFormatter.wordCount(sentence) <= 5) {
                    bufferedWriter.write(sentence.trim().replaceAll("\n"," "));
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
