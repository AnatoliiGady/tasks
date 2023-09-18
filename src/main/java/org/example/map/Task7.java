package org.example.map;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Task7 {
    private String text = "";

    public Task7(String text) {
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

    public  List<String> getThreeMaxRepeatedWords() {
        List<Map.Entry<String, Integer>> entries = sortMapValue();
        List<String> threeMaxWord = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            threeMaxWord.add(entries.get(i).getKey());
        }
        return threeMaxWord;
    }
}


