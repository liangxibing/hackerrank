package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/17.
 * Problem: https://www.hackerrank.com/challenges/s10-basic-statistics
 */
public class Day_0_Mean_Median_Mode {

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; ++j) {
            if (array[j] <= pivot) {
                ++i;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int i = partition(array, low, high);
            quickSort(array, low, i - 1);
            quickSort(array, i + 1, high);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        double Sum = 0.0;
        int maxCount = 0;
        int temp = 0;
        double Mean = 0.0;
        double Median = 0.0;
        int Mode = 0;
        for (int i = 0; i < N; ++i) {
            array[i] = scan.nextInt();
        }
        quickSort(array, 0, N - 1);
        for (int i = 0; i < N; ++i) {
            Sum += array[i];
        }
        Mean = (Math.floor((Sum / N) * 10) / 10);
        Median = 0 == N % 2 ? ((double)(array[N / 2] + array[(N / 2) - 1])) / 2 : array[(N - 1)/2];
        for (int i = 0; i < N; ++i) {
            if (countMap.containsKey(array[i]))
                countMap.put(array[i], countMap.get(array[i]) + 1);
            else
                countMap.put(array[i], 1);
            temp = countMap.get(array[i]);
            if (maxCount < temp) {
                maxCount = temp;
                Mode = array[i];
            }
            else if (maxCount == temp) {
                Mode = array[i] < Mode ? array[i] :  Mode;
            }
        }
        System.out.println(Mean);
        System.out.println(Median);
        System.out.println(Mode);
        scan.close();
    }
}
