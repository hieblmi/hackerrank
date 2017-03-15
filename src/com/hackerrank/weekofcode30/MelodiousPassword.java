package com.hackerrank.weekofcode30;

import java.util.Scanner;

public class MelodiousPassword {

    private static String consonants = "bcdfghjklmnpqrstvwxz";
    private static String vowles = "aeiou";
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int n = 6;
        // first param false -> start with consonant
        char[] password = new char[n];
        printMelodiousPasswords(false, password, n);
        printMelodiousPasswords(true, password, n);

        System.out.println(System.currentTimeMillis()-start);
    }

    private static void printMelodiousPasswords(boolean startWithVowel, char[] password, int length) {

        if(startWithVowel) {
            for(int i=0; i<vowles.length(); i++) {
                password[length-1] = vowles.charAt(i);
                if(length-1 == 0) {
                    System.out.println(password);
                } else {
                    printMelodiousPasswords(!startWithVowel, password, length - 1);
                }
            }
        } else {
            for(int i=0; i<consonants.length(); i++) {
                password[length-1] = consonants.charAt(i);
                if(length-1 == 0) {
                    System.out.println(password);
                } else {
                    printMelodiousPasswords(!startWithVowel, password, length - 1);
                }
            }
        }
    }
}
