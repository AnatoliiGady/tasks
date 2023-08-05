package org.example.arrays;

public class Task1 {
    // сумма и произведение элементов одномерного массива
    public static void main(String[] args) {
        int[] num = {2, 4, 1, 6};
        System.out.println(calculateSumOfElements(num));
        System.out.println(multiplication(num));
    }

    static int calculateSumOfElements(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    static int multiplication(int[] numbers) {
        int mult = 1;
        for (Integer i : numbers) {
            mult *= i;
        }
        return mult;
    }
}
