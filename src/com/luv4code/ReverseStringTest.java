package com.luv4code;

public class ReverseStringTest {

    public static void main(String[] args) {
        String input = "madhav";
/*
        String resultString = reverseStringUsingInbuiltMethod(input);
        System.out.println(resultString);
*/

/*
        String resultString = reverseStringUsingForLoop(input);
        System.out.println(resultString);
*/
        char[] ch = input.toCharArray();
        int length = ch.length;

        reverseStringUsingRecursion(ch, length);

    }

    private static String reverseStringUsingInbuiltMethod(String input) {
        StringBuffer sb = new StringBuffer(input);
        return sb.reverse().toString();
    }

    private static String reverseStringUsingForLoop(String input) {
        char[] ch = input.toCharArray();
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + ch[i];
        }
        return reverse;
    }

    public static void reverseStringUsingRecursion(char[] ch, int length) {
        if (length > 0) {
            System.out.print(ch[length - 1]);
            length--;
            reverseStringUsingRecursion(ch, length);
        }
    }

}


