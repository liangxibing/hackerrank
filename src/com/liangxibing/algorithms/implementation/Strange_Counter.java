package com.liangxibing.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/29.
 * Problem: https://www.hackerrank.com/challenges/strange-code
 */
public class Strange_Counter {

    /**
     * Each column include 3 * (2 ^ i) element (i = 0,1,2,...)
     * Each column time begin with 3 * (2 ^ i - 1) + 1 (i = 0,1,2,...)
     * Firstly we calculate which column is time at
     * Then we calculate the distance between first element in this column and the element we focus
     * Finally we calculate the exact value
     * @param args Not used
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        in.close();
        int index = 1;
        while (true) {
            if (3 * (Math.pow(2, index) - 1) >= t)
                break;
            ++index;
        }
        System.out.println((long)(3 * Math.pow(2, index - 1) - (t - (3 * (Math.pow(2, index - 1) - 1) + 1))));
    }
}
