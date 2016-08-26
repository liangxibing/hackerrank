package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/26.
 * Problem: https://www.hackerrank.com/challenges/30-exceptions-string-to-integer
 */
public class Day_16_Exceptions_String_To_Integer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        try {
            int number = Integer.parseInt(S);
            System.out.println(number);
        }
        catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
