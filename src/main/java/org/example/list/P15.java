package org.example.list;

import java.util.LinkedList;

public class P15 {
    public static void replaceTwoElement(LinkedList<String> list, String s1, String s2) {
        if (list != null && list.size() > 2) {
            int index1 = list.indexOf(s1);
            int index2 = list.indexOf(s2);
            list.set(index1, s2);
            list.set(index2, s1);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        replaceTwoElement(strings, "Один", "Три");
        System.out.println(strings);
    }
}
