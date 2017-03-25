package com.hackerrank.algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConstruction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            String s = in.next();
            String p = "";
            int cost = 0;
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            System.out.println(set.size());
        }
    }
}
