package org.example.arrays;

public class Task13 {
    // Количества отрицательных и положительных элементов в массиве
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 4, -5, 6, -7};
        numCountPositiveAndNegative(array);
    }

    static void numCountPositiveAndNegative(int[] numbers) {
        int countPositive = 0;
        int countNegative = 0;
        for (Integer i : numbers) {
            if (i >= 0) {
                countPositive++;
            }
            if (i < 0) {
                countNegative++;
            }
        }
        System.out.println("Количество отрицательных элементов: " + countNegative);
        System.out.println("Количество положительных элементов: " + countPositive);

    }
}
