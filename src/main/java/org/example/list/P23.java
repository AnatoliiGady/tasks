package org.example.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class P23 {
    public static ArrayList<String> copyLinkedListToArrayList(LinkedList<String> list) {
        return new ArrayList<>(list);
    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        ArrayList<String> copy = copyLinkedListToArrayList(list);
        System.out.println(copy);

    }
}
