package org.example.condition;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите текущее время: ");
        int num = console.nextInt();

        if (0 <= num && num < 7) {
            System.out.println("Ночь");
        }
        if (7 <= num && num <= 11) {
            System.out.println("Утро");
        }
        if (12 <= num && num < 17) {
            System.out.println("День");
        }
        if (17 <= num && num < 23) {
            System.out.println("Вечер");
        }
        if (num < 0 || num > 23) {
            System.out.println("Ошибка");
        }
    }

}
