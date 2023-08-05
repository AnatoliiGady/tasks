package org.example.loops;

public class Task19 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int index = 0; index < 10; index++) {
                tab[i][index] = (i + 1) * (index + 1);
                System.out.printf("%4d", tab[i][index]);
            }
            System.out.println();
        }
    }
}
