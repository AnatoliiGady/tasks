package org.example.list;

import java.util.Iterator;
import java.util.LinkedList;

public class P3 {
    public static void stringIterator(LinkedList<String> list, int index) {
        Iterator<String> iterator = list.listIterator(index);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        stringIterator(strings, 1);

    }
}
