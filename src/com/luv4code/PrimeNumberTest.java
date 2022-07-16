package com.luv4code;

public class PrimeNumberTest {
    public static void main(String[] args) {
        int i, j, s = 0;
        for (i = 2; i < 100; i++) {
            for (j = 2; j < i; j++) {
                s = 0;
                if (i % j == 0) {
                    s = 1;
                    break;
                }
            }
            if (s == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
