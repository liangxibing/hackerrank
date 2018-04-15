package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/04/09.
 * Problem: https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem
 */
public class Find_Merge_Point_of_Two_Lists {

    class Node {
        int data;
        Node next;
    }

    /*
     * [List #1] a--->b--->c--->d--->e
     *                                \
     *                                 x--->y--->z--->NULL
     *                                /
     * [List #2]                p--->q
     *
     * (distance of a to z) + (distance of p to x) = (distance of p to z) + (distance of a to x)
     * so we will switch the head after finish each path,
     * then they will meet at the first merge point
     */
    int FindMergeNode(Node headA, Node headB) {
        Node curA = headA;
        Node curB = headB;
        while (curA != curB) {
            if (curA.next == null)
                curA = headB;
            else
                curA = curA.next;

            if (curB.next == null)
                curB = headA;
            else
                curB = curB.next;
        }
        return curA.data;
    }
}
