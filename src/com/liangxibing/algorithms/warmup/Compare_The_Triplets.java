package com.liangxibing.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/24.
 * Problem: https://www.hackerrank.com/challenges/compare-the-triplets
 */
public class Compare_The_Triplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        in.close();
        int pointA = 0;
        int pointB = 0;
        if (a0 - b0 > 0)
            ++pointA;
        if (a0 - b0 < 0)
            ++pointB;
        if (a1 - b1 > 0)
            ++pointA;
        if (a1 - b1 < 0)
            ++pointB;
        if (a2 - b2 > 0)
            ++pointA;
        if (a2 - b2 < 0)
            ++pointB;
        System.out.println(pointA + " " + pointB);
    }
}
