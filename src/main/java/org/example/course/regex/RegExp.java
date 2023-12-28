package org.example.course.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        String str = "Alle Operation mit minus Operator: 97-23 ;;;    89  -   34 + 98     -  7  ";
        Pattern patter = Pattern.compile("\\d+\\s*-\\s*\\d+");
        Matcher matcher = patter.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.toMatchResult().group());
        }
    }
}
