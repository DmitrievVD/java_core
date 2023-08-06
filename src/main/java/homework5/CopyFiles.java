package homework5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyFiles {
    public static void backupFiles(String path){
        File course = new File(path);
        File backup = new File("./backup");

        if (!backup.exists()) backup.mkdir();
        if (!course.isDirectory()) {
            System.err.println("Указанный фаил не являеться дирректорией!!!");
            return;
        }

        File[] files = course.listFiles();
        if (files == null || files.length == 0){
            System.err.println("В указанной директории нет файлов!!!");
            return;
        }

        for (File el : files) {
            if (el.isFile()) {
                try {
                    Files.copy(el.toPath(), backup.toPath().resolve(el.getName()), StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    System.err.println("Ошибка при копировании файла: " + el.getName());
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Копирование файлов завершено!");
    }

}
