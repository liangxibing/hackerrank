package com.liangxibing.data_structures.trees;

/**
 * Created by Xibing Liang on 2018/04/16.
 * Problem: https://www.hackerrank.com/challenges/tree-top-view/problem
 */
public class Tree_Top_View {

    class Node {
        int data;
        Node left;
        Node right;
    }

    void topView(Node root) {
        if (null == root)
            return;
        leftView(root.left);
        System.out.print(root.data + " ");
        rightView(root.right);
    }

    void leftView(Node root) {
        if (null == root)
            return;
        leftView(root.left);
        System.out.print(root.data + " ");
    }

    void rightView(Node root) {
        if (null == root)
            return;
        System.out.print(root.data + " ");
        rightView(root.right);
    }
}
