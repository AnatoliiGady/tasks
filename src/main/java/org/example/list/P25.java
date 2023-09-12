package org.example.list;

import java.util.LinkedList;

public class P25 {
    public static boolean isEmptyLinkedList(LinkedList<String> list) {
        return list.isEmpty();
    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        System.out.println(isEmptyLinkedList(list));
    }
}
