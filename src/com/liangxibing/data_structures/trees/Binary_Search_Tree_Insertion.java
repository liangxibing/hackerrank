package com.liangxibing.data_structures.trees;

/**
 * Created by Xibing Liang on 2018/04/17.
 * Problem: https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
 */
public class Binary_Search_Tree_Insertion {

    static class Node {
        int data;
        Node left;
        Node right;
    }

    static Node Insert(Node root,int value) {
        Node ins = new Node();
        ins.data = value;
        ins.left = null;
        ins.right = null;
        if (null == root) {
            return ins;
        }
        if (value < root.data) {
            if (null == root.left)
                root.left = ins;
            else
                Insert(root.left, value);
        }
        else if (value > root.data){
            if (null == root.right)
                root.right = ins;
            else
                Insert(root.right, value);
        }
        return root;
    }
}
