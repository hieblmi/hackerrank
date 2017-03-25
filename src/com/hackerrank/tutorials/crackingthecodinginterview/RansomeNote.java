package com.hackerrank.tutorials.crackingthecodinginterview;

import java.util.Hashtable;
import java.util.Scanner;

public class RansomeNote {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Hashtable<String, Integer> magazine = new Hashtable<String, Integer>();
        while (m-- > 0) {
            String m_s = in.next();
            Integer i = magazine.get(m_s);
            if (i != null) {
                magazine.put(m_s, ++i);
            } else {
                magazine.put(m_s, 1);
            }
        }

        //System.out.println("Hashtable: " + magazine);

        while (in.hasNext()) {
            String m_r = in.next();
            Integer i = magazine.get(m_r);

            //System.out.println("m_r: " + m_r);
            if (i == 0) {
                System.out.println("No");
                return;
            } else {
                magazine.put(m_r, --i);
            }
            //System.out.println("Hashtable reduced: " + magazine);
        }

        System.out.println("Yes");
    }
}
