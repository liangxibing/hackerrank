package com.liangxibing.data_structures.trees;

/**
 * Created by Xibing Liang on 2018/04/16.
 * Problem: https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
 */
public class Tree_Preorder_Traversal {

    class Node {
        int data;
        Node left;
        Node right;
    }

    void preOrder(Node root) {
        if (null == root)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

}