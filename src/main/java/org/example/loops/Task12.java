package org.example.loops;

public class Task12 {
    public static void main(String[] args) {
        int num = 12;
        int numLast = num % 10;
        while (num >= 10) {
            num = num / 10;
        }
        System.out.println(numLast + num);
    }
}
