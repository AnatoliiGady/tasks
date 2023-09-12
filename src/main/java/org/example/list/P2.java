package org.example.list;

import java.util.LinkedList;

public class P2 {
    public static void printElement(LinkedList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        printElement(strings);
    }
}
