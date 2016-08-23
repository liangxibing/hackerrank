package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/s10-poisson-distribution-2
 */
public class Day_5_Poisson_Distribution_II {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        double meanA = scan.nextDouble();
        double meanB = scan.nextDouble();
        scan.close();
        double COfA = 160 + 40 * (meanA + Math.pow(meanA, 2));
        double COfB = 128 + 40 * (meanB + Math.pow(meanB, 2));
        System.out.println(String.format("%.3f", COfA));
        System.out.println(String.format("%.3f", COfB));
    }
}
