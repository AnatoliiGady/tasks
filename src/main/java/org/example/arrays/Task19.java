package org.example.arrays;

import java.util.Arrays;

public class Task19 {
    // Вставка элемента в массив
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8};
        array = pasteElementArray(array, 7);
        System.out.println(Arrays.toString(array));
    }

    static int[] pasteElementArray(int[] numbers, int num) {
        int[] array = Arrays.copyOf(numbers, numbers.length + 1);
        array[numbers.length] = num;
        return array;
    }
}
