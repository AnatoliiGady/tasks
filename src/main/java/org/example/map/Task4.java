package org.example.map;

public class Task4 {


    public static void main(String[] args) {
        String string = "толя";
        System.out.println("Введите одно слово на русском или на англиском! ");
        String word = string.toUpperCase();
        System.out.println(Task4Init.getWordPrice(word));
    }
}
