package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/29.
 * Problem: https://www.hackerrank.com/challenges/30-interfaces
 */
interface AdvancedArithmetic{
    int divisorSum(int n);
}
//Write your code here
class Day_19_Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            if (0 == n % i)
                sum += i;
        }
        return sum;
    }
}
public class Day_19_Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Day_19_Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
