package org.example.map;


import java.util.*;

public class Task5 {
    private String text = "";

    public Task5(String text) {
        this.text = text.toLowerCase();
    }

    public LinkedHashMap<String, Integer> getFrequencyWordsInMap() {
        LinkedHashMap<String, Integer> wordsFrequency = new LinkedHashMap<>();
        String[] words = textToArray(text);
        for (String word : words) {
            Integer frequency = wordsFrequency.get(word);
            if (frequency != null) {
                wordsFrequency.put(word, 1 + frequency);
            } else {
                wordsFrequency.put(word, 1);
            }
        }
        return wordsFrequency;
    }

    public String[] textToArray(String text) {
        return text.split(" ");
    }

    public List<Map.Entry<String, Integer>> sortMapValue() {
        List<Map.Entry<String, Integer>> valuesSort = new ArrayList<>(getFrequencyWordsInMap().entrySet());
        valuesSort.sort((val1, val2) -> val2.getValue().compareTo(val1.getValue()));
        return valuesSort;
    }
}


