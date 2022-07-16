package com.luv4code;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        String input = "100";
        int value = Integer.parseInt(input);
        System.out.println("value = " + value);

        Integer integer = Integer.valueOf(input);
        System.out.println("integer = " + integer);

    }
}
