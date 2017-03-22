package com.hackerrank.tutorials.crackingthecodinginterview;

import java.util.Scanner;

public class TriesContacts {

    private static class Node {
        public int wordCount = 0;
        public Node[] children = new Node[26];
    }

    private static class Contacts {
        public Node root;

        Contacts() {
            root = new Node();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Contacts contacts = new Contacts();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();

            if (op.equals("add")) {
                add(contacts, contact);
            } else if (op.equals("find")) {
                System.out.println(find(contacts, contact));
            }
        }
    }

    private static void add(Contacts contacts, String name) {
        Node[] current = contacts.root.children;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            int index = letter - 'a';
            if (current[index] == null) {
                current[index] = new Node();
            }
            current[index].wordCount++;
            current = current[index].children;
        }
    }

    private static int find(Contacts contacts, String name) {
        Node[] current = contacts.root.children;
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            int index = letter - 'a';
            if (current[index] == null) {
                return 0;
            }
            if (i + 1 == name.length()) {
                count = current[index].wordCount;
            }
            current = current[index].children;
        }

        return count;
    }
}
