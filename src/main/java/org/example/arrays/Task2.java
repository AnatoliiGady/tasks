package org.example.arrays;

public class Task2 {
    // сумма положительных элементов массива
    public static void main(String[] args) {
        int[] arrays = {2, 0, -1, -3, 3};
        positiveElement(arrays);
    }

    static void positiveElement(int[] numbers) {
        int sum = 0;
        for (Integer i : numbers) {
            if (i > 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
