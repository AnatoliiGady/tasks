package org.example.loops;

public class Task15 {
    public static void main(String[] args) {
        int num = 65418;
        int deleteNum = 4;
        int index = 1;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit != deleteNum) {
                sum += digit * index;
                num /= 10;
                index *= 10;
            } else {
                num /= 10;
            }
        }
        System.out.println(sum);
    }
}


