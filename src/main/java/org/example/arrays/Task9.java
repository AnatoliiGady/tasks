package org.example.arrays;

public class Task9 {
    // разделить элементы массива на максимальный
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        numMaxDivElement(array);
    }

    static void numMaxDivElement(int[] numbers) {
        double max = 0;
        for (Integer i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        for (Integer i : numbers) {
            if (i != max) {
                System.out.println(i / max);
            }
        }
    }
}
