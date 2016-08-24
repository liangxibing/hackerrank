package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/24.
 * Problem: https://www.hackerrank.com/challenges/s10-spearman-rank-correlation-coefficient
 */
public class Day_7_Spearman_Rank_Correlation_Coefficient {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] X = new double[n];
        double[] Y = new double[n];
        for (int i = 0; i < n; ++i) {
            X[i] = scan.nextDouble();
        }
        for (int i = 0; i < n; ++i) {
            Y[i] = scan.nextDouble();
        }
        scan.close();
        HashMap<Double, Integer> rankX = new HashMap<>();
        HashMap<Double, Integer> rankY = new HashMap<>();
        double[] cloneX = Arrays.copyOf(X, n);
        double[] cloneY = Arrays.copyOf(Y, n);
        Arrays.sort(cloneX);
        Arrays.sort(cloneY);
        for (int i = 0; i < n; ++i) {
            rankX.put(cloneX[i], i + 1);
            rankY.put(cloneY[i], i + 1);
        }
        double sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += Math.pow(rankX.get(X[i]) - rankY.get(Y[i]), 2);
        }
        double sRCC = 1 - (6 * sum / (n * (Math.pow(n ,2) - 1)));
        System.out.println(String.format("%.3f", sRCC));
    }
}
