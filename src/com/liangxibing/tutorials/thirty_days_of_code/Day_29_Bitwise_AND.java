package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 15/09/16.
 *  Problem: https://www.hackerrank.com/challenges/30-bitwise-and
 */
public class Day_29_Bitwise_AND {

    private static int getMaxBitAnd(int n, int k) {
        int max = 0;
        int temp;
        for (int i = 1; i < n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                temp = i & j;
                if (temp > max && temp < k)
                    max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(getMaxBitAnd(n , k));
        }
        in.close();
    }
}
