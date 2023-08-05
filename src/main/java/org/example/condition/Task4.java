package org.example.condition;

public class Task4 {
    public static void main(String[] args) {
        int number = 0;

        if (-9999 <= number && number < -999 || 999 < number  && number <= 9999) {
            System.out.println("Удача");
        } else {
            System.out.println("Неудача");
        }
    }
}
