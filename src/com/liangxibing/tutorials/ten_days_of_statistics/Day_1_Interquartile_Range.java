package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/18.
 * Problem: https://www.hackerrank.com/challenges/s10-interquartile-range
 */
public class Day_1_Interquartile_Range {

    public static double getMedian(ArrayList<Integer> array, int low, int high) {
        if (0 == (high - low) % 2)
            return (double)array.get((high + low) / 2);
        return ((double)array.get((high + low - 1) / 2) + (double)array.get((high + low + 1) / 2)) / 2;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sumOfF = 0;
        int[] X = new int[N];
        int[] F = new int[N];
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        for (int i = 0; i < N; ++i) {
            X[i] = scan.nextInt();
        }
        for (int i = 0; i < N; ++i) {
            F[i] = scan.nextInt();
            for (int j = 0; j < F[i]; ++j) {
                array.add(X[i]);
            }
        }
        Collections.sort(array);
        double median = getMedian(array, 0, array.size() - 1);
        for (int i = 0; i < array.size(); ++i) {
            if (array.get(i) < median)
                array1.add(array.get(i));
            if (array.get(i) > median)
                array3.add(array.get(i));
        }

        double Q1 = getMedian(array1, 0, array1.size() - 1);
        double Q3 = getMedian(array3, 0, array3.size() - 1);
        System.out.println(String.format("%.1f", Q3 - Q1));
        scan.close();
    }
}