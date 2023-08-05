package org.example.arrays;

public class Task12 {
    // найти количество положительных элементов массива
    public static void main(String[] args) {
        int[] array = {1, -2, 4, 3, 0};
        System.out.println(numCountPositive(array));
    }

    static int numCountPositive(int[] numbers) {
        int count = 0;
        for (Integer i : numbers) {
            if (i >= 0) {
                count++;
            }
        }
        return count;
    }
}
