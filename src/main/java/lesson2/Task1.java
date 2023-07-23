package lesson2;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int[] arr1 = newArreyAddLast(arr, 8);
        int[] arr2 = newArreyAddLast(arr1, 0, 2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    }

    public static int[] newArreyAddLast(int[] arr, int value){
        int[] newArrey = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArrey[i] = arr[i];
        }
        newArrey[arr.length] = value;

        return newArrey;
    }

    public static int[] newArreyAddLast(int[] arr, int value, int position) {


        if (!(position >= 0 && position <= arr.length)) {
            System.out.println("Индекс за пределами массива!!!");
            return null;
        } else if (position == arr.length) {
            return newArreyAddLast(arr, value);
        } else {
            int[] newArrey = new int[arr.length + 1];
            int temp = 0;

            for (int i = 0; i < arr.length + 1; i++) {
                if (i == position) {
                    newArrey[i] = value;
                    temp++;
                } else newArrey[i] = arr[i - temp];
            }
            return newArrey;
        }
    }

}
