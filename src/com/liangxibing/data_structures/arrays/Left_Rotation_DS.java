package com.liangxibing.data_structures.arrays;

import java.util.Scanner;

/**
 * Created by Xibing Liang on 2018/03/27.
 * Problem: https://www.hackerrank.com/challenges/array-left-rotation/problem
 */
public class Left_Rotation_DS {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scan.nextLine().split(" ");

        int n = Integer.parseInt(nd[0].trim());

        int d = Integer.parseInt(nd[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        for (int aItr = 0; aItr < n - 1; aItr++) {
            System.out.print(a[(aItr + d) % n] + " ");
        }
        System.out.print(a[(n - 1 + d) % n]);
    }
}
