package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/18.
 * Problem: https://www.hackerrank.com/challenges/s10-weighted-mean
 */
public class Day_0_Weighted_Mean {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] X = new int[N];
        int[] W = new int[N];
        double xSum = 0.0;
        double wSum = 0.0;
        for (int i = 0; i < N; ++i) {
            X[i] = scan.nextInt();
        }
        for (int i = 0; i < N; ++i) {
            W[i] = scan.nextInt();
            xSum += X[i] * W[i];
            wSum += W[i];
        }
        System.out.println(String.format("%.1f", xSum / wSum));
        scan.close();
    }
}
