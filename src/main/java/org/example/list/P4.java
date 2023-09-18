package org.example.list;

import java.util.Collections;
import java.util.LinkedList;

public class P4 {
    public static void revers(LinkedList<String> list) {
        Collections.reverse(list);
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        revers(strings);
        System.out.println(strings);
    }
}
