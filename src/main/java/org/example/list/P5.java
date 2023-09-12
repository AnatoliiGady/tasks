package org.example.list;

import java.util.LinkedList;

public class P5 {
    public static void addIndex(LinkedList<String> list, int index, String element) {
        list.add(index, element);
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Шесть");
        addIndex(strings, 3, "Четыре");
        addIndex(strings, 4, "Пять");
        System.out.println(strings);
    }
}
