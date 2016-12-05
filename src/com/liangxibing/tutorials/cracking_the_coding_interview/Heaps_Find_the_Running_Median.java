package com.liangxibing.tutorials.cracking_the_coding_interview;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by liangxibing on 6/12/16.
 * Problem: https://www.hackerrank.com/challenges/ctci-find-the-running-median
 */
public class Heaps_Find_the_Running_Median {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer temp;
        Integer lo;
        Integer hi;
        double median;
        // maxHeap
        PriorityQueue<Integer> firstHalf = new PriorityQueue<>(11, new Heaps_Find_the_Running_Median_Comparator());
        // minHeap
        PriorityQueue<Integer> secondHalf = new PriorityQueue<>(11);
        for(int a_i = 0; a_i < n; a_i++){
            temp = in.nextInt();
            // insert the new element into maxHeap/minHeap one by one
            if (0 == a_i % 2)
                firstHalf.add(temp);
            else
                secondHalf.add(temp);
            lo = firstHalf.peek();
            hi = secondHalf.peek();
            // if the first element in the maxHeap is greater than the first element in the minHeap then swap these two first elements
            if (lo != null && hi != null && lo > hi) {
                firstHalf.poll();
                secondHalf.poll();
                firstHalf.add(hi);
                secondHalf.add(lo);
            }
            // as we insert into maxHeap firstly, then maxHeap's size will equal to minHeap or larger than minHeap by 1
            if (firstHalf.size() == secondHalf.size())
                median = (double) (firstHalf.peek() + secondHalf.peek()) / 2;
            else
                median = (double) firstHalf.peek();
            System.out.println(String.format("%.1f", median));
        }
    }
}

class Heaps_Find_the_Running_Median_Comparator implements Comparator<Integer>
{
    public int compare( Integer x, Integer y )
    {
        return y - x;
    }
}