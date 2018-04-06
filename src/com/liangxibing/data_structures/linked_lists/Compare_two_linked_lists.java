package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/04/06.
 * Problem: https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
 */
public class Compare_two_linked_lists {

    class Node {
        int data;
        Node next;
    }

    int CompareLists(Node headA, Node headB) {
        if (null == headA && null == headB)
            return 1;
        if (null == headA || null == headB || headA.data != headB.data)
            return 0;
        return CompareLists(headA.next, headB.next);
    }
}
