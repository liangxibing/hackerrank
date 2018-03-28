package com.liangxibing.data_structures.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Xibing Liang on 2018/03/26.
 * Problem: https://www.hackerrank.com/challenges/2d-array/problem
 */
public class Array_2D_DS {

    static int array2D(int[][] arr) {
        int max = getHourglasse(arr, 1, 1);
        int temp;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                temp = getHourglasse(arr, i , j);
                if (temp > max)
                    max = temp;
            }
        }
        return max;
    }

    static int getHourglasse(int[][] arr, int i, int j) {
        return arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1]
                                   + arr[i][j] +
               arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int arrRowItr = 0; arrRowItr < 6; arrRowItr++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int arrColumnItr = 0; arrColumnItr < 6; arrColumnItr++) {
                int arrItem = Integer.parseInt(arrRowItems[arrColumnItr].trim());
                arr[arrRowItr][arrColumnItr] = arrItem;
            }
        }

        int result = array2D(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
