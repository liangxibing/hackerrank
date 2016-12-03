package com.liangxibing.tutorials.cracking_the_coding_interview;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by liangxibing on 3/12/16.
 * Problem: https://www.hackerrank.com/challenges/ctci-linked-list-cycle
 */
public class Linked_Lists_Detect_a_Cycle {
    /*
    Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

    A Node is defined as:
        class Node {
            int data;
            Node next;
        }
    */

    /* Fast 'car' goes 2 steps each time and slow 'car' goes 1 step each time;
     * If fast 'car' and slow 'car' meet at some time, then a cycle is detected.
     */
    boolean hasCycle(Linked_Lists_Detect_a_Cycle_Node head) {
        if (null == head) return false;
        Linked_Lists_Detect_a_Cycle_Node fast = head.next;
        Linked_Lists_Detect_a_Cycle_Node slow = head;
        while (fast != null && fast.next != null && slow != null) {
            if (fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}

class Linked_Lists_Detect_a_Cycle_Node {
    int data;
    Linked_Lists_Detect_a_Cycle_Node next;
}
