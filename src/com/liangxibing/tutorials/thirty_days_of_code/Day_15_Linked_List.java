package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/25.
 * Problem: https://www.hackerrank.com/challenges/30-linked-list
 */
class Day_15_Node {
    int data;
    Day_15_Node next;
    Day_15_Node(int d) {
        data = d;
        next = null;
    }
}
public class Day_15_Linked_List {

    private static  Day_15_Node insert(Day_15_Node head, int data) {
        //Complete this method
        if (null == head) {
            head = new Day_15_Node(data);
        }
        else {
            Day_15_Node node = head;
            while (null != node.next)
                node = node.next;
            node.next = new Day_15_Node(data);
        }
        return head;
    }

    private static void display(Day_15_Node head) {
        Day_15_Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Day_15_Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
