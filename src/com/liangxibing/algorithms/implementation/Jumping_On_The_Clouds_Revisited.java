package com.liangxibing.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/30.
 * Problem: https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited
 */
public class Jumping_On_The_Clouds_Revisited {

    /**
     * After every movement, position become (position + k) % n, and it takes 1 unit of energy
     * If new position is thundercloud, it takes additional 2 units of energy
     * If energy is <= 0, then game ends
     * If position reach 0 again, then game ends as n % k == 0.
     * @param args Not used
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        in.close();
        int E = 100;
        int position = 0;
        while (true) {
            position = (position + k) % n;
            E -= 1;
            if (1 == c[position])
                E -= 2;
            if (E <= 0) {
                E = 0;
                break;
            }
            if (0 == position)
                break;
        }
        System.out.println(E);
    }
}
