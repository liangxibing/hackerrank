package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/04/08.
 * Problem: https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
 */
public class Get_Node_Value {

    class Node {
        int data;
        Node next;
    }

    int GetNode(Node head,int n) {
        if (n == getPosition(head))
            return head.data;
        return GetNode(head.next, n);
    }

    int getPosition(Node head) {
        if (null == head)
            return -1;
        return getPosition(head.next) + 1;
    }
}
