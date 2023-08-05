package org.example.loops;

public class Task10 {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        int mult = 1;

        while (num > 0) {
            int ostatok = num % 10;
            num = num / 10;
            sum = sum + ostatok;
            mult = mult * ostatok;
        }
        System.out.println("Сумма цифр: " + sum);
        System.out.println("Произведение цифр: " + mult);
    }
}
