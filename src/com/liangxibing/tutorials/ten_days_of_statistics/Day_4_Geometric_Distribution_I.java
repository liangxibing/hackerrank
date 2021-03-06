package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/s10-geometric-distribution-1
 */
public class Day_4_Geometric_Distribution_I {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numerator  = scan.nextInt();
        int denominator = scan.nextInt();
        int inspection = scan.nextInt();
        scan.close();
        double probability = ((double)numerator) / denominator;
        double probabilityOfFirstDefectOnInspection = Math.pow(1 - probability, inspection - 1) * probability;
        System.out.println(String.format("%.3f", probabilityOfFirstDefectOnInspection));
    }
}
