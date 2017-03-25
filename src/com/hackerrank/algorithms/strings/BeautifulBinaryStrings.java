package com.hackerrank.algorithms.strings;

import java.util.Scanner;

public class BeautifulBinaryStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        String s = in.nextLine();
        int counter = 0;
        int index = s.indexOf("010", 0);
        while (index != -1) {
            counter++;
            s = s.substring(s.indexOf("010", 0) + 3);
            index = s.indexOf("010", 0);
        }
        System.out.println(counter);
    }
}