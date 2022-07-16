package com.luv4code;

public class SwapTwoStringsTest {
    public static void main(String[] args) {
        String input1 = "madhav";
        String input2 = "ponnana";

        System.out.println("Before Swapping");
        System.out.println("Input1 : "+input1);
        System.out.println("Input2 : "+input2+"\n");

        input1 = input1 + input2;
        input2 = input1.substring(0, input2.length() - 1);
        input1 = input1.substring(input2.length());

        System.out.println("After Swapping");
        System.out.println("Input1 : "+input1);
        System.out.println("Input2 : "+input2);




    }
}
