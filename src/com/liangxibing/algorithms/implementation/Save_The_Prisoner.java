package com.liangxibing.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/29.
 * Problem: https://www.hackerrank.com/challenges/save-the-prisoner
 */
public class Save_The_Prisoner {

    /**
     * Basically S + M -1 th prisoner will receive the M th sweet.
     * Attention the situation S + M - 1 > N and the situation S + M - 1 = N exactly
     * @param args Not used
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int N;
        int M;
        int S;
        for (int i = 0; i < T; ++i) {
            N = scan.nextInt();
            M = scan.nextInt();
            S = scan.nextInt();
            System.out.println(0 == (S + M - 1) % N ? N : (S + M - 1) % N);
        }
        scan.close();
    }
}
