package com.hackerrank.algorithms.strings;

import java.util.Scanner;

public class LoveLetterMystery {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        while (in.hasNextLine()) {
            String s = in.nextLine();
            int sum = 0;
            for (int i = 0; i < s.length() / 2; i++) {
                sum += Math.abs(s.charAt(i) - s.charAt(s.length() - 1 - i));
            }
            System.out.println(sum);
        }
    }
}