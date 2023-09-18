package org.example.list;

import java.util.LinkedList;

public class P14 {
    public static void removeAll(LinkedList<String> list) {
        if (list != null) {
            list.clear();
        }
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        removeAll(strings);
        System.out.println(strings);
    }
}
