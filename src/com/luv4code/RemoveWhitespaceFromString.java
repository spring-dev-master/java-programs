package com.luv4code;

public class RemoveWhitespaceFromString {
    public static void main(String[] args) {

/*
        //using string built-in functions
        String input = "Madhav Ponnana Akkivalasa";
        String result = input.replaceAll("\\s", "");
        System.out.println("result = " + result);
*/
        String input = "Hi My Name Is Madhav Ponnana";
        System.out.println(removeWhiteSpaceFromString(input));
    }

    private static String removeWhiteSpaceFromString(String input) {
        char[] ch = input.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ' && ch[i] != '\t') {
                sb.append(ch[i]);
            }
        }
        String result = sb.toString();
        return result;
    }
}
