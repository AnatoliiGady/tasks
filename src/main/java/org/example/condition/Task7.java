package org.example.condition;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String message = "";
        if (num > 0) {
            message += "положительное ";
        } else {
            message += "отрицательное ";
        }
        if (num % 2 == 0) {
            message += "четное ";
        } else {
            message += "нечетное ";
        }
        message += "число";

        System.out.println(message);


        /*if (num > 0) {
            String x = (num % 2 == 0 ? "Положительное четное число" : "Положительное нечетное число");
            System.out.println(x);
        }

        if (num < 0) {
            String x = (num % 2 == 0 ? "Отрицательное четное число" : "Отрицательное нечетное число");
            System.out.println(x);
        }
        if (num == 0) {
            System.out.println("Нулевое число");
        }*/
    }
}
