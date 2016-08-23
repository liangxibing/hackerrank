package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/18.
 * Problem: https://www.hackerrank.com/challenges/s10-standard-deviation
 */
public class Day_1_Standard_Deviation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] X = new int[N];
        double sum = 0.0;
        for (int i = 0; i < N; ++i) {
            X[i] = scan.nextInt();
            sum += X[i];
        }
        double mean = sum / N;
        sum = 0.0;
        for (int i = 0; i < N; ++i) {
            sum += Math.pow(X[i] - mean, 2);
        }
        double deviation = Math.sqrt(sum / N);
        System.out.println(String.format("%.1f", deviation));
        scan.close();
    }
}
