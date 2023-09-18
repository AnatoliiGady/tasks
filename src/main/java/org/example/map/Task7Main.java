package org.example.map;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Task7Main {
    public static void main(String[] args) {
        Task7 task7 = new Task7("Хватит это терпеть. Если терпеть назовут терпилой. А если не терпеть посадят терпеть");

        System.out.println(task7.getThreeMaxRepeatedWords());

    }
}



