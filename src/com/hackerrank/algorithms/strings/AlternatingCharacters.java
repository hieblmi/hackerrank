package com.hackerrank.algorithms.strings;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class AlternatingCharacters {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get(".\\src\\com\\hackerrank\\algorithms\\strings\\AlternatingCharacters.txt"));
        in.nextLine();
        while (in.hasNextLine()) {
            String s = in.nextLine();
            boolean A = s.startsWith("B") ? true : false;
            int toDelete = 0;
            for (int i = 1; i < s.length(); i++) {
                char compareTo = 'B';
                if (A) {
                    compareTo = 'A';
                }
                int j = i;
                for (; j < s.length(); j++) {
                    if (s.charAt(j) != compareTo)
                        toDelete++;
                    else {
                        i = j;
                        A = !A;
                        break;
                    }
                }
                if (j == s.length())
                    break;
            }
            System.out.println(toDelete);
        }
    }
}