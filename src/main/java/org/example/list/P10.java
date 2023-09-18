package org.example.list;

import java.util.Arrays;
import java.util.LinkedList;

public class P10 {
    public static int[] getFirstAndLastElement(LinkedList<String> list, String s1) {
        int indexFirst = list.indexOf(s1);
        int indexLast = list.lastIndexOf(s1);
        return new int[]{indexFirst, indexLast};
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        strings.add("Один");
        strings.add("Пять");
        strings.add("Один");
        System.out.println(Arrays.toString(getFirstAndLastElement(strings, "Один")));
    }
}
