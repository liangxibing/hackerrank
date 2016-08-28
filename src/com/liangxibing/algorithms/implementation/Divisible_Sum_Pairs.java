package com.liangxibing.algorithms.implementation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by liangxibing on 2016/8/28.
 * Problem: https://www.hackerrank.com/challenges/divisible-sum-pairs
 */
public class Divisible_Sum_Pairs {

    /**
     * To find the number of each reminder divided by k, e.g. reminder 0 by k, reminder 1 by k, ... reminder k - 1 by k,
     * because a + b can be divided evenly by k <=> a % k = m && b % k = k - m.
     * Attention the situation that reminder 0 by k and k % 2 == 0
     * @param args Not used
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] reminderArray = new int[k];
        int result = 0;
        for(int i = 0; i < n; ++i){
            ++reminderArray[in.nextInt() % k];
        }
        result += reminderArray[0] * (reminderArray[0] - 1) / 2;
        if (0 == k % 2)
            result += reminderArray[k / 2] * (reminderArray[k / 2] - 1) / 2;
        for (int i = 1; i <= (k - 1) / 2; ++i) {
            result += reminderArray[i] * reminderArray[k - i];
        }
        System.out.println(result);
    }
}
