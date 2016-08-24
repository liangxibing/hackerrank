package com.liangxibing.algorithms.bit_manipulation;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/24.
 * Problem: https://www.hackerrank.com/challenges/cipher
 */
public class Cipher {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        char[] charForS = scan.next().toCharArray();
        scan.close();
        char[] B = new char[N];
        int previous = 0;
        int current;
        int temp;
        for (int i  = 0; i < N; i++)
        {
            temp = i < K ? 0 : Character.getNumericValue(B[i - K]);
            current = Character.getNumericValue(charForS[i]);
            B[i] = (char)(current ^ previous ^ temp + '0');
            previous = current;
        }
        System.out.println(B);
    }
}
