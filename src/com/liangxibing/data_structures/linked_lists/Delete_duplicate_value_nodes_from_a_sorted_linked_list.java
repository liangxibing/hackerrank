package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/04/09.
 * Problem: https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem
 */
public class Delete_duplicate_value_nodes_from_a_sorted_linked_list {

    class Node {
        int data;
        Node next;
    }

    Node RemoveDuplicates(Node head) {
        Node cur = head;
        while (null != cur && null != cur.next) {
            if (cur.data == cur.next.data)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }
        return head;
    }
}
