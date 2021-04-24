import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
 * записаных по правилам Java, с помощью регулярных выражений и вывести их на
 * страницу.
 */
public class Task22_FindHexNumbers {
    public static void main(String[] args) {
        String text = "INT_MAX: 0x7FFFFFFF, INT_MIN: 0x80000000, incorrect: 0xP012CCB, " +
                "incorrect: 0xkfbccababab333334bbbca, correct: 0xfb2cba1" +
                "LLONG_MAX: 0x7FFFFFFFFFFFFFFF, LLONG_MIN 0x8000000000000000";
        String textLower = text.toLowerCase();
        Pattern regexp = Pattern.compile("0x[0-8a-f]{2,16}");
        Matcher m = regexp.matcher(textLower);
        List<String> hexWords = new ArrayList<>();
        while (m.find()) {
            hexWords.add(m.group());
        }
        for (String hexWord : hexWords) {
            System.out.println(hexWord);
        }
    }
}
