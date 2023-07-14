package com.company.Assign4;

import java.util.Scanner;


//WAP to implement anagram checking the least inbuilt methods being used
public class AnagramChecker {

    public static boolean areAnagrams(@org.jetbrains.annotations.NotNull String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1.toLowerCase(), str2.toLowerCase())) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }
}

