package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int s = in.nextInt();
            int thresh = in.nextInt();
            int sum = 0;
            for (int j = 0; j < s; j++) {
                int c = in.nextInt();
                if (c <= 0) {
                    sum++;
                }
            }
            if (sum >= thresh) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}