package org.example.arrays;

public class Task15 {
    // Элементы массива, которые больше предыдущего
    public static void main(String[] args) {
        int[] array = {-2, -1, 1, -6, 7};
        printElementMorePreviousNext(array);
    }

    static void printElementMorePreviousNext(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
