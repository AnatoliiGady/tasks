package org.example.arrays;

public class Task10 {
    // найти разность между максимальным и минимальным элементами массива
    public static void main(String[] args) {
        int[] array = {-22, -2, 6, -10};
        System.out.println(numMax(array) - numMin(array));
    }

    static int numMax(int[] numbers) {
        int max = numbers[0];
        for (Integer i : numbers) {
            if (i > max) {
                max = i;
            }

        }
        if (max < 0) {
            max *= -1;
        }

        return max;
    }

    static int numMin(int[] numbers) {
        int min = 0;
        for (Integer i : numbers) {
            if (i < min) {
                min = i;
            }
        }
        if (min < 0) {
            min *= -1;
        }
        return min;
    }
}
