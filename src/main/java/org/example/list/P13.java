package org.example.list;

import java.util.LinkedList;

public class P13 {
    public static void removeFirstAndLast(LinkedList<String> list) {
        if (list != null && list.size() > 2) {
            list.remove(0);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        removeFirstAndLast(strings);
        System.out.println(strings);
    }
}
