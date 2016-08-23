package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/30-arrays
 */
public class Day_7_Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print(arr[n - 1]);
        for (int i = n - 2; i >= 0; --i) {
            System.out.print(" " + arr[i]);
        }
        in.close();
    }
}
