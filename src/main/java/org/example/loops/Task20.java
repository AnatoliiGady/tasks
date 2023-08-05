package org.example.loops;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
        int num = 254;
        int rsl = 1;

        while (num > 0) {
            int temp = num % 10;
            num /= 10;
            rsl = rsl * temp;
            System.out.println(rsl);
        }
    }
}
