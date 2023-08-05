package org.example.arrays;

public class Task5 {
    // поиск максимльного элемента в массиве
    public static void main(String[] args) {
        int[] array = {-1, -5, -6, -2, -2};
        maxElementArray(array);
    }

    static void maxElementArray(int[] numbers) {
        int max = numbers[0];
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
