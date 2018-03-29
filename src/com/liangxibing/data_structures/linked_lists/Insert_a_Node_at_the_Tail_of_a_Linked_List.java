package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/03/29.
 * Problem: https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
 */
public class Insert_a_Node_at_the_Tail_of_a_Linked_List {

    class Node {
        int data;
        Node next;
    }

    Node Insert(Node head,int data) {
        Node last = new Node();
        last.data = data;
        if (null == head) {
            return last;
        }
        Node tmp = head;
        while (tmp.next != null)
            tmp = tmp.next;
        tmp.next = last;
        return head;
    }
}
