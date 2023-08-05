package org.example.loops;

public class Task18 {
    public static void main(String[] args) {
        int range = 60;

        for (int i = 1; i < range; i++) {
            int sum = 0;
            for (int index = 1; index < i; index++) {
                if (i % index == 0) {
                    sum = sum + index;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }




    }
}

        /*if (sum(range)) {
            System.out.println(range);
        }

    }

    static boolean sum(int range) {
        int sum = 0;
        for (int i = 1; i < range; i++) {
            if (range % i == 0) {
                sum = sum + i;
            }
        }
        return sum == range;
    }
}*/

