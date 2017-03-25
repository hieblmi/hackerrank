package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[(a_i + k) % n] = in.nextInt();
        }
        for (int a0 = 0; a0 < q; a0++) {
            System.out.println(a[in.nextInt()]);
        }
    }
}
