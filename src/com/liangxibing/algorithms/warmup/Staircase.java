package com.liangxibing.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/24.
 * Problem: https://www.hackerrank.com/challenges/staircase
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1 - i; ++j) {
                System.out.print(" ");
            }
            for (int j = n - 1 - i; j < n; ++j) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
