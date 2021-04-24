/**
 * Напишите три цикла выполняющих многократное сложение строк, один с
 * помощью оператора сложения и String, другой с помощью StringBuilder и метода
 * append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
 */
public class Task21_StringStringBufferStringBuilderTest {
    public static void main(String[] args) {
        String line = "test";
        StringBuffer bufferLine = new StringBuffer("test");
        StringBuilder builderLine = new StringBuilder("test");
        long startTime;
        long timeSpent;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            line += "new test";
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("String time, ms: " + timeSpent);

        startTime = System.currentTimeMillis();

         for (int i = 0; i < 100000; i++) {
            bufferLine.append("new test");
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("StringBuffer time, ms: " + timeSpent);

        startTime = System.currentTimeMillis();
         for (int i = 0; i < 100000; i++) {
            builderLine.append("new test");
        }
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("StringBuilder time, ms: " + timeSpent);
    }
}
