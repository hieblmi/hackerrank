package com.hackerrank.algorithms.strings;

import java.util.*;

public class SherlockValidString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Map<Character, Integer> freq = new HashMap<>();
        // frequence of characters
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            Integer v = freq.get(c);
            freq.put(c, v == null ? 1 : v + 1);
        }

        // frequence of freuquencies
        Map<Integer, Integer> freqFreq = new HashMap<>();
        List<Integer> list = new ArrayList<>(freq.values());
        for (int i = 0; i < list.size(); i++) {
            Integer c = list.get(i);
            Integer v = freqFreq.get(c);
            freqFreq.put(c, v == null ? 1 : v + 1);
        }

        List<Integer> keys = new ArrayList<>(freqFreq.keySet());
        if (keys.size() > 2) {
            System.out.println("NO");
        } else if (keys.size() == 2) {
            if (freqFreq.get(keys.get(0)) == 1 || freqFreq.get(keys.get(1)) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("YES");
        }
    }
}