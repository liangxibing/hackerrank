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
    private static final int MIN_VALUE = -1;
    private static final int MAX_VALUE = 10001;

    boolean checkBST(Trees_Is_This_a_Binary_Search_Tree_Node root) {
        // if root is null then return true
        if (null == root)
            return true;
        // check left/right node of root
        return check(root.left, MIN_VALUE, root.data) && check(root.right, root.data, MAX_VALUE);
    }

    private boolean check(Trees_Is_This_a_Binary_Search_Tree_Node node, int min, int max) {
        // if node is null then return true
        if (null == node)
            return true;
        // check node is between min and max
        if (node.data <= min || node.data >= max)
            return false;
        boolean checkLeft = true;
        boolean checkRight = true;
        // if left node is not null then check left node between min and node recursively
        if (null != node.left) {
            checkLeft = check(node.left, min, node.data);
        }
        // if right node is not null then check right node between node and max recursively
        if (null != node.right) {
            checkRight = check(node.right, node.data, max);
        }
        // if check result of left and right are both true then return true
        return checkLeft && checkRight;
    }

}

class Trees_Is_This_a_Binary_Search_Tree_Node {
    int data;
    Trees_Is_This_a_Binary_Search_Tree_Node left;
    Trees_Is_This_a_Binary_Search_Tree_Node right;
}
