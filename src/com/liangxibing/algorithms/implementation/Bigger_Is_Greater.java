package com.liangxibing.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/29.
 * Problem: https://www.hackerrank.com/challenges/bigger-is-greater
 */
public class Bigger_Is_Greater {

    /**
     * Find the least value that are greater than value in index from index + 1 to end.
     * @param ch_arr The origin array
     * @param index The compare index
     */
    private static void swapWithSmallestBigger(char[] ch_arr, int index) {
        char temp;
        int position = -1;
        for (int i = index + 1; i < ch_arr.length; ++i) {
            if (ch_arr[i] > ch_arr[index]) {
                if (-1 == position)
                    position = i;
                else
                    position = ch_arr[i] <= ch_arr[position] ? i : position;
            }
        }
        temp = ch_arr[position];
        ch_arr[position] = ch_arr[index];
        ch_arr[index] = temp;
    }

    /**
     *
     * @param ch_arr The origin array
     * @return The smallest permutation that are greater than original
     */
    private static char[] findSmallestBigger(char[] ch_arr) {
        int length = ch_arr.length;
        char previous = '\0';
        for (int i = length - 1; i >= 0; --i) {
            if (ch_arr[i] < previous) {
                swapWithSmallestBigger(ch_arr, i);
                Arrays.sort(ch_arr, i + 1, length);
                return ch_arr;
            }
            previous = ch_arr[i];
        }
        return "no answer".toCharArray();
    }

    /**
     * Basic algorithm:
     * 0. Initial sequence                                                          0 1 2 5 3 3 0
     *
     * 1. Find the longest non-increasing suffix                                    0 1 2 5 3 3 0
     *                                                                                    ^ ^ ^ ^
     * 2. Identify pivot                                                            0 1 2 5 3 3 0
     *                                                                                  ^
     * 3. Find rightmost successor to pivot in the suffix                           0 1 2 5 3 3 0
     *                                                                                        ^
     * 4. Swap the pivot                                                            0 1 3 5 3 2 0
     *                                                                                  ^     ^
     * 5. Reverse the suffix                                                        0 1 3 0 2 3 5
     *
     * 6. Done                                                                      0 1 3 0 2 3 5
     * @param args Not used
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; ++i) {
            System.out.println(findSmallestBigger(scan.next().toCharArray()));
        }
        scan.close();
    }
}
