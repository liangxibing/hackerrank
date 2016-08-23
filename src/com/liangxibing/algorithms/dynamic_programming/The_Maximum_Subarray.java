package com.liangxibing.algorithms.dynamic_programming;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/maxsubarray
 */
public class The_Maximum_Subarray {

    /**
     * Kadane's Algorithm:
     *
     * Initialize:
     *     max_so_far = 0
     *     max_ending_here = 0
     *
     * Loop for each element of the array
     *     (a) max_ending_here = max_ending_here + a[i]
     *     (b) if(max_ending_here < 0)
     *         max_ending_here = 0
     *     (c) if(max_so_far < max_ending_here)
     *         max_so_far = max_ending_here
     * return max_so_far
     *
     * Below function has done some improvements which consider the case when all numbers in array are negative.
     * @param array the source array
     * @return the maximum sum of contiguous sub-array
     */
    private static int maxContiguousSum(int[] array) {
        int max_so_far = array[0];
        int max_ending_here = array[0];
        for (int i = 1; i < array.length; ++i) {
            max_ending_here = Math.max(array[i], max_ending_here + array[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

    /**
     * For the case there is at least one positive number in the array plus all positive numbers and return sum;
     * For the case all numbers in array are negative select the largest one and return its value.
     * @param i the current index
     * @param array the source array
     * @return the maximum sum of non-contiguous sub-array
     */
    private static int maxNonContiguousSum(int i, int[] array) {
        if (0 >= i)
            return array[i];
        int temp = array[i];
        int previous = maxNonContiguousSum(i - 1, array);
        if (previous >= 0 && temp >= 0)
            return temp + previous;
        else if (previous >= 0 && temp < 0)
            return previous;
        else if (previous < 0 && temp >= 0)
            return temp;
        return Math.max(temp, previous);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int N;
        int[] A;
        for (int i = 0; i < T; ++i) {
            N = scan.nextInt();
            A = new int[N];
            for (int j = 0; j < N; ++j) {
                A[j] = scan.nextInt();
            }
            System.out.print(maxContiguousSum(A) + " " + maxNonContiguousSum(N - 1, A) + "\n");
        }
        scan.close();
    }
}
