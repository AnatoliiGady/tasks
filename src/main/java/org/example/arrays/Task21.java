package org.example.arrays;

import java.util.Arrays;

public class Task21 {
    // Удалить повторяющиеся элементы из массива (задать в массиве не более двух одинаковых чисел, например, 51123445
    public static void main(String[] args) {
        int[] array = {5, 1, 1, 2, 3, 4, 4, 5};
        System.out.println(Arrays.toString(deleteEqualElement(array)));
    }

    static int[] deleteEqualElement(int[] numbers) {
        int count = 0;
        int indexNewArray = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                count++;
            }
        }
        int[] array = new int[numbers.length - count];

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i != numbers.length - 1) {
                if (numbers[i] != numbers[i + 1]) {
                    array[indexNewArray] = numbers[i];
                    indexNewArray += 1;

                }
            }
            if (i == numbers.length - 1) {
                array[indexNewArray] = numbers[i];
                indexNewArray += 1;
            }
        }
        return array;
    }
}
