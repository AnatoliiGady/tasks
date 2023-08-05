package org.example.arrays;

public class Task18 {
    // Есть ли в массиве одинаковые элементы
    public static void main(String[] args) {
        int[] array = {};
        System.out.println(haveEqualElements(array));
    }

    static boolean haveEqualElements(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
