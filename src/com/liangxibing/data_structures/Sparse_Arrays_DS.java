package com.liangxibing.data_structures;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by simonliang on 2018/03/28.
 * Problem: https://www.hackerrank.com/challenges/sparse-arrays/problem
 */
public class Sparse_Arrays_DS {

    static int findSuffix(String[] collections, String queryString) {
        int result = 0;
        for(String string: collections)
            if (string.equals(queryString))
                result++;
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        String[] collections = new String[n];

        for (int stringsItr = 0; stringsItr < n; stringsItr++) {
            String stringsItem = scanner.nextLine();
            collections[stringsItr] = stringsItem;
        }

        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String queryString = scanner.nextLine();

            int res = findSuffix(collections, queryString);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
