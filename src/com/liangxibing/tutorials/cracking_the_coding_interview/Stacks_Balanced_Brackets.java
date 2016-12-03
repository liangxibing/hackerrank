package com.liangxibing.tutorials.cracking_the_coding_interview;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by liangxibing on 3/12/16.
 * Problem: https://www.hackerrank.com/challenges/ctci-balanced-brackets
 */
public class Stacks_Balanced_Brackets {

    private static boolean isBalanced(String expression) {
        Stack<Character> s = new Stack<>();
        int index;
        String openBracket = "{[(";
        String closeBracket = "}])";
        for (char current : expression.toCharArray()) {
            // if current char is open bracket, push it to stack
            if (-1 != openBracket.indexOf(current)) {
                s.push(current);
                continue;
            }
            index = closeBracket.indexOf(current);
            // if current char is not close bracket either, continue to next char
            if (-1 == index) continue;
            // if stack is already empty, string is not balanced
            if (s.empty()) return false;
            // if current char can't be the pair to top char of stack, string is not balanced
            if (index
                    != openBracket.indexOf(s.pop())) // also pop the top element
                return false;
        }
        // if stack is empty then every open bracket is eliminated correctly and string is balanced
        return s.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
