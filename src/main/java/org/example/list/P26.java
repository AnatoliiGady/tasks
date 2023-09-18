package org.example.list;

import java.util.LinkedList;

public class P26 {
    public static void replaceElement(LinkedList<String> list, String oldElement, String newElement) {
        list.set(list.indexOf(oldElement), newElement);
    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        replaceElement(list, "Один", "Ноль");
        System.out.println(list);
    }
}
