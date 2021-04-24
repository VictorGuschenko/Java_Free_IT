package task_34_findnumbersandsum;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
 * распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
 * распечатать.
 */
public class FindNumbersAndGetSum {
    public static void main(String[] args) {

        File myFile = new File("src/main/java/task_34_findnumbersandsum/Example.txt");
        StringBuilder text = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
            int symbolInt;
            while ((symbolInt = bufferedReader.read()) != -1) {
                text.append((char) symbolInt);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("All numbers in the file: ");
        System.out.println(getDigitsList(text));
        System.out.format("The sum is: %.3f%n", sumNumbers(getDigitsList(text)));
        System.out.println("Unique numbers: ");
        System.out.println(getUniqueNumbers(getDigitsList(text)));
    }

    public static List<Double> getDigitsList(StringBuilder text) {
        List<Double> list = new ArrayList<>();

        Pattern pattern = Pattern.compile("(-?[0-9]+(?:[.][0-9]+)?)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            list.add(Double.valueOf(matcher.group()));
        }
        return list;
    }

    public static double sumNumbers(List<Double> numbersList){
        double sum = 0;
        for (Double aDouble : numbersList) {
            sum += aDouble;
        }
        return sum;
    }

    public static List<Double> getUniqueNumbers(List<Double> numberList){
        Set<Double> uniqueNumbers = new LinkedHashSet<>(numberList);
        return new ArrayList<>(uniqueNumbers);
    }

}
