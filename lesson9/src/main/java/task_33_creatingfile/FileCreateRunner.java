package task_33_creatingfile;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
 * препинания и слов.
 */
public class FileCreateRunner {
    public static void main(String[] args) {

        String str = "Welcome! This  5 website is (quite obviously) " +
                "a small text generator.  4 It's fairly self explanatory - " +
                "you put some text 3 in the first box, \n and it'll 2 convert " +
                "it into 0 three different small  1 text \"fonts\" for you. ";

        File myFile = new File("src/main/java/task_33_creatingfile/Example.txt");
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(myFile))) {
            fileWriter.write(str);
            fileWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder str1 = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
            int symbolInt;
            while ((symbolInt = bufferedReader.read()) != -1) {
                str1.append((char) symbolInt);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Amount of words: " + wordsCount(str1));
        System.out.println("Amount of punctuation marks: " + punctuationMarksCount(str1));

    }

    public static int wordsCount(StringBuilder line) {
        String[] wordCount = new String(line)
                .trim()
                .replaceAll("\\W[0-9+]", " ")
                .split(" +");

        return wordCount.length;

    }

    public static int punctuationMarksCount(StringBuilder line) {
        String punctuationCountLine = new String(line);
        Pattern pattern = Pattern.compile("[.,?!:;\"-]");
        Matcher matcher = pattern.matcher(punctuationCountLine);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
