package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/04/15.
 * Problem: https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem
 */
public class Inserting_a_Node_Into_a_Sorted_Doubly_Linked_List {

    class Node {
        int data;
        Node next;
        Node prev;
    }

    Node SortedInsert(Node head,int data) {
        Node ins = new Node();
        ins.data = data;
        if (null == head || head.data > data) {
            ins.next = head;
            ins.prev = null;
            if (null != head)
                head.prev = ins;
            return ins;
        }
        Node cur = head;
        while (cur.next != null) {
            if (data >= cur.data && data < cur.next.data) {
                ins.next = cur.next;
                ins.prev = cur;
                cur.next.prev = ins;
                cur.next = ins;
                return head;
            }
            cur = cur.next;
        }
        ins.next = null;
        ins.prev = cur;
        cur.next = ins;
        return head;
    }
}
