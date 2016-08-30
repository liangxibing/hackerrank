package com.liangxibing.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/30.
 * Problem: https://www.hackerrank.com/challenges/lisa-workbook
 */
public class Lisa_Workbook {

    /**
     * For each chapter, loop page by page.
     * Calculate the begin problem's index and end problem's index in each page, then judge whether current page number
     * is between them
     * @param args Not used
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; ++i) {
            t[i] = scan.nextInt();
        }
        scan.close();
        int count = 0;
        int begin;
        int end;
        int currentPage = 1;
        for (int i = 0; i < n; ++i) {
            int j;
            for (j = 1; j <= ((t[i] - 1) / k) + 1; ++j) {
                begin = (j - 1) * k + 1;
                end = j * k < t[i] ? j * k : t[i];
                if (currentPage >= begin && currentPage <= end)
                    ++count;
                ++currentPage;
            }
        }
        System.out.println(count);
    }
}
