package org.example.list;

import java.util.LinkedList;

public class P19 {
    public static String getAndRemoveFirstElement(LinkedList<String> list) {
        return list.poll();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        System.out.println(getAndRemoveFirstElement(list));
        System.out.println(list);
    }
}
