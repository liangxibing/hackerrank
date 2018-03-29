package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/03/29.
 * Problem: https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
 */
public class Insert_a_node_at_a_specific_position_in_a_linked_list {

    class Node {
        int data;
        Node next;
    }

    Node InsertNth(Node head, int data, int position) {
        Node result = new Node();
        result.data = data;
        // If position is 0, then inserted node will be the new head (0 steps need to be moved)
        if (0 == position) {
            result.next = head;
            return result;
        }

        Node cur = head;
        // Once move one step, minus position by 1, until position = 1, which means only 1 step left
        while (position-- > 1)
            cur = cur.next;
        // Move the last step so that the inserted node will be the next of current node
        result.next = cur.next;
        cur.next = result;
        return head;
    }
}
