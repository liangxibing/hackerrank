package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/24.
 * Problem: https://www.hackerrank.com/challenges/s10-pearson-correlation-coefficient
 */
public class Day_7_Pearson_Correlation_Coefficient_I {

    private static double getMean(double[] array) {
        double sum = 0;
        int length = array.length;
        for (double anArray : array) {
            sum += anArray;
        }
        return sum / length;
    }

    private static double getStandardDeviation(double[] array) {
        double sum = 0;
        double mean = getMean(array);
        int length = array.length;
        for (double anArray : array) {
            sum += Math.pow(anArray - mean, 2);
        }
        return Math.sqrt(sum / length);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] X = new double[n];
        double[] Y = new double[n];
        for (int i = 0; i < n; ++i) {
            X[i] = scan.nextDouble();
        }
        for (int i = 0; i < n; ++i) {
            Y[i] = scan.nextDouble();
        }
        scan.close();
        double meanX = getMean(X);
        double meanY = getMean(Y);
        double standardDeviationX = getStandardDeviation(X);
        double standardDeviationY = getStandardDeviation(Y);
        double sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += (X[i] - meanX) * (Y[i] - meanY);
        }
        double pCC = sum / (n * standardDeviationX * standardDeviationY);
        System.out.println(String.format("%.3f", pCC));
    }
}
