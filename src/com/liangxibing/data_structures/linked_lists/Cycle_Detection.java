package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/04/09.
 * Problem: https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
 */
public class Cycle_Detection {

    class Node {
        int data;
        Node next;
    }

    boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}
