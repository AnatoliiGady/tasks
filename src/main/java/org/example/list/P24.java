package org.example.list;

import java.util.LinkedList;

public class P24 {
    public static boolean containsLinkedList(LinkedList<String> list1, LinkedList<String> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size() - 1; i++) {
            boolean rsl = list1.get(i).contains(list2.get(i));
            if (rsl) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Один");
        list1.add("Два");
        list1.add("Три");
        list1.add("Четыре");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Один");
        list2.add("Два");
        list2.add("Три");
        list2.add("Четыре");

        System.out.println(containsLinkedList(list1, list2));
    }
}
