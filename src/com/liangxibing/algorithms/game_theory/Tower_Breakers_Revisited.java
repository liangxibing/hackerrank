package com.liangxibing.algorithms.game_theory;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/tower-breakers-revisited-1
 */
public class Tower_Breakers_Revisited {

    /**
     * Found the least prime factor of n, then divide n by this prime factor and loop until n equals to 1.
     * @param n The input number
     * @return How many prime factors the input number includes.
     */
    private static int getNumOfPrimeFactor(int n) {
        if (1 == n)
            return 0;
        if (0 == n % 2) {
            return 1 + getNumOfPrimeFactor(n/2);
        }
        for (int i = 3; i < Math.sqrt(n) + 1;i += 2) {
            if (0 == n % i)
                return 1 + getNumOfPrimeFactor(n/i);
        }
        return 1;
    }

    /**
     * Nim game:
     * XOR operation of each element equals to 0, then P2 wins;
     * else, P1 wins.
     * Attention that in this case the value of each element is the number of prime factor of this element.
     * @param args Not used.
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int N;
        int current;
        int result;

        for (int i = 0; i < T;++i) {
            N =  scan.nextInt();
            result = 0;

            for (int j = 0; j < N; ++j) {
                current = getNumOfPrimeFactor(scan.nextInt());
                result =  result ^ current;
            }
            System.out.println(result == 0 ? 2 : 1);
        }
        scan.close();
    }
}
