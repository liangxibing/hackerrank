package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/22.
 * Problem: https://www.hackerrank.com/challenges/s10-poisson-distribution-1
 */
public class Day_5_Poisson_Distribution_I {

    private static int factorial(int k) {
        if (1 == k)
            return 1;
        return k * factorial(k - 1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        double mean = scan.nextDouble();
        int k = scan.nextInt();
        scan.close();
        double probability = Math.pow(mean, k) * Math.pow(Math.E, -mean) / factorial(k);
        System.out.println(String.format("%.3f", probability));
    }
}
