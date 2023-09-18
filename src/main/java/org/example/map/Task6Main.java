package org.example.map;


import java.util.*;
import java.util.stream.Stream;

public class Task6Main {
    public static void main(String[] args) {
        Map<String, String> map0 = new LinkedHashMap<>();
        map0.put("name", "Кирилл");
        map0.put("age", "26");
        map0.put("position", "Middle java dev");
        map0.put("salary", "150000 руб");

        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("name", "Виталий");
        map1.put("age", "28");
        map1.put("position", "Senior java automation QA");
        map1.put("salary", "2000 $");

        Map<String, String> map2 = new LinkedHashMap<>();
        map2.put("name", "Александр");
        map2.put("age", "31");
        map2.put("position", "Junior functional tester");
        map2.put("salary", "50000 руб");

        Map<String, String> map3 = new LinkedHashMap<>();
        map3.put("name", "Дементий");
        map3.put("age", "35");
        map3.put("position", "Dev-ops");
        map3.put("salary", "1500 $");

        List<Map<String, String>> list = new ArrayList<>();
        list.add(map0);
        list.add(map1);
        list.add(map2);
        list.add(map3);

        for (Map<String, String> employee : list) {
            String ageStr = employee.get("age");
            int age = Integer.parseInt(ageStr);
            if (age < 30) {
                System.out.println(employee);
            }
        }
        System.out.println("------------------");

        for (Map<String, String> employee : list) {
            String salary = employee.get("salary");
            String[] a = salary.split(" ");
            for (String str : a) {
                if (str.equals("$")) {
                    System.out.println(employee);
                }
            }
        }
        System.out.println("------------------");

        int count = 0;
        int averageAge = 0;
        for (Map<String, String> employee : list) {
            String ageStr = employee.get("age");
            int age = Integer.parseInt(ageStr);
            averageAge += age;
            count++;
        }
        System.out.println(averageAge / count);

    }
}



