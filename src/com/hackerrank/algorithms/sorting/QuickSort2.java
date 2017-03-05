package com.hackerrank.algorithms.sorting;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by michi on 3/4/17.
 */
public class QuickSort2 {


    private static List<Integer> quickSort(List<Integer> list) {
        if(list.size() < 2) {
            return list;
        }

        int pivot = list.remove(0);
        final List<Integer> left = new ArrayList<>();
        final List<Integer> right = new ArrayList<>();
        list.stream().forEach(x ->  { if(x < pivot) {left.add(x);} else {right.add(x);}});
        List<Integer> l = quickSort(left);
        print(l);
        List<Integer> r = quickSort(right);
        print(r);
        l.add(pivot);
        l.addAll(r);
        return l;
    }

    private static void print(List<Integer> l) {
        if(l.size() > 1) {
            l.stream().forEach(x -> System.out.print(x + " "));
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(Paths.get("/Users/michi/projects/hackerrank/src/com/hackerrank/algorithms/sorting/quicksort2.txt"));

        int n = in.nextInt();
        IntStream.range(0, n).forEach(x -> {
            list.add(in.nextInt());
        });

        List<Integer> l = quickSort(list);
        print(l);
    }
}
