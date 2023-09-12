package org.example.list;

import java.util.LinkedList;

public class P20 {
    public static String getFirstElement(LinkedList<String> list) {
        return list.peek();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        System.out.println(getFirstElement(list));
        System.out.println(list);
    }
}
