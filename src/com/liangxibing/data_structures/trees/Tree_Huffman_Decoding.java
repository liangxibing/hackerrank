package com.liangxibing.data_structures.trees;

/**
 * Created by Xibing Liang on 2018/04/17.
 * Problem: https://www.hackerrank.com/challenges/tree-huffman-decoding/problem
 */
public class Tree_Huffman_Decoding {

    class Node {
        public int frequency; // the frequency of this tree
        public char data;
        public Node left, right;
    }

    void decode(String S ,Node root) {
        Node cur = root;
        for (char s : S.toCharArray()) {
            if ('0' == s)
                cur = cur.left;
            else if ('1' == s)
                cur = cur.right;
            if (null == cur.left && null == cur.right) {
                System.out.print(cur.data);
                cur = root;
            }
        }
    }
}
