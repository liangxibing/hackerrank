package com.liangxibing.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/30.
 * Problem: https://www.hackerrank.com/challenges/flatland-space-stations
 */
public class Flatland_Space_Stations {

    /**
     * Firstly sort the cities with the stations.
     * Then calculate the max difference between two.
     * Finally check for the first city and the last city in the chain i.e. leading and trailing conditions.
     * @param args Not used
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        int distanceToCurrent;
        int maxDistance = 0;
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        in.close();
        Arrays.sort(c);
        for (int i = 1; i < m; ++i) {
            distanceToCurrent = (c[i] - c[i - 1]) / 2;
            if (distanceToCurrent > maxDistance)
                maxDistance = distanceToCurrent;
        }
        if (maxDistance < c[0])
            maxDistance = c[0];
        if (maxDistance < n - 1 - c[m - 1])
            maxDistance = n - 1 - c[m - 1];
        System.out.println(maxDistance);
    }
}
