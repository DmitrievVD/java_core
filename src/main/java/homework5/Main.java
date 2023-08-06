package homework5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CopyFiles.backupFiles("src/main/java/ru/gb/dmitriev");
        int[] arrey = {0, 1, 2, 0, 2, 0, 1, 0, 0};
        Field.saveField(arrey);
        Field.printField();
    }

}
