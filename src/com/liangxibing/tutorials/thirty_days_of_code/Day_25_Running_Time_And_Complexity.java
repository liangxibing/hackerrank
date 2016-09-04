package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/9/4.
 * Problem: https://www.hackerrank.com/challenges/30-running-time-and-complexity
 */
public class Day_25_Running_Time_And_Complexity {

    private static boolean isPrime(int n) {
        if (1 == n)
            return false;
        if (2 == n || 3 == n || 5 == n || 7 == n)
            return true;
        if (0 == n % 2)
            return false;
        for (int j = 3; j < Math.sqrt(n) + 1; j += 2) {
            if (0 == n % j) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int n;
        for (int i = 0; i < T; ++i) {
            n = scan.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
        scan.close();
    }
}
