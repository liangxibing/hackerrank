package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/9/5.
 * Problem: https://www.hackerrank.com/challenges/30-nested-logic
 */
public class Day_26_Nested_Logic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int day_actually = scan.nextInt();
        int month_actually = scan.nextInt();
        int year_actually = scan.nextInt();
        int day_expected = scan.nextInt();
        int month_expected = scan.nextInt();
        int year_expected = scan.nextInt();
        scan.close();
        int fine = 0;
        if (year_actually > year_expected)
            fine = 10000;
        else if (year_actually == year_expected) {
            if (month_actually > month_expected)
                fine = 500 * (month_actually - month_expected);
            else if (month_actually == month_expected) {
                if (day_actually > day_expected)
                    fine = 15 * (day_actually - day_expected);
            }
        }
        System.out.println(fine);
    }
}
