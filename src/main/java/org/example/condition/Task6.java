package org.example.condition;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц своего рождения: ");
        int num = scanner.nextInt();
        switch (num) {
            case (12):
            case (1):
            case (2):
                System.out.print("Зима");
                break;
            case (3):
            case (4):
            case (5):
                System.out.print("Весна");
                break;
            case (6):
            case (7):
            case (8):
                System.out.print("Лето");
                break;
            case (9):
            case (10):
            case (11):
                System.out.print("Осень");
                break;
            default:
                System.out.print("Ошибка");
        }
    }
}
