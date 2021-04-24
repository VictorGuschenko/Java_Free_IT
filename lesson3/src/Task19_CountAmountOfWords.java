
/**
 * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
 * учесть, что слова могут разделяться несколькими пробелами, в начале и конце
 * текста также могут быть пробелы, но могут и отсутствовать.
 */
public class Task19_CountAmountOfWords {
    public static void main(String[] args) {
        String line = "    There is a text. Count amount of words in the text. " +
                "The text can contain several    spaces between the words. " +
                "Also spaces can    place at the beginning of the text and in the end. ";
        String trimmedLine = line.trim().replaceAll("\\W+", " "); // \W - not word character.
        String [] wordsArray = trimmedLine.split(" +");
        System.out.println(wordsArray.length);
    }
}
