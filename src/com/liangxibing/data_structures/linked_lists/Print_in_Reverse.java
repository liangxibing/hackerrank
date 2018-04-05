package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/04/05.
 * Problem: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem
 */
public class Print_in_Reverse {

    class Node {
        int data;
        Node next;
    }

    // Recursion
    void ReversePrint(Node head) {
        if (null == head)
            return;
        ReversePrint(head.next);
        System.out.println(head.data);
    }
}
