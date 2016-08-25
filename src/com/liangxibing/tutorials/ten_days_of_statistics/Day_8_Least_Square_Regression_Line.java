package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/25.
 * Problem: https://www.hackerrank.com/challenges/s10-least-square-regression-line
 */
public class Day_8_Least_Square_Regression_Line {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int number = 5;
        double[] X = new double[number];
        double[] Y = new double[number];
        double sumX = 0;
        double sumY = 0;
        double sumSquareX = 0;
        double sumXMultiplyY = 0;
        for (int i = 0; i < number; ++i) {
            X[i] = scan.nextInt();
            Y[i] = scan.nextInt();
            sumX += X[i];
            sumY += Y[i];
            sumSquareX += X[i] * X[i];
            sumXMultiplyY += X[i] * Y[i];
        }
        scan.close();
        double meanX = sumX / number;
        double meanY = sumY / number;
        double b = (number * sumXMultiplyY - sumX * sumY) / (number * sumSquareX - sumX * sumX);
        double a = meanY - b * meanX;
        System.out.println(String.format("%.3f", a + b * 80));
    }
}
