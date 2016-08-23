package com.liangxibing.algorithms.game_theory;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/tower-breakers-1
 */
public class Tower_Breakers {

    /**
     * Nim game:
     * XOR operation of each element equals to 0, then P2 wins;
     * else, P1 wins.
     * Attention that in this case if M equals to 1 then each tower can't be reduced at the beginning so P2 wins, and
     * as the height is the same for each tower so we only focus on the odevity for N.
     * @param args Not used.
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int N;
        int M;

        for (int i = 0; i < T;++i) {
            N = scan.nextInt();
            M = scan.nextInt();
            System.out.println(0 == N % 2 || 1 == M ? 2 : 1);
        }
        scan.close();
    }
}
