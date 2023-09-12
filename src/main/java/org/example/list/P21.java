package org.example.list;

import java.util.LinkedList;

public class P21 {
    public static String getLastElement(LinkedList<String> list) {
        return list.peekLast();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        System.out.println(getLastElement(list));
        System.out.println(list);
    }
}
