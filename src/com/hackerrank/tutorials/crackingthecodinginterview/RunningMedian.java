package com.hackerrank.tutorials.crackingthecodinginterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian {
    private static ArrayList<Integer> heap = new ArrayList<Integer>();
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int first = in.nextInt();
        System.out.printf("%.1f\n", (float) first);
        int second = in.nextInt();

        if (first > second) {
            minHeap.add(first);
            maxHeap.add(second);
        } else {
            minHeap.add(second);
            maxHeap.add(first);
        }
        System.out.printf("%.1f\n", (float) (minHeap.peek() + maxHeap.peek()) / 2);
        for (int a_i = 2; a_i < n; a_i++) {
            int next = in.nextInt();
            if (next < maxHeap.peek()) {
                maxHeap.add(next);
            } else {
                minHeap.add(next);
            }

            while (minHeap.size() - maxHeap.size() > 1) {
                maxHeap.add(minHeap.poll());
            }

            while (minHeap.size() - maxHeap.size() < -1) {
                minHeap.add(maxHeap.poll());
            }

            if (minHeap.size() == maxHeap.size()) {
                System.out.printf("%.1f\n", (float) (minHeap.peek() + maxHeap.peek()) / 2);
            } else if (minHeap.size() > maxHeap.size()) {
                System.out.printf("%.1f\n", (float) minHeap.peek());
            } else {
                System.out.printf("%.1f\n", (float) maxHeap.peek());
            }
        }
    }
}
