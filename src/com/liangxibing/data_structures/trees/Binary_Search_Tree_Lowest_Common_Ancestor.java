package com.liangxibing.data_structures.trees;

/**
 * Created by Xibing Liang on 2018/04/17.
 * Problem: https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem
 */
public class Binary_Search_Tree_Lowest_Common_Ancestor {

    class Node {
        int data;
        Node left;
        Node right;
    }

    /*
     * Only when (root - v1) * (root - v2) < 0, root will be lowest common ancestor
     */
    static Node lca(Node root,int v1,int v2)
    {
        while (root != null) {
            if (root.data < v1 && root.data < v2) {
                root = root.right;
                continue;
            }
            if (root.data > v1 && root.data > v2) {
                root = root.left;
                continue;
            }
            break;
        }
        return root;
    }
}
