package org.example.arrays;

public class Task8 {
    // заменить числа на противоположные
    public static void main(String[] args) {
        int[] array = {2, 5, 2, 1, 4, -6, -5, -9};
        numRevers(array);
    }

    static void numRevers(int[] numbers) {
        for (Integer i : numbers) {
            System.out.print(i * -1 + " ");
        }
    }
}
