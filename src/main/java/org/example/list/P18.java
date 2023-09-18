package org.example.list;

import java.util.LinkedList;

public class P18 {
    public static LinkedList<String> clone(LinkedList<String> original) {
        return new LinkedList<>(original);
    }

    public static void main(String[] args) {
        LinkedList<String> original = new LinkedList<>();
        original.add("Один");
        original.add("Два");
        original.add("Три");
        original.add("Четыре");
        LinkedList<String> copy = clone(original);
        System.out.println(copy);
    }
}
