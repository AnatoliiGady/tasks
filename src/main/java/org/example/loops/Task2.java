package org.example.loops;

public class Task2 {
    public static void numAB(int a, int b) {
        for (int i = a; i < b; i++) {
            System.out.println(i * i * i);
        }
    }
    public static void main(String[] args) {
        numAB(3, 9);
    }
}
