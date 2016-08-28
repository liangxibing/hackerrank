package com.liangxibing.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/28.
 * Problem: https://www.hackerrank.com/challenges/cut-the-sticks
 */
public class Cut_The_Sticks {

    /**
     * First sort the array, then from the 0 th to n - 1 th element, the length we cut every time is the difference
     * between current and previous element if their length are different. Of course, for the 0th element, previous
     * element's length is 0.
     * @param args Not used
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        int previous = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i] > previous) {
                System.out.println(n - i);
                previous = arr[i];
            }
        }
    }
}
