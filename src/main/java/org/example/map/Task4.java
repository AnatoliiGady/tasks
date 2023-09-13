package org.example.map;


import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {
        Task4Init task4Init = new Task4Init();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одно слово на русском или на англиском! ");
        String word = scanner.nextLine().toUpperCase();
        task4Init.getPriceWord(task4Init.map, word);
        task4Init.printPriceWord();


    }
}
