package com.liangxibing.algorithms.implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/30.
 * Problem: https://www.hackerrank.com/challenges/new-year-chaos
 */
public class New_Year_Chaos {

    /**
     * Just like bubble sort, we swap the adjacent elements in descending order and count bribe times for larger element
     * If we can sort the array and keep each element's bribe time <= 2, it means a valid state, else it is invalid
     * @param array The array that store the n elements
     * @return The number of total bribe times or -1 if the state is invalid
     */
    private static int countBribes(int[] array) {
        int totalBribes = 0;
        int numberOfBribes;
        int length = array.length;
        Integer currentBribeNum;
        int temp;
        HashMap<Integer, Integer> bribes = new HashMap<>();
        for (int i = 0; i < length; ++i) {
            numberOfBribes = 0;
            for (int j = 0; j < length - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    // get how many bribes index j already have
                    currentBribeNum = bribes.get(array[j]);
                    if (null != currentBribeNum) {
                        // index j already has 2 bribes so it can't bribe any more
                        if (currentBribeNum >= 2)
                            return -1;
                        // increase the bribe times for element for the index j
                        else
                            bribes.put(array[j], currentBribeNum + 1);
                    }
                    // index j didn't have bribes, now bribe for the first time
                    else
                        bribes.put(array[j], 1);
                    // swap index j and j + 1 in array
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    ++numberOfBribes;
                    ++totalBribes;
                }
            }
            if (0 == numberOfBribes)
                break;
        }
        return totalBribes;
    }

    /**
     * If countBribes return -1, then it means can't reach the situation, else print the total number of bribes
     * @param args Not used
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int count;
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int q[] = new int[n];
            for(int q_i=0; q_i < n; q_i++){
                q[q_i] = in.nextInt();
            }
            // your code goes here
            count = countBribes(q);
            System.out.println(-1 == count ? "Too chaotic" : count);
        }
    }
}
