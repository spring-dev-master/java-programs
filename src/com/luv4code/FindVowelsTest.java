package com.luv4code;

public class FindVowelsTest {
    public static void main(String[] args) {
        String input = "hello this is madhav";

        int count = 0;

        String str = input.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }

        System.out.println("No of Vowels: " + count);


    }
}
