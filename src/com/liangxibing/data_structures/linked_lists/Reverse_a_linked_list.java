package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/04/05.
 * Problem: https://www.hackerrank.com/challenges/reverse-a-linked-list/problem
 */
public class Reverse_a_linked_list {

    class Node {
        int data;
        Node next;
    }

    Node Reverse(Node head) {
        if (null == head)
            return head;
        Node tail = head;
        Node cur;
        while (null != tail.next) {
            cur = tail.next;
            tail.next = cur.next;
            cur.next = head;
            head = cur;
        }
        return head;
    }
}
