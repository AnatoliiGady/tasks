package org.example.map;


import java.util.*;

public class Task5 {


    public static void main(String[] args) {
        String text = "Счастье счастье приходит с правильными суждениями правильные суждения приходят с опытом а опыт приходит с ошибочными суждениями";
        String[] a = text.split(" ");
        Map<String, Integer> words = new LinkedHashMap<>();
        for (String str : a) {
            if (words.containsKey(str.toLowerCase())) {
                words.put(str.toLowerCase(), 1 + words.get(str));
            } else {
                words.put(str.toLowerCase(), 1);
            }
        }
        List<Map.Entry<String, Integer>> listSort = new ArrayList<>(words.entrySet());
        Collections.sort(listSort, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> pair1, Map.Entry<String, Integer> pair2) {
                return pair2.getValue().compareTo(pair1.getValue());
            }
        });

        System.out.println(listSort);
    }
}

