package org.example.loops;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        int num = 3562;
        int sum = 0;
        while (num > 0) {
            int ostatok = num % 10;
            num = num / 10;
            if (ostatok % 2 == 0) {
                sum = sum + ostatok;
            }
        }
        System.out.println(sum);
    }
}
