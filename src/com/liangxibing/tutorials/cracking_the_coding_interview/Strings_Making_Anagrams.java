package com.liangxibing.tutorials.cracking_the_coding_interview;

import java.util.Scanner;

/**
 * Created by liangxibing on 2/12/16.
 * https://www.hackerrank.com/challenges/ctci-making-anagrams
 */
public class Strings_Making_Anagrams {

    private static int numberNeeded(String first, String second) {
        int result = 0;
        int[] firstCharCount = new int[26];
        int[] secondCharCount = new int[26];
        // get the count of each character
        for (char c : first.toCharArray())
            firstCharCount[c - 'a']++;
        for (char c: second.toCharArray())
            secondCharCount[c - 'a']++;
        // calculate the count difference of each character
        for (int i = 0; i < 26; i++)
            result += Math.max(firstCharCount[i], secondCharCount[i])
                    - Math.min(firstCharCount[i], secondCharCount[i]);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

