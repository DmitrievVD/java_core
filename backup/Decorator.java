package ru.gb.dmitriev;

import java.util.Date;

public class Decorator {
    public static String decorator(String str, String date){
        return String.format("Ваша заметка: %s \nВермя: %s\n", str, date);
    }
}
