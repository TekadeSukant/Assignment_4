package com.company.Assign4;

import java.util.LinkedHashSet;

// WAP to remove Duplicates from a String
public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Hello World!";
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        char[] chars = str.toCharArray();

        for (char c : chars) {
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : set) {
            sb.append(character);
        }

        return sb.toString();
    }
}
