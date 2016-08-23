package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/s10-binomial-distribution-1
 */
public class Day_4_Binomial_Distribution_I {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        double bodyRatio = scan.nextDouble();
        double girlRatio = scan.nextDouble();
        double proportion = 1 - (15 * Math.pow(bodyRatio, 2) * Math.pow(girlRatio, 4) / Math.pow(bodyRatio + girlRatio, 6))
                - (6 * bodyRatio * Math.pow(girlRatio, 5) / Math.pow(bodyRatio + girlRatio, 6))
                - (Math.pow(girlRatio, 6) / Math.pow(bodyRatio + girlRatio, 6));
        System.out.println(String.format("%.3f", proportion));
        scan.close();
    }
}
