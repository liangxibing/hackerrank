package com.liangxibing.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/24.
 * Problem: https://www.hackerrank.com/challenges/time-conversion
 */
public class Time_Conversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        in.close();
        String hourString = time.substring(0, 2);
        int hour = Integer.parseInt(time.substring(0, 2));
        String apm = time.substring(8);
        if (apm.equals("AM") && 12 == hour)
            hourString = "00";
        else if (apm.equals("PM") && 12 != hour)
            hourString = String.valueOf(hour + 12);
        System.out.println(hourString + time.substring(2, 8));
    }
}
