package org.example.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < 11; i++) {
            map.put(i, i * i * i);
        }
        System.out.println(map);
    }

}
