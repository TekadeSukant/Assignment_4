package com.company.Assign4;

import java.util.HashSet;
import java.util.Set;

//WAP to find if String contains all unique character
public class UniqueCharacterChecker {
    public static boolean hasUniqueCharacters(String str) {

        Set<Character> uniqueChars = new HashSet<>();

        for (char ch : str.toCharArray()) {

            if (uniqueChars.contains(ch)) {
                return false;
            }

            uniqueChars.add(ch);
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "abcdefg";

        if(hasUniqueCharacters(input1)){
            System.out.println("Specified Input has unique characters");
        }

    }

}
