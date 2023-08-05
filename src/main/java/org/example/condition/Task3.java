package org.example.condition;

public class Task3 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 6;
        int num3 = 7;
        if (num1 == num2) {
            System.out.println(num3);
        }
        if (num1 == num3) {
            System.out.println(num2);
        }
        if (num3 == num2) {
            System.out.println(num1);
        }
        if (num1 != num2 && num2 != num3 && num3 != num1) {
            System.out.println("Ошибка");
        }
    }
}
