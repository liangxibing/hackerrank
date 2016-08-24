package com.liangxibing.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/24.
 * Problem: https://www.hackerrank.com/challenges/circular-array-rotation
 */
public class Sherlock_And_Watson {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int Q = scan.nextInt();
        int[] A = new int[N];
        int temp;
        for (int i = 0; i < N; ++i) {
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < Q; ++i) {
            temp = scan.nextInt();
            /* Consider the situation that K is very big and the situation that temp is less than K.
             * Attention that if X is < 0, than X % N < 0.
             */
            System.out.println(A[(N + temp - (K % N)) % N]);
        }
        scan.close();
    }
}
