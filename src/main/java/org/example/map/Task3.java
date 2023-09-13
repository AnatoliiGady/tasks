package org.example.map;

import java.util.*;

public class Task3 {
        public static Map<String, String> mapIsList(List<String> s1, List<String> s2) {
            Map<String, String> map = new LinkedHashMap<>();
            for (int i = 0; i < s1.size(); i++) {
                map.put(s1.get(i), s2.get(i));
            }
            return map;
        }

    public static void main(String[] args) {
        List<String> key = Arrays.asList("Лев", "Ящерица", "Корова");
        List<String> value = Arrays.asList("Хищник", "Хладнокровное", "Травоядное");
        Map<String, String> mapMix = mapIsList(key, value);
        System.out.println(mapMix);
    }
}
