package org.example.loops;

public class Task4 {
    static void numAnumB(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i != 0) {
                System.out.println((28.0 / i + 8) * i);
            } else {
                System.out.println("Ошибка");
            }
        }
    }

    public static void main(String[] args) {
        numAnumB(-50, 50);
    }
}
