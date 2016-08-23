package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/30-review-loop
 */
public class Day_6_Let_us_Review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine());
        String temp;
        int length;
        for (int i = 0; i < T; ++i) {
            temp = scan.nextLine();
            length = temp.length();
            for (int j = 0; j < length; j += 2) {
                System.out.print(temp.charAt(j));
            }
            System.out.print(" ");
            for (int j = 1; j < length; j += 2) {
                System.out.print(temp.charAt(j));
            }
            System.out.print("\n");
        }
    }
}
