package com.hackerrank.algorithms.sorting;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by michi on 3/4/17.
 */
public class QuickSort1 {

    private static List<Integer> left = new ArrayList<>();
    private static List<Integer> right = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(Paths.get("/Users/michi/projects/hackerrank/src/com/hackerrank/algorithms/sorting/quicksort1.txt"));

        int n = in.nextInt();
        int[] a = new int[n];
        int pivot = in.nextInt();
        right.add(0, pivot);
        for (int i = 0; i < n - 1; i++) {
            int x = in.nextInt();
            if (x < pivot) {
                left.add(x);
            } else if (x > pivot) {
                right.add(x);
            } else {
                right.add(0, x);
            }
        }

        left.addAll(right);

        for (Integer i : left
                ) {
            System.out.print(i + " ");
        }
    }
}
