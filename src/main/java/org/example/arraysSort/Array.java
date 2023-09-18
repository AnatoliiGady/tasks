package org.example.arraysSort;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // сортировка пузырьком
        int[] array = new int[]{8, 9, 5, 7, 1, 2, 4, 3, 6, 10};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] < array[j]) {
                    int digit = array[i];
                    array[i] = array[j];
                    array[j] = digit;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        // сортировка вставками
        int[] array1 = new int[]{18, 15, 12, 13, 17, 14, 11, 19, 20};
        for (int left = 0; left < array1.length; left++) {
            int value = array1[left];
            int i = 0;
            for (i = left - 1; i >= 0; i--) {
                if (value < array1[i]) {
                    array1[i + 1] = array1[i];
                } else {
                    break;
                }
            }
            array1[i + 1] = value;
        }
        System.out.println(Arrays.toString(array1));
    }


}
