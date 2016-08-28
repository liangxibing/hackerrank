package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by liangxibing on 2016/8/28.
 * Problem: https://www.hackerrank.com/challenges/30-queues-stacks
 */
public class Day_18_Queues_And_Stacks {
    // Write your code here.
    private Stack<Character> stack;
    private Queue<Character> queue;

    private Day_18_Queues_And_Stacks() {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    private void pushCharacter(char ch) {
        stack.push(ch);
    }

    private char popCharacter() {
        return stack.pop();
    }

    private void enqueueCharacter(char ch) {
        queue.offer(ch);
    }

    private char dequeueCharacter() {
        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day_18_Queues_And_Stacks p = new Day_18_Queues_And_Stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
