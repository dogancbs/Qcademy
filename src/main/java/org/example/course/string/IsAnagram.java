package org.example.course.string;

import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);

    }
    public static void main(String[] args) {
        String str1 = "Desperation";
        String str2 = "A rope Ends It";

        boolean areAnagrams = isAnagram(str1, str2);
        if (areAnagrams) {
            System.out.println("\"" + str1 + "\" und \"" + str2 + "\" sind Anagramme.");
        } else {
            System.out.println("\"" + str1 + "\" und \"" + str2 + "\" sind keine Anagramme.");
        }

    }

}
