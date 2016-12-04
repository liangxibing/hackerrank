package com.liangxibing.tutorials.cracking_the_coding_interview;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by liangxibing on 4/12/16.
 * Problem: https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks
 */

public class Queues_A_Tale_of_Two_Stacks {
    private static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<>();
        Stack<T> stackOldestOnTop = new Stack<>();

        void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        T peek() {
            // if old stack is not empty, return the top element
            if (!stackOldestOnTop.isEmpty())
                return stackOldestOnTop.peek();
            // if old stack is empty, push element from new stack one by one
            while (!stackNewestOnTop.isEmpty()) {
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
            // return the top element of old stack or null if old stack is empty
            return stackOldestOnTop.isEmpty() ? null : stackOldestOnTop.peek();
        }

        T dequeue() {
            // if old stack is not empty, pop and return the top element
            if (!stackOldestOnTop.isEmpty())
                return stackOldestOnTop.pop();
            // if old stack is empty, push element from new stack one by one
            while (!stackNewestOnTop.isEmpty()) {
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
            // pop and return the top element of old stack or return null if old stack is empty
            return stackOldestOnTop.isEmpty() ? null : stackOldestOnTop.pop();
        }
    }


    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
