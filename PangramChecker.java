package com.company.Assign4;


// WAP to implement pangram checking with the least inbuilt methods being used
public class PangramChecker {
    public static boolean isPangram(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();

        boolean[] letters = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z') {
                letters[c - 'a'] = true;
            }
        }


        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(sentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}

