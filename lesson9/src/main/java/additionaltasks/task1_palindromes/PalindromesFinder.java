package additionaltasks.task1_palindromes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * В исходном файле находятся слова, каждое слово на новой строке. После
 * запуска программы должен создать файл, который будет содержать в себе
 * только палиндромы
 */
public class PalindromesFinder {
    public static void main(String[] args) {
        File myFile = new File("src/main/java/additionaltasks/task1_palindromes/Palindromes.txt");
        List<String> words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> reverseList = new ArrayList<>();
        for (String word : words) {
            if(word.equals(new StringBuilder(word).reverse().toString())){
                reverseList.add(word);
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/additionaltasks/task1_palindromes/result.txt"))) {
            for (String s : reverseList) {
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
