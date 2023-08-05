package org.example.arrays;

import java.util.Arrays;

public class Task20 {
    // Удаление элементов одномерного массива
    public static void main(String[] args) {
        int[] array = {2, 4, -1, 2};
        System.out.println(Arrays.toString(deleteElementArray(array, 1)));

    }
// изменить на массив другой
    static int[] deleteElementArray(int[] numbers, int index) {
        int[] array = new int[numbers.length - 1];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i != index) {
                array[j] = numbers[i];
                j++;
            }
        }
        return array;
    }
}

