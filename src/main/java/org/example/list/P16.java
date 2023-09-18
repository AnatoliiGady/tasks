package org.example.list;

import java.util.LinkedList;

public class P16 {
    public static void randomSwap(LinkedList<String> list) {
        if (list == null) {
            return;
        }
        int randomIndex1 = (int) (Math.random() * (list.size() - 1));
        int randomIndex2 = (int) (Math.random() * (list.size() - 1));
        String s1 = list.get(randomIndex1);
        String s2 = list.get(randomIndex2);
        list.set(randomIndex1, s2);
        list.set(randomIndex2, s1);
    }

    public static void randomSwapAll(LinkedList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            randomSwap(list);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        randomSwapAll(strings);
        System.out.println(strings);
    }
}
