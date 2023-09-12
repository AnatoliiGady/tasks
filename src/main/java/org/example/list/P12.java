package org.example.list;

import java.util.LinkedList;

public class P12 {
    public static void removeElement(LinkedList<String> list, String s) {
        if (list != null) {
            list.remove(s);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        removeElement(strings, "Два");
        System.out.println(strings);
    }
}
