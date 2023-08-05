package org.example.loops;

public class Task16 {
    public static void main(String[] args) {
        int range = 50;

        for (int i = 2; i < range; i++) {
            boolean isTrue = true;
            for (int index = 2; index < i; index++) {
                if (i % index == 0) {
                    isTrue = false;
                }
            }
            if (isTrue = true) {
                System.out.print(i + " ");
            }
        }
    }
}
