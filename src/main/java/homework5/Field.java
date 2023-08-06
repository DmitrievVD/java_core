package homework5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Field {


    public static void saveField(int[] arr){
        try (FileWriter fileWriter = new FileWriter("field.txt")){
            for (int el : arr) {
                fileWriter.write("" + el);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printField(){
        ArrayList<Integer> arr = new ArrayList<>();
        try (FileReader fileReader = new FileReader("field.txt")){
            int n;
            while ((n = fileReader.read()) != -1){
                char temp = (char) n;
                arr.add(Integer.parseInt(String.valueOf(temp)));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < arr.size(); i++) {
            if (i % 3 == 0 && i != 0) System.out.print("\n");
            switch (arr.get(i)){
                case 1 -> System.out.print("X");
                case 2 -> System.out.print("0");
                case 0 -> System.out.print("_");
            }
            System.out.print(" ");
        }
    }

}
