package com.liangxibing.tutorials.thirty_days_of_code;

/**
 * Created by liangxibing on 2016/8/31.
 * Problem: https://www.hackerrank.com/challenges/30-generics
 */
public class Day_21_Generics {
    //Write your code here
    private static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item.toString());
        }
    }

    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        printArray( intArray  );
        printArray( stringArray );

        if(Day_21_Generics.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}
