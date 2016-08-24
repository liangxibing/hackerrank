package com.liangxibing.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/24.
 * Problem: https://www.hackerrank.com/challenges/diagonal-difference
 */
public class Diagonal_Difference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; ++i) {
            sum1 += a[i][i];
            sum2 += a[n - 1 - i][i];
        }
        System.out.println(Math.abs(sum1 - sum2));
    }
}
