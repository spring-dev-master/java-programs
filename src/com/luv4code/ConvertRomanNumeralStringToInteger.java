package com.luv4code;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConvertRomanNumeralStringToInteger {
    public static void main(String[] args) {
        int number = romanToInteger("XXXX");
        System.out.println(number);
    }

    public static int romanToInteger(String input) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);

        int number = 0;
        for (int i = 0; i < input.length(); i++) {
            number = number + (map.get(input.charAt(i)));
        }
        return number;
    }

}
