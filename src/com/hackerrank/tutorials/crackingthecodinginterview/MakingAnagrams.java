package com.hackerrank.tutorials.crackingthecodinginterview;

import java.util.Scanner;

public class MakingAnagrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

    public static int numberNeeded(String a, String b) {
        String iter;
        String checkup;
        if (a.length() > b.length()) {
            iter = a;
            checkup = b;
        } else {
            iter = b;
            checkup = a;
        }

        String copy = iter + "";
        for (int i = 0; i < iter.length(); i++) {
            char c = iter.charAt(i);
            if (checkup.contains(String.valueOf(c))) {
                checkup = checkup.replaceFirst(String.valueOf(c), "");
                copy = copy.replaceFirst(String.valueOf(c), "");
            }
        }

        return checkup.length() + copy.length();
    }
}