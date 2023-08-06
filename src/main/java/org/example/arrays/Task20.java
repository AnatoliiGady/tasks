package org.example.arrays;

import java.util.Arrays;

public class Task20 {
    // Удаление элементов одномерного массива
    public static void main(String[] args) {
        int[] array = {2, 4, -1, 2};
        System.out.println(Arrays.toString(deleteElementArray(array, 1)));
    }

    static int[] deleteElementArray(int[] numbers, int index) {
        int[] array = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            if (i > index) {
                array[i - 1] = numbers[i];
            }
            if (i < index) {
                array[i] = numbers[i];
            }
        }

        return array;
    }
}

