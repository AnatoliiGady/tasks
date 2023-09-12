package org.example.list;

import java.util.LinkedList;

public class P8 {
    public static void addLast(LinkedList<String> list, String s) {
        list.add(s);
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        addLast(strings, "Пять");
        System.out.println(strings);
    }
}
