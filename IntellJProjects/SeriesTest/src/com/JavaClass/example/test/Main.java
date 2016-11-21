package com.JavaClass.example.test;

import com.JavaClass.PackageChallenge1.com.JavaClass.PackageChallenge1.myLibrary.Series;


public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=0; i<=10;i++){
            System.out.println(Series.nSum(i));
        }
        System.out.println("*******************");

        for(int i=0; i<=10;i++){
            System.out.println(Series.factorial(i));
        }
        System.out.println("*******************");
        for(int i=0; i<=10;i++){
            System.out.println(Series.fibonacci(i));
        }

    }

}
