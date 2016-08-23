package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/22.
 * Problem: https://www.hackerrank.com/challenges/s10-normal-distribution-2
 */
public class Day_5_Normal_Distribution_II {

    public static double erf(double x) {
        // constants
        final double a1 =  0.254829592;
        final double a2 = -0.284496736;
        final double a3 =  1.421413741;
        final double a4 = -1.453152027;
        final double a5 =  1.061405429;
        final double p  =  0.3275911;

        // Save the sign of x
        double sign = 1;
        if (x < 0) {
            sign = -1;
        }
        x = Math.abs(x);

        // A&S formula 7.1.26
        double t = 1.0/(1.0 + p*x);
        double y = 1.0 - (((((a5*t + a4)*t) + a3)*t + a2)*t + a1)*t*Math.exp(-x*x);

        return sign*y;
    }

    public static double P(double x, double mean, double standardDeviation) {
        return (1 + erf((x - mean) / (standardDeviation * Math.sqrt(2)))) / 2.0;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        double mean = scan.nextDouble();
        double standardDeviation = scan.nextDouble();
        double higherThan = scan.nextDouble();
        double threshold = scan.nextDouble();
        scan.close();
        System.out.println(String.format("%.2f", 100 * (1 - P(higherThan, mean, standardDeviation))));
        System.out.println(String.format("%.2f", 100 * (1 - P(threshold, mean, standardDeviation))));
        System.out.println(String.format("%.2f", 100 * P(threshold, mean, standardDeviation)));
    }
}
