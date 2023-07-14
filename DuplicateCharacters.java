package com.company.Assign4;

import java.util.HashMap;
import java.util.Map;


//WAP to print duplicates characters from a string
public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello World";
        printDuplicateCharacters(str);
    }

    public static void printDuplicateCharacters(String str) {

        str = str.toLowerCase();

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isAlphabetic(c)) {

                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {

                    charCountMap.put(c, 1);
                }
            }
        }


        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - count: " + entry.getValue());
            }
        }
    }
}
