package org.example.list;

import java.util.LinkedList;

public class P11 {
    public static void printElementIndex(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Элемент " + list.get(i) + " под индексом " + i);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        printElementIndex(strings);
    }
}
