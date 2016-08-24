package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/24.
 * Problem: https://www.hackerrank.com/challenges/30-scope
 */
class Day_14_Difference {
    private int[] elements;
    int maximumDifference;
    // Add your code here
    Day_14_Difference(int[] a) {
        elements = a;
    }

    void computeDifference() {
        int minimum = elements[0];
        int maximum = elements[0];
        for (int i = 1; i < elements.length; ++i) {
            if (elements[i] < minimum)
                minimum = elements[i];
            if (elements[i] > maximum)
                maximum = elements[i];
        }
        maximumDifference =  maximum - minimum;
    }
} // End of Difference class

public class Day_14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Day_14_Difference difference = new Day_14_Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

