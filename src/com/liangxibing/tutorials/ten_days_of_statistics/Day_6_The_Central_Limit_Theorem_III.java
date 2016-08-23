package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/s10-the-central-limit-theorem-3
 */
public class Day_6_The_Central_Limit_Theorem_III {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numValues = scan.nextInt();
        double mean = scan.nextDouble();
        double standDeviation = scan.nextDouble();
        double probability = scan.nextDouble();
        double z = scan.nextDouble();
        scan.close();
        double difference = standDeviation * z / Math.sqrt(numValues);
        System.out.println(String.format("%.2f", mean - difference));
        System.out.println(String.format("%.2f", mean + difference));
    }
}
