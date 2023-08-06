package ru.gb.dmitriev;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String note = OtherClass.input();
        String date = OtherClass.date();
        System.out.println(Decorator.decorator(note, date));

        try (FileWriter fileWriter = new FileWriter("test.txt", true)){
            fileWriter.write(Decorator.decorator(note, date));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
