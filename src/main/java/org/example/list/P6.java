package org.example.list;

import java.util.LinkedList;

public class P6 {
    public static void addFirstAndLast(LinkedList<String> list, String s) {
        list.add(s);
        list.add(0, s);
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        addFirstAndLast(strings, "Пять");
        System.out.println(strings);
    }
}
