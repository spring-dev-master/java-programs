package com.luv4code;

import java.util.Scanner;

public class ArmstrongNumberTest {
    public static void main(String[] args) {
        int sum = 0, a, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        temp = number;

        while (number > 0) {
            a = number % 10;
            sum = sum + (a * a * a);
            number = number / 10;
        }
        if (temp == sum)
            System.out.println("This is a armstrong number");
        else
            System.out.println("This is not a armstrong number");
    }
}
