package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class Task4Init {
    private int price = 0;
    Map<Character, Integer> map = new HashMap<>(getMap());

    public int getPriceWord(Map<Character, Integer> map, String word) {
        char[] chars = word.toCharArray();
        for (char c : chars) {
            if (!isLetter(c)) {
                break;
            }
            price += map.get(c);
        }
        return price;
    }

    public void printPriceWord() {
        if (price > 0) {
            System.out.print("Цена вашего слова: " + price);
        } else {
            System.out.print("Укажите слово!");
        }
    }

    public boolean isLetter(char c) {
        return Character.isLetter(c);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Map<Character, Integer> getMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('E', 1);
        map.put('I', 1);
        map.put('O', 1);
        map.put('U', 1);
        map.put('L', 1);
        map.put('N', 1);
        map.put('S', 1);
        map.put('T', 1);
        map.put('R', 1);
        map.put('D', 2);
        map.put('G', 2);
        map.put('B', 3);
        map.put('C', 3);
        map.put('M', 3);
        map.put('P', 3);
        map.put('F', 4);
        map.put('H', 4);
        map.put('V', 4);
        map.put('W', 4);
        map.put('Y', 4);
        map.put('K', 5);
        map.put('J', 8);
        map.put('X', 8);
        map.put('Q', 10);
        map.put('А', 1);
        map.put('В', 1);
        map.put('Е', 1);
        map.put('И', 1);
        map.put('Н', 1);
        map.put('О', 1);
        map.put('Р', 1);
        map.put('С', 1);
        map.put('Т', 1);
        map.put('Д', 2);
        map.put('К', 2);
        map.put('Л', 2);
        map.put('М', 2);
        map.put('П', 2);
        map.put('У', 2);
        map.put('Б', 3);
        map.put('Г', 3);
        map.put('Ё', 3);
        map.put('Ь', 3);
        map.put('Я', 3);
        map.put('Й', 4);
        map.put('Ы', 4);
        map.put('Ж', 5);
        map.put('З', 5);
        map.put('Х', 5);
        map.put('Ц', 5);
        map.put('Ч', 5);
        map.put('Ш', 8);
        map.put('Э', 8);
        map.put('Ю', 8);
        map.put('Ф', 10);
        map.put('Щ', 10);
        map.put('Ъ', 10);
        return map;

    }

}
