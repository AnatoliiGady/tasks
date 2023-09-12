package org.example.list;

import java.util.LinkedList;

public class P22 {
    public static boolean isElement(LinkedList<String> list, String s) {
        return list.contains(s);
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        System.out.println(isElement(list, "Пять"));
        System.out.println(isElement(list, "Два"));
    }
}
