package com.liangxibing.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/28.
 * Problem: https://www.hackerrank.com/challenges/kangaroo
 */
public class Kangaroo {

    /**
     * If they'll ever land at the same location at the same time <=> x1 + k * v1 = x2 + k * v2, k is an positive integer
     * <=> x2 - x1 = k * (v1 - v2)
     * As x2 > x1, so the condition is v1 - v2 > 0 and x2 - x1 can be divided evenly by v1 - v2.
     * @param args Not used
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        in.close();
        int distanceDiff = x2 - x1;
        int rateDiff = v1 - v2;
        String result = "NO";
        if (rateDiff > 0 && 0 == distanceDiff % rateDiff)
            result = "YES";
        System.out.println(result);
    }
}
