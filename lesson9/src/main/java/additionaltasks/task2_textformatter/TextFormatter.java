package additionaltasks.task2_textformatter;

public class TextFormatter {
    private static final int MINIMUM_LETTERS = 2;

    public static int wordCount(String line) {
        String[] wordCount = line
                .trim()
                .replaceAll("\\W[0-9+]", " ")
                .split(" +");

        return wordCount.length;
    }

    public static boolean hasPalindromeInSentence(String line) {
        boolean hasPalindrome = false;
        String[] words = line.trim().toLowerCase().split(" ");
        for (String word : words) {
            if (word.equals(new StringBuilder(word).reverse().toString()) && word.length() > MINIMUM_LETTERS) {
                hasPalindrome = true;
            }
        }
        return hasPalindrome;
    }
}
