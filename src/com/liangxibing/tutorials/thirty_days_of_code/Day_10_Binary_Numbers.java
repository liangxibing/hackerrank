package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/30-binary-numbers
 */
public class Day_10_Binary_Numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int current = 0;
        while (n > 0) {
            if (0 == n % 2)
                current = 0;
            else
                ++current;
            if (current > max)
                max = current;
            n /= 2;
        }
        System.out.println(max);
        in.close();
    }
}
