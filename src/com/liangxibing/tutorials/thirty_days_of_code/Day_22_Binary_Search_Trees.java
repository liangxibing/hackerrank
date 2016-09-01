package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/9/1.
 * Problem: https://www.hackerrank.com/challenges/30-binary-search-trees
 */
class Day_22_Node{
    Day_22_Node left,right;
    int data;
    Day_22_Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class Day_22_Binary_Search_Trees {

    private static int getHeight(Day_22_Node root){
        //Write your code here
        if (null == root)
            return 0;
        if (null == root.left && null == root.right)
            return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
    private static Day_22_Node insert(Day_22_Node root, int data){
        if(root==null){
            return new Day_22_Node(data);
        }
        else{
            Day_22_Node cur;
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
        Day_22_Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        //noinspection SuspiciousNameCombination
        System.out.println(height);
    }
}
