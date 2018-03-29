package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/03/29.
 * Problem: https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem
 */
public class Insert_a_node_at_the_head_of_a_linked_list {

    class Node {
        int data;
        Node next;
    }

    Node Insert(Node head,int x) {
        Node result = new Node();
        result.data = x;
        result.next = head;
        return result;
    }
}
