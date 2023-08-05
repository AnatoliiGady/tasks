package org.example.loops;

public class Task14 { // не реализовано
    public static void main(String[] args) {
        int num1 = 1230;
        int num2 = 5419;
        int temp = num2;

        while (num1 > 0) {
            int num1Last = num1 % 10;
            num1 /= 10;
            while (num2 > 0) {
                int num2Last = num2 % 10;
                temp = num2;
                num2 = num2 / 10;
                if (num1Last == num2Last) {
                    System.out.println(num1Last);
                }
            }
            num2 = temp;
        }

    }
}