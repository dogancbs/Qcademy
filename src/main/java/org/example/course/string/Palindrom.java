package org.example.course.string;

public class Palindrom {
    public static void palindrom(String text) {

        String[] words = text.split("\\s+");

        for (String word : words) {

            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (isPalindrome(cleanedWord)) {
                System.out.println(word);
            }
        }
    }

    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "Der vor dir stehende Rentner heißt Otto Uwe";
        palindrom(text);
    }
}

