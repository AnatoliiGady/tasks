package org.example.loops;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, вам предстоит угадать число.");
        int range = 10;
        int random = (int) (Math.random() * range);


        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int num = scanner.nextInt();
            if (num == random) {
                System.out.println("Поздравлем, вы угадали число");
                break;
            }
            if (num > random) {
                System.out.println("Загаданное число меньше");
            } if (num < random) {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
