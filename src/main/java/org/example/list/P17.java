package org.example.list;

import java.util.LinkedList;

public class P17 {
    public static void mixList(LinkedList<String> list1, LinkedList<String> list2) {
        list1.addAll(list2);
    }

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Один");
        list1.add("Два");
        list1.add("Три");
        list1.add("Четыре");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Пять");
        list2.add("Шесть");
        mixList(list1, list2);
        System.out.println(list1);
    }
}
