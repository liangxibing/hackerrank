package com.liangxibing.data_structures.linked_lists;

/**
 * Created by Xibing Liang on 2018/03/28.
 * Problem: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
 */
public class Print_the_Elements_of_a_Linked_List {
    class Print_the_Elements_of_a_Linked_List_Node{
        int data;
        Print_the_Elements_of_a_Linked_List_Node next;
    }
    void Print(Print_the_Elements_of_a_Linked_List_Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
