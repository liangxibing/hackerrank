package com.liangxibing.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/non-divisible-subset
 */
public class Non_Divisible_Subset {

    /**
     * Firstly we scan the array and find the number of each remainder for k, e.g. how many numbers in array remainder
     * 0 after dividing by k, how many numbers in array remainder 1 after dividing by k, ... , how many numbers in
     * array remainder k - 1 after dividing by k. These information store in remainderArray.
     * Then find the larger remainderArray[i] for each pair in remainderArray: (0), (1, k - 1), (2, k - 2), ...,
     * ([k / 2], k - [k / 2])
     * Plus the value in previous step then return. Attention that we can at most count 1 for remainderArray[0] because
     * 0 + 0 = 0 (remainder 0 by k), and if k % 2 == 0 then we can at most count 1 for pair ([k / 2], k - [k / 2])
     * because (k / 2) + (k / 2) = k (remainder 0 by k)
     * @param args Not used
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] remainderArray = new int[k];
        int temp;
        for (int i = 0; i < n; ++i) {
            temp = scan.nextInt();
            ++remainderArray[temp % k];
        }
        scan.close();
        int result = remainderArray[0] > 0 ? 1 : 0;
        for (int i = 1; i <= k / 2; ++i) {
            if (2 * i == k)
                result += remainderArray[i] > 0 ? 1 : 0;
            else
                result += Math.max(remainderArray[i], remainderArray[k - i]);
        }
        System.out.println(result);
    }
}
