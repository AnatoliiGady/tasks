package org.example.condition;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число от 1 до 999: ");
        int num = scanner.nextInt();
        if (1 <= num && num <= 999) {
            if (1 <= num && num < 10) {
                System.out.print("Цифра");
            }
            if (10 <= num && num <= 99) {
                System.out.print("Двузначное");
            }
            if (num >= 100) {
                System.out.print("Трехзначное");
            }
        } else {
            System.out.print("Ошибка");
        }
    }
}
