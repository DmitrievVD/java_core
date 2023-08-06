package lesson2;

import java.util.Arrays;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 6, 7, -3, 3, 6, 8, 9, 8, 4, -3, 2, 3};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(countSortWithMap(arr)));
        System.out.println(Arrays.toString(countSort(arr)));
    }

    public static int[] countSort(int[] arr){ // Класический

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        int size = max - min + 1;
        int[] tmpArr = new int[size];
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tmpArr[arr[i] - min]++;
        }
        int index = 0;


        for (int i = 0; i < tmpArr.length; i++) {
            for (int j = 0; j < tmpArr[i]; j++) {
                newArr[index] = i + min;
                index++;
            }
        }


        return newArr;
    }

    public static int[] countSortWithMap(int[] arr){ // Через Map
        int[] newArr = new int[arr.length];

        TreeMap<Integer, Integer> map =new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int index = 0;

        for (Integer key : map.keySet()) {
            for (int i = 0; i < map.get(key); i++) {
                newArr[index++] = key;
            }
        }

        return newArr;
    }
}
