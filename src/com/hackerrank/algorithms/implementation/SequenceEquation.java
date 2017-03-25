package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SequenceEquation {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(in.nextInt(), i+1);
        }

        for(int i=1; i<=n; i++) {
            System.out.println(map.get(map.get(i)));
        }
    }
}
