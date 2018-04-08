package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/04/08.
 * Problem: https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
 */
public class Merge_two_sorted_linked_lists {

    class Node {
        int data;
        Node next;
    }

    Node mergeLists(Node headA, Node headB) {
        if (null == headA)
            return headB;
        if (null == headB)
            return headA;
        if (headA.data <= headB.data) {
            headA.next = mergeLists(headA.next, headB);
            return headA;
        }
        headB.next = mergeLists(headA, headB.next);
        return headB;
    }
}
