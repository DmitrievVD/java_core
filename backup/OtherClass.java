package ru.gb.dmitriev;

import java.util.Date;
import java.util.Scanner;

public class OtherClass {
    private static Scanner in = new Scanner(System.in);
    public static String input(){
        System.out.print("Введите заметку: ");
        return in.nextLine();
    }
    public static String date(){
        Date date = new Date();
        return date.toString();
    }
}
