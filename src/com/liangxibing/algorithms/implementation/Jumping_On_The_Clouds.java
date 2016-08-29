package com.liangxibing.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/29.
 * Problem: https://www.hackerrank.com/challenges/jumping-on-the-clouds
 */
public class Jumping_On_The_Clouds {

    /**
     * If there is 1 or 2 differences between start and end, and we always need 1 step;
     * If end - 2 is ordinary cloud, we can jump into end - 2 then reach end;
     * If end - 2 is thundercloud, we can jump into end - 1 then reach end;
     * @param start The begin position to jump
     * @param end The destination position to jump
     * @param array The array stores the information whether the cloud is ordinary cloud or thundercloud
     * @return The steps jump from start position to end position
     */
    private static int jump(int start, int end, int[] array) {
        if (end <= start + 2)
            return 1;
        if (0 == array[end - 2])
            return 1 + jump(start, end - 2, array);
        return 1 + jump(start, end - 1, array);
    }

    /**
     * Call jump function and return the number of steps
     * @param args Not used
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        in.close();
        System.out.println(jump(0, n - 1, c));
    }
}
