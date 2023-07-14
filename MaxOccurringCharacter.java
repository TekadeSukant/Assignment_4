package com.company.Assign4;

import java.util.HashMap;
import java.util.Map;


// WAP to find the maximum occurring character in the String
public class MaxOccurringCharacter {
    public static void main(String[] args) {
        String input = "Hello World";
        char maxChar = findMaxOccurringChar(input);
        System.out.println("Maximum occurring character is : " + maxChar);
    }

    public static char findMaxOccurringChar(String str) {

        Map<Character, Integer> charFrequencies = new HashMap<>();

        for (char c : str.toCharArray()) {

            charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
        }

        char maxChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxChar = c;
                maxCount = count;
            }
        }

        return maxChar;
    }
}
