package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liangxibing on 15/09/16.
 * Problem: https://www.hackerrank.com/challenges/30-regex-patterns
 */
public class Day_28_RegEx_Patterns_And_Intro_To_Databases {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<String> gmailAccounts = new ArrayList<>();
        String myRegExString = "[a-z]+@gmail.com";
        Pattern p = Pattern.compile(myRegExString);
        String firstName;
        String emailID;
        Matcher m;
        for(int a0 = 0; a0 < N; a0++){
            firstName = in.next();
            emailID = in.next();
            m = p.matcher(emailID);
            if (m.find())
                gmailAccounts.add(firstName);
        }
        in.close();
        Collections.sort(gmailAccounts);
        for (String gmailAccount : gmailAccounts)
            System.out.println(gmailAccount);
    }
}
