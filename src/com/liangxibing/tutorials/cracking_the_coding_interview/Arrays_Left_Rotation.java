package com.liangxibing.tutorials.cracking_the_coding_interview;

import java.util.Scanner;

/**
 * Created by liangxibing on 2/12/16.
 * Problem: https://www.hackerrank.com/challenges/ctci-array-left-rotation
 */

public class Arrays_Left_Rotation {

    private static int[] arrayLeftRotation(int[] a, int n, int k) {
        int[] result = new int[n];
        for (int i = 0; i < n; ++i)
            result[i] = a[(i + k) % n];
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}