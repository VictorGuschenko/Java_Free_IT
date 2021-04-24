package task_35_binaryfiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
 * распечатать числа и их среднее арифметическое.
 */
public class BinaryFileWriterReader {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("src/main/java/task_35_binaryfiles/binaryFileNumbers.dat")))) {
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int) (Math.random() * 20));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> listNumbers = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("src/main/java/task_35_binaryfiles/binaryFileNumbers.dat")))) {

            while (true) {
                listNumbers.add(dis.readInt());
            }
        } catch (IOException ignored) {
        }

        double sum = 0;
        for (Integer listNumber : listNumbers) {
            sum += listNumber;
        }
        double averageValue = sum / listNumbers.size();
        System.out.println(listNumbers);
        System.out.println("average: " + averageValue);
    }
}
