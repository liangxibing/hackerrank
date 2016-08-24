package com.liangxibing.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/24.
 * Problem: https://www.hackerrank.com/challenges/plus-minus
 */
public class Plus_Minus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double positive = 0;
        double negative = 0;
        double zeros = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] > 0)
                ++positive;
            else if (arr[arr_i] < 0)
                ++negative;
            else
                ++zeros;
        }
        in.close();
        System.out.println(String.format("%.6f", positive / n));
        System.out.println(String.format("%.6f", negative / n));
        System.out.println(String.format("%.6f", zeros / n));
    }
}
