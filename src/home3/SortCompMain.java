package home3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortCompMain {

    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }

        System.out.println("Исходный массив:" + Arrays.toString(array));
        Arrays.sort(array, new Comparator<Integer>()
        {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        });
        System.out.println("Отсортированный массив:" + Arrays.toString(array));
        Integer[] array2 = new Integer[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = rand.nextInt(10);
        }
        System.out.println("Исходный массив:" + Arrays.toString(array2));
        Arrays.sort(array2, (a,b)->a.compareTo(b));
        System.out.println("Отсортированный массив:" + Arrays.toString(array));




    }




    }


