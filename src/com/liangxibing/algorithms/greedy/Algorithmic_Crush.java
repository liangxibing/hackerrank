package com.liangxibing.algorithms.greedy;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/crush
 */
public class Algorithmic_Crush {

    /**
     * Add k from a to b can be understood as: add 0 from index 0 to index a - 1(they are equal to previous index),
     * add k to index a(index a is k bigger than previous index), add 0 from a + 1 to b(they are equal to previous
     * index), minus k to b + 1 (index b + 1 is k less than previous index), add 0 from index b + 2 to N(they are equal
     * to previous index). This new array is called as resultArray.
     * After M times' operation, we find the most sum from 0 to i(i = 0, 1, ... , N) for resultArray, and the value
     * means the max value in original array: sum of resultArray[0] to resultArray[i] equals to originArray[i].
     * @param args Not used.
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int a;
        int b;
        int k;
        long result = 0;
        long max = 0;
        long[] resultArray = new long[N + 1];

        for (int i = 0; i < M; ++i) {
            a = scan.nextInt();
            b = scan.nextInt();
            k = scan.nextInt();
            resultArray[a] += k;
            if (b < N)
                resultArray[b + 1] -= k;
        }
        for (int i = 1; i <= N; ++i) {
            result += resultArray[i];
            if (result > max)
                max = result;
        }
        scan.close();
        System.out.println(max);
    }
}
