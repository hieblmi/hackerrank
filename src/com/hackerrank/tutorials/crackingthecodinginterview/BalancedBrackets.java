package com.hackerrank.tutorials.crackingthecodinginterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static Map<Character, Character> map = new HashMap<Character, Character>();

    public static boolean isBalanced(String expression) {
        int length = expression.length();

        if (length % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < length; i++) {
            if (isClosingBracket(expression.charAt(i))) {
                if (stack.empty()) return false;
                if (map.get(expression.charAt(i)) != stack.pop())
                    return false;
            } else {
                stack.push(expression.charAt(i));
            }
        }

        if (stack.size() > 0) return false;

        return true;
    }

    private static boolean isClosingBracket(Character c) {
        return c == ']' || c == '}' || c == ')';
    }

    public static void main(String[] args) {
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}
