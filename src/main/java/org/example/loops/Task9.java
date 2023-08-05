package org.example.loops;

public class Task9 {
    public static void main(String[] args) {
        int num = 123456;
        int even = 0;
        int odd = 0;
        int count = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num / 10;
            count++;
        }
        System.out.println("Количество цифр в числе: " + count + " из них " + even + " четных, и " + odd + " нечетных");
    }
}
