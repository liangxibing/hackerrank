package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/9/3.
 * Problem: https://www.hackerrank.com/challenges/30-linked-list-deletion
 */
class Day_24_Node{
    int data;
    Day_24_Node next;
    Day_24_Node(int d){
        data=d;
        next=null;
    }

}
public class Day_24_More_Linked_Lists {

    private static Day_24_Node removeDuplicates(Day_24_Node head) {
        //Write your code here
        if (null == head)
            return null;
        Day_24_Node node = head;
        while (null != node.next) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
                continue;
            }
            node = node.next;
        }
        return head;
    }
    private static  Day_24_Node insert(Day_24_Node head, int data)
    {
        Day_24_Node p=new Day_24_Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Day_24_Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    private static void display(Day_24_Node head)
    {
        Day_24_Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Day_24_Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
