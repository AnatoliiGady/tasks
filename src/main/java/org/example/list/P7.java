package org.example.list;

import java.util.LinkedList;

public class P7 {
    public static void addFirst(LinkedList<String> list, String s) {
        list.add(0, s);
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        addFirst(strings, "Ноль");
        System.out.println(strings);
    }
}
