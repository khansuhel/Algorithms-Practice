package com.practice.g4g.soroco;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USPhoneNumberRegex {

    public static String check_regex(String input) {
        Pattern pattern = Pattern.compile("[0-9]\\d{2}-[0-9]\\d{2}-[0-9]\\d{3}");
        Pattern pattern2 = Pattern.compile("[(][0-9]\\d{2}[)]\\s[0-9]\\d{2}-[0-9]\\d{3}");

        Pattern pattern1 = Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{3}");

        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Matches first");
            return matcher.group();
        } else {
            System.out.println("Matches second");
            matcher = pattern2.matcher(input);
            if(matcher.find()){
                return matcher.group();
            }
        }
        return "NONE";
    }

    public static void main(String[] args) {
        System.out.println(USPhoneNumberRegex.check_regex("123-456-7891(123) 456-7890"));
    }
}
