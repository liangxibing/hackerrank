package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/30-dictionaries-and-maps
 */
public class Day_8_Dictionaries_And_Maps {

    public static void main(String []argh){
        HashMap<String, Integer> phoneEntries = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneEntries.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            System.out.println(phoneEntries.containsKey(s) ? s + "=" + phoneEntries.get(s) : "Not found");
        }
        in.close();
    }
}
