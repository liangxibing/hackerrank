package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/04/15.
 * Problem: https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem
 */
public class Reverse_a_doubly_linked_list {

    class Node {
        int data;
        Node next;
        Node prev;
    }

    Node Reverse(Node head) {
        if (null == head)
            return null;
        if (null == head.next) {
            head.prev = null;
            return head;
        }
        Node result = Reverse(head.next);
        head.next.next = head;
        head.prev = head.next;
        head.next = null;
        return result;
    }
}
