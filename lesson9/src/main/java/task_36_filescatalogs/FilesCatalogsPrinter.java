package task_36_filescatalogs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
 * должны быть распечатаны отдельно.
 */
public class FilesCatalogsPrinter {
    public static void main(String[] args) {
        File myFile = new File("src/main");
        File[] filesAndDirectories = myFile.listFiles();
        List<String> files = new ArrayList<>();
        List<String> directories = new ArrayList<>();
        if (filesAndDirectories == null) {
            System.out.println("There are no files and directories.");
        } else {
            for (File name : filesAndDirectories) {
                if (name.isFile()) {
                    files.add(name.getName());
                } else {
                    directories.add(name.getName());
                }
            }
            System.out.println("files:");
            for (String file : files) {
                System.out.println(file);
            }
            System.out.println();
            System.out.println("directories:");
            for (String directory : directories) {
                System.out.println(directory);
            }
        }
    }
}
