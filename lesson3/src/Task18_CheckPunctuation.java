import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
 * общее их количество.
 */
public class Task18_CheckPunctuation {
    public static void main(String[] args) {
        String line = "While he [Mr. Smith] was writing his book, " +
                "Magic: the little known world! he stated, \"I always wanted " +
                "to ask a magician, 'How do you do it?'\"; he luckily got the " +
                "chance while he was living above a math based magic shop (where he " +
                "lived from 1993 - 1997) called: \"YUP\".";
        char symbol;
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            symbol = line.charAt(i);
            if (symbol == '.' || symbol == ',' || symbol == '\"' || symbol == ':'
                    || symbol == '!' || symbol == '[' || symbol == ']' || symbol == '\''
                    || symbol == ';' || symbol == '-' || symbol == '(' || symbol == ')'
                    || symbol == '{' || symbol == '}' || symbol == '?') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

