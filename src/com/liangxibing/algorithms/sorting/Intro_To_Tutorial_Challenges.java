package com.liangxibing.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/tutorial-intro
 */
public class Intro_To_Tutorial_Challenges {

    /**
     * Find the first element equals to V then print.
     * @param args Not used.
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();
        int n = scan.nextInt();
        int result = -1;
        int temp;
        for (int i = 0; i < n; ++i) {
            temp = scan.nextInt();
            if (temp == V) {
                result = i;
                break;
            }
        }
        scan.close();
        System.out.println(result);
    }
}
