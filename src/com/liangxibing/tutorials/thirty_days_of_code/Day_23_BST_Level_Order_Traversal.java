package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by liangxibing on 2016/9/2.
 * Problem: https://www.hackerrank.com/challenges/30-binary-trees
 */
class Day_23_Node{
    Day_23_Node left,right;
    int data;
    Day_23_Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class Day_23_BST_Level_Order_Traversal {

    private static void levelOrder(Day_23_Node root){
        //Write your code here
        Queue<Day_23_Node> bfsQueue = new LinkedList<>();
        if (null == root)
            return;
        bfsQueue.offer(root);
        Day_23_Node node;
        while (!bfsQueue.isEmpty()) {
            node = bfsQueue.poll();
            System.out.print(node.data + " ");
            if (null != node.left)
                bfsQueue.offer(node.left);
            if (null != node.right)
                bfsQueue.offer(node.right);
        }
    }
    private static Day_23_Node insert(Day_23_Node root, int data){
        if(root==null){
            return new Day_23_Node(data);
        }
        else{
            Day_23_Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Day_23_Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
