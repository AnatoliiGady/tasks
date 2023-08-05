package org.example.loops;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int num = 654;

        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            num /= 10;
        }
    }
}
