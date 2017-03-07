package com.hackerrank.algorithms.strings;

import java.io.*;
import java.util.*;

public class PalindromeIndex {

    private static int getDirtyPalindromeIndex(String s) {
        int len = s.length();
        int i_left = -1;
        int i_right = -1;
        boolean mismatch = false;
        for(int i=0, j=len-1; i<(len)/2; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                if(mismatch) {
                    return i_left;
                }
                i_left = i;
                i_right = j;
                i--;
                mismatch = true;
            }
        }
        return i_right;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        while(in.hasNextLine()) {
            System.out.println(getDirtyPalindromeIndex(in.nextLine()));
        }
    }
}