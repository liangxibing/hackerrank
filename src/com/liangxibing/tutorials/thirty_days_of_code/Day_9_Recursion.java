package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/30-recursion
 */
public class Day_9_Recursion {

    private static int factorial(int N) {
        if (1 == N)
            return 1;
        return N * factorial(N - 1);

    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(factorial(N));
        scan.close();
    }
}
