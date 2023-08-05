package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number = -9999;

        if (-9999 <= number && number < -999 || 999 < number  && number <= 9999) {
            System.out.println("Удача");
        } else {
            System.out.println("Неудача");
        }
    }
}
