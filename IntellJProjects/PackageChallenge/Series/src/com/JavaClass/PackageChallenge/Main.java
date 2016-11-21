package com.JavaClass.PackageChallenge;

import java.util.Scanner;

import static com.JavaClass.PackageChallenge.Series.factorial;
import static com.JavaClass.PackageChallenge.Series.fibonacci;
import static com.JavaClass.PackageChallenge.Series.nSum;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a suitably named package containing a class called Series
        // with the following static methods:
        // nSum(int n) returns the sum of all numbers from 0 to n. The first 10 numbers are:
        // 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.
        //
        // factorial(int n) returns the product of all numbers from 1 to n
        //      i.e. 1 * 2 * 3 * 4 ... * (n - 1) * n.
        // The first 10 factorials are:
        // 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.
        //
        // fibonacci(n) returns the nth Fibonacci number. These are defined as:
        // f(0) = 0
        // f(1) = 1
        // f(n) = f(n-1) + f(n-2)
        // (so f(2) is also 1. The first 10 fibonacci numbers are:
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
        //
        // When you have tested your functions, delete the Main class and
        // produce a jar file.
        //
        // Create a new project and add your Series library, then test the
        // three methods in the main() method of your new project.
        // write your code here


        for (int i = 0; i <= 10; i++) {
            System.out.println(nSum(i));
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(factorial(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(fibonacci(i));
        }


    }
        public static int[] getScanInt(int number) {
            System.out.println("Enter " + number + " integer values.\r");
            int[] values = new int[number];
            for (int i = 0; i < values.length; i++) {

            }
            return values;
        }

    }

