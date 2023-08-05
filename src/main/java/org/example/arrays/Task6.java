package org.example.arrays;

public class Task6 {
    //поиск максимального по модулю элемента в массиве
    public static void main(String[] args) {
        int[] array = {-3, 3, 1, -4, -10, 6};
        maxElementArray(array);
    }

    static void maxElementArray(int[] numbers) {
        int max = 0;
        for (Integer i : numbers) {
            if (i < 0) {
                i *= -1;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
