package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class TheHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int max = Integer.MIN_VALUE;
        for (int height_i = 0; height_i < n; height_i++) {
            int next = in.nextInt();
            if (next > max) {
                max = next;
            }
        }

        System.out.println(max - k >= 0 ? max - k : 0);
    }
}
