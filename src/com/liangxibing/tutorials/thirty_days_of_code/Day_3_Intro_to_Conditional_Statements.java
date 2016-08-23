package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/30-class-vs-instance
 */
public class Day_3_Intro_to_Conditional_Statements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else{
            // Complete the code
            if (n >= 2 && n <= 5 || n > 20)
                ans = "Not Weird";
            else if (n >= 6 && n <= 20)
                ans = "Weird";
        }
        System.out.println(ans);
    }
}
