package com.luv4code;

public class PrintString1000Times {
    public static void main(String[] args) {
        String input = "Madhav Ponnana\n";
        String input3 = input + input + input;
        String input10 = input3 + input3 + input3 + input;
        String input30 = input10 + input10 + input10;
        String input100 = input30 + input30 + input30 + input10;
        String input300 = input100 + input100 + input100;
        String input1000 = input300 + input300 + input300 + input100;
        System.out.println(input1000);


    }
}
