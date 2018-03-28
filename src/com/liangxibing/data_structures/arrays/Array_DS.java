package com.liangxibing.data_structures.arrays;

import java.util.Scanner;

/**
 * Created by Xibing Liang on 2018/03/22.
 * Problem: https://www.hackerrank.com/challenges/arrays-ds/problem
 */
public class Array_DS {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        System.out.print(arr[n - 1]);
        for (int arrItr = 1; arrItr < n; arrItr++) {
            System.out.print(" " + arr[n - 1 - arrItr]);
        }
    }
}
