package org.example.loops;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int array[] = new int[10];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= array.length - 1; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        System.out.println(Arrays.toString(array));
    }
}
