package com.liangxibing.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/28.
 * Problem: https://www.hackerrank.com/challenges/kangaroo
 */
public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int distanceDiff = x2 - x1;
        int rateDiff = v1 - v2;
        String result = "NO";
        if (rateDiff > 0 && 0 == distanceDiff % rateDiff)
            result = "YES";
        System.out.println(result);
    }
}
