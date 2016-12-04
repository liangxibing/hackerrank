package com.liangxibing.tutorials.cracking_the_coding_interview;

/**
 * Created by liangxibing on 4/12/16.
 * Problem: https://www.hackerrank.com/challenges/ctci-is-binary-search-tree
 */
public class Trees_Is_This_a_Binary_Search_Tree {
    /* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
    */

    boolean checkBST(Trees_Is_This_a_Binary_Search_Tree_Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkBST(Trees_Is_This_a_Binary_Search_Tree_Node node, int min, int max) {
        // if node is null then return true
        if (null == node)
            return true;
        // check node is between min and max
        if (node.data < min || node.data > max)
            return false;
        // check the left/right node recursively
        return checkBST(node.left, min, node.data - 1) && checkBST(node.right, node.data + 1, max);
    }

}

class Trees_Is_This_a_Binary_Search_Tree_Node {
    int data;
    Trees_Is_This_a_Binary_Search_Tree_Node left;
    Trees_Is_This_a_Binary_Search_Tree_Node right;
}
