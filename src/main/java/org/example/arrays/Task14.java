package org.example.arrays;

public class Task14 {
    // Вывести элементы массива, которые больше среднего арифметического
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 1};
        System.out.println(getAverageElementArray(array));
        printAverage(array);
    }

    static double getAverageElementArray(int[] numbers) {
        double average = 0;
        for (Integer i : numbers) {
            average += i;
        }
        average /= numbers.length;
        return average;
    }

    static void printAverage(int[] numbers) {
        double average = getAverageElementArray(numbers);
        System.out.println("Среднее арифметическое массива: " + average);
        System.out.print("Элементы больше среднего арифметического массива: ");

        for (Integer i : numbers) {
            if (i > average) {
                System.out.print(i + " ");
            }
        }
    }
}
