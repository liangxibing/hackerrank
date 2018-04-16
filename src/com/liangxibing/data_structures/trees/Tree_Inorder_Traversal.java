package com.liangxibing.data_structures.trees;

/**
 * Created by Xibing Liang on 2018/04/16.
 * Problem: https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
 */
public class Tree_Inorder_Traversal {

    class Node {
        int data;
        Node left;
        Node right;
    }

    void inOrder(Node root) {
        if (null == root)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}
