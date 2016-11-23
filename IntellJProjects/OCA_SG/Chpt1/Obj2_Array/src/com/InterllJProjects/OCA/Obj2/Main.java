package com.InterllJProjects.OCA.Obj2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[]key;
        int key1[];
        Thread[] threads;
        Thread threads1[];
        String [][][] occupantName;
        String[] managerName[];
        //int[5]scores;  error: array are allocated when instantiate
        int[] scores = new int[5];
        scores[0] =30;//load array
        scores[1] =31;
        scores[2] =32;
        scores[3] =33;
        scores[4] =34;

        int[] score2 = new int[5];
        System.out.println(" score array 3 is "+ scores[3]);

        for (int i = 0; i < score2.length; i++) {
            score2[i]= i*10; // load score2 array
        }
        System.out.println(" **********************");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(" scores "+ i + " value: "+ scores[i]);

        }

        System.out.println(" **********************");

        for (int i = 0; i < score2.length; i++) {
            System.out.println(" score2 "+ i + " value: "+ score2[i]);

        }

    }
}
