package com.liangxibing.data_structures.trees;

/**
 * Created by Xibing Liang on 2018/04/16.
 * Problem: https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 */
public class Tree_Height_of_a_Binary_Tree {

    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static int height(Node root) {
        if (null == root || (null == root.left && null == root.right))
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
