package com.liangxibing.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/28.
 * Problem: https://www.hackerrank.com/challenges/angry-professor
 */
public class Angry_Professor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            int inTime = 0;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if (a[a_i] <= 0) ++inTime;
            }
            in.close();
            System.out.println(inTime < k ? "YES" : "NO");
        }
    }
}
