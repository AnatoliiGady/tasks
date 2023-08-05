package org.example.arrays;

import java.util.Arrays;

public class Task7 {
    // найти два максимальных элемента
    public static void main(String[] args) {
        int[] array = {2, 6, 4, 1, 2};
        numTwoElementMax(array);
    }

    static void numTwoElementMax(int[] numbers) {
        Arrays.sort(numbers);
        for (int i = numbers.length -2; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
