package com.hackerrank.algorithms.sorting;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort2 {


    public static void insertIntoSorted(int[] a, int rightEnd) {
        for (int i = rightEnd-1; i >= 0; i--) {
            if(a[i] > a[i+1]) {
                int tmp = a[i+1];
                a[i+1] = a[i];
                a[i] = tmp;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("/Users/michi/projects/hackerrank/src/com/hackerrank/algorithms/sorting/insertionSort2.txt"));
        int s = in.nextInt();
        int[] a = new int[s];
        for (int i = 0; i < s; i++) {
            a[i] = in.nextInt();
        }

        for(int i=1; i<a.length; i++) {
            insertIntoSorted(a, i);
            print(a);
        }
    }


    private static void print(int[] a) {
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }


}
