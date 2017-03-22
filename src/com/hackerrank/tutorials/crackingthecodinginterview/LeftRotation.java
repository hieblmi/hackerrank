package com.hackerrank.tutorials.crackingthecodinginterview;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int result[] = new int[n];

        System.arraycopy(a, 0, result, n - d, d);
        System.arraycopy(a, d, result, 0, n - d);

        Arrays.stream(result).forEach(x -> System.out.print(x + " "));

    }
}
