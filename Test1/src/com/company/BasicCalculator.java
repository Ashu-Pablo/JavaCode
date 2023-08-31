package com.company;

import java.util.Scanner;

public class BasicCalculator {
    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double calculateLogarithm(double number) {
        return Math.log(number);
    }

    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Basic Calculator!");
        System.out.println("Please choose an operation:");
        System.out.println("1. Square Root");
        System.out.println("2. Logarithm");
        System.out.println("3. Factorial");

        int choice = sc.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid choice. Please try again.");
            return;
        }

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        if (choice == 1) {
            double result = calculateSquareRoot(number);
            System.out.println("The square root of " + number + " is: " + result);
        } else if (choice == 2) {
            double result = calculateLogarithm(number);
            System.out.println("The logarithm of " + number + " is: " + result);
        } else {
            int result = calculateFactorial((int) number);
            System.out.println("The factorial of " + (int) number + " is: " + result);
        }
    }
}

