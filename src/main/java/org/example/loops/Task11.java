package org.example.loops;

public class Task11 {
    public static void main(String[] args) {
        int num = 9589;
        int temp = 0;
        while (num > 0) {
            int ostatok = num % 10;
            num = num / 10;
            if (temp < ostatok) {
                temp = ostatok;
            }
        }
        System.out.println("Наибольшая цифра в числе: " + temp);
    }
}
