package com.liangxibing.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/24.
 * Problem: https://www.hackerrank.com/challenges/solve-me-first
 */
public class Solve_Me_First {


    private static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a + b;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        in.close();
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
