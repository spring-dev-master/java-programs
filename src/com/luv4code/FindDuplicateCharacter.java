package com.luv4code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        String input = "madhav ponnana, akkivalasa";
        char[] ch = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < ch.length - 1; i++) {
            char c = ch[i];
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }

        System.out.println(map);
        System.out.println("===============");

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> itr = entries.iterator();
        while (itr.hasNext()) {
            Map.Entry<Character, Integer> entry = itr.next();
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " , " + entry.getValue());
            }
        }
    }
}
