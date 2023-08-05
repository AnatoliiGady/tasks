package org.example.arrays;

public class Task4 {
    // первый положительный элемент массива
    public static void main(String[] args) {
        int[] arrays = {-53, -2, 0, 5, -45};
        firstPositiveElement(arrays);
    }

    static void firstPositiveElement(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                count++;
                if (count == 1) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}

