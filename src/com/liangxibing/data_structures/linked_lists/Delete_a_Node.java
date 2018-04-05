package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/04/05.
 * Problem: https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
 */
public class Delete_a_Node {

    class Node {
        int data;
        Node next;
    }

    Node Delete(Node head, int position) {
        if (0 == position)
            return head.next;
        Node cur = head;
        while(position-- > 1)
            cur = cur.next;
        cur.next = cur.next.next;
        return head;
    }

}
