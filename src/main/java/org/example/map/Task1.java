package org.example.map;

import java.util.Map;

public class Task1 {
    public static void printMap(Map<String, Integer> map) {
        int value = 1;
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            value *= element.getValue();
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Коля", 1, "Саша", 2, "Петя", 3, "Валя", 4);
        printMap(map);
    }
}
