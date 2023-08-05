package org.example.arrays;

public class Task3 {
    // сумма элементов частей массива
    public static void main(String[] args) {
        int arrays[] = {2, 3, 5, 1, 4, 3, 2};
        arrayPart(arrays);
    }

    static void arrayPart(int[] numbers) {
        int numPatr = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            numPatr += numbers[i];
        }
        System.out.println(numPatr);
    }
}
