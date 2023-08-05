package org.example.loops;

public class Task17 {
    public static void main(String[] args) {
        int num = 6;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Введите значение больше 0 !!");
        }
    }
}
