package com.liangxibing.data_structures.trees;

/**
 * Created by Xibing Liang on 2018/04/16.
 * Problem: https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
 */
public class Tree_Postorder_Traversal {

    class Node {
        int data;
        Node left;
        Node right;
    }

    void postOrder(Node root) {
        if (null == root)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
