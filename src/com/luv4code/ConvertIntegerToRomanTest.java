package com.luv4code;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConvertIntegerToRomanTest {
    public static void main(String[] args) {
        String roman_number = romanNums(36);
        System.out.println("roman_number = " + roman_number);
    }

    public static String romanNums(int number){
        Map<String,Integer> map = new LinkedHashMap<>();
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

        String res ="";
        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            int matches = number / entry.getValue();
            res += repeat(entry.getKey(),matches);
            number = number% entry.getValue();
        }
        return res;

    }

    private static String repeat(String key, int n) {
        if(key == null){
            return  null;
        }
        final StringBuffer sb =new StringBuffer();
        for(int i=0;i<n;i++){
            sb.append(key);
        }
        return sb.toString();
    }
}
