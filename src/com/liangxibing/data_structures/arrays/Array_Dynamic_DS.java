package com.liangxibing.data_structures.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by Xibing Liang on 2018/03/26.
 * Problem: https://www.hackerrank.com/challenges/dynamic-array/problem
 */
public class Array_Dynamic_DS {

    static int[] dynamicArray(int n, int[][] queries) {
        ArrayList<Integer>[] seq_list = new ArrayList[n];
        for (int i = 0; i < seq_list.length; i++)
            seq_list[i] = new ArrayList<>();
        List<Integer> result_list = new ArrayList<>();
        int type, x, y;
        int last_answer = 0;
        List<Integer> temp_list;
        for (int i = 0; i < queries.length; i++) {
            type = queries[i][0];
            x = queries[i][1];
            y = queries[i][2];
            if (1 == type) {
                seq_list[(x ^ last_answer) % n].add(y);
            }
            else if (2 == type) {
                temp_list = seq_list[(x ^ last_answer) % n];
                last_answer = temp_list.get(y % (temp_list.size()));
                result_list.add(last_answer);
            }
        }
        return result_list.stream().mapToInt(i->i).toArray();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());

        int[][] queries = new int[q][3];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = dynamicArray(n, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
