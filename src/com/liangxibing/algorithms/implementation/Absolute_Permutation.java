package com.liangxibing.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/30.
 * Problem: https://www.hackerrank.com/challenges/absolute-permutation
 */
public class Absolute_Permutation {

    /**
     * If k = 0 just print 1, 2, ..., n
     * Else if 0 == n % 2k, for each 2k group, first k elements plus k, next k elements minus k
     * Else print -1
     * @param args Not used
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            if (0 == k) {
                for (int i = 1; i <= n; ++i)
                    System.out.print(i + " ");
                System.out.print("\n");
            }
            else if (0 == n % (2 * k)) {
                for (int i = 1; i < n; i += 2 * k)
                {
                    for (int j = i; j < i + k; ++j) {
                        System.out.print(j + k);
                    }
                    for (int j = i + k; j < i + 2 * k; ++j) {
                        System.out.print(j - k);
                    }
                }
                System.out.print("\n");
            }
            else
                System.out.println(-1);
        }
        in.close();
    }
}
