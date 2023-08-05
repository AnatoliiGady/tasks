package org.example.arrays;

import java.util.Arrays;

public class Task11 {
    // поменять местами минимальный и максимальный элемент массива
    public static void main(String[] args) {
        int[] array = {2, 4, 6};
        swap(array);
        System.out.println(Arrays.toString(array));

    }
    static void swap(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        numbers[maxIndex] = min;
        numbers[minIndex] = max;
    }
}
