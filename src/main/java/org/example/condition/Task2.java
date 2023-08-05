package org.example.condition;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = console.nextLine();

        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.print("Введите в имени только буквы!");
                System.exit(-1);
            }
        }

        System.out.print("Введите ваш возраст: ");
        int age = console.nextInt();

        if (age < 0) {
            System.out.println("Введите корректный возраст!");
            System.exit(-1);
        }

        if (age > 18) {
            System.out.print("Добрый вечер, " + name + "!" + " Вы совершеннолетный, поздравляем!");
        } else {
            System.out.print("Привет, " + name + "!" + " Приносим свои извенения вы не можете гулять после 22:00");
        }
        console.close();
    }
}








