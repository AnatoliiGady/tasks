package org.example.arrays;

public class Task16 {
    // Определить индексы элементов массива, значение которых лежит в указанном пределе
    public static void main(String[] args) {
        int[] array = {5, -6, 9, 12, 32, 4, 11};
        indexElementFrom10Before30(array, 10, 30);
    }

    static void indexElementFrom10Before30(int[] numbers, int from, int before) {
        System.out.print("Индексы элементов массива в пределе от " + from + " до " + before + ": ");
        for (int i = 0; i < numbers.length; i++) {
            if (from <= numbers[i] && numbers[i] <= before) {
                System.out.print(i + " ");
            }
        }
    }
}
