package com.luv4code;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println("Enter Any Operator (+,-,*,/)");

        String input = scanner.next();
        double result;

        switch (input) {
            case "add":
                result = first + second;
                break;
            case "sub":
                result = first - second;
                break;
            case "mul":
                result = first * second;
                break;
            case "divide":
                result = first / second;
                break;
            default:
                System.out.println("Incorrect Operator");
                return;
        }
        System.out.printf("%.1f %s %.1f = %.1f", first, input, second, result);


    }
}
