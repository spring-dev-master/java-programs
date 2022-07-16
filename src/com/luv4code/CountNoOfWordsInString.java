package com.luv4code;

public class CountNoOfWordsInString {
    public static void main(String[] args) {
        String input = "my name is madhav";
        String[] strings = input.split("\\s");
        int length = strings.length;
        System.out.println(length);
    }
}
