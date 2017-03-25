package com.hackerrank.algorithms.sorting;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class InsertionSort1 {


    public static void insertIntoSorted(int[] a) {
        int x = a[a.length - 1];
        for (int i = a.length - 2; i > 0; i--) {
            a[i + 1] = a[i];
            print(a);
            if (a[i - 1] < x) {
                a[i] = x;
                print(a);
                return;
            } else if (i == 1) {
                a[i] = a[i - 1];
                print(a);
                a[i - 1] = x;
                print(a);
                return;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get(".\\src\\com\\hackerrank\\algorithms\\sorting\\insertionSort1.txt"));
        int s = in.nextInt();
        int[] a = new int[s];
        for (int i = 0; i < s; i++) {
            a[i] = in.nextInt();
        }
        insertIntoSorted(a);
    }


    private static void print(int[] a) {
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }


}
