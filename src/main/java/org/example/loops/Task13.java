package org.example.loops;

public class Task13 {
    public static void main(String[] args) {
        int num = 654321;

        while (num > 0) {
            int revers = num % 10;
            num = num / 10;
            System.out.print(revers);
        }
    }
}
