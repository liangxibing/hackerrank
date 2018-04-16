package com.liangxibing.data_structures.trees;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Xibing Liang on 2018/04/16.
 * Problem: https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
 */
public class Tree_Level_Order_Traversal {

    class Node {
        int data;
        Node left;
        Node right;
    }

    void levelOrder(Node root) {
        LinkedList<Node> list = new LinkedList<>();
        list.add(root);
        Node cur;
        while (!list.isEmpty()) {
            cur = list.pop();
            if (null == cur)
                continue;
            System.out.print(cur.data + " ");
            list.add(cur.left);
            list.add(cur.right);
        }
    }

}
