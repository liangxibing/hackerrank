package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/s10-binomial-distribution-2
 */
public class Day_4_Binomial_Distribution_II {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int ratio = scan.nextInt();
        int size = scan.nextInt();
        scan.close();
        int combination_2 = size * (size - 1) / 2;
        int combination_0 = 1;
        double percentage_bad = ((double)ratio) / 100;
        double percentage_good = 1 - percentage_bad;
        double probabilityNoMoreThanTwoRejects = (combination_0 * Math.pow(percentage_good, size))
                + (size * percentage_bad * Math.pow(percentage_good, size - 1))
                + (combination_2 * Math.pow(percentage_bad, 2) * Math.pow(percentage_good, size - 2));
        double probabilityAtLeastTwoRejects = 1
                - (combination_0 * Math.pow(percentage_good, size))
                - (size * percentage_bad * Math.pow(percentage_good, size - 1));
        System.out.println(String.format("%.3f", probabilityNoMoreThanTwoRejects));
        System.out.println(String.format("%.3f", probabilityAtLeastTwoRejects));
    }
}
