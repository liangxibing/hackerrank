package com.liangxibing.tutorials.ten_days_of_statistics;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/26.
 * Problem: https://www.hackerrank.com/challenges/s10-multiple-linear-regression
 */
public class Day_9_Multiple_Linear_Regression {

    private static double[][] getTransposeMatrix(double[][] originMatrix) {
        int originRow = originMatrix.length;
        int originColumn = originMatrix[0].length;
        double[][] newMatrix = new double[originColumn][originRow];
        for (int i = 0; i < originColumn; ++i) {
            for (int j = 0; j < originRow; ++j) {
                newMatrix[i][j] = originMatrix[j][i];
            }
        }
        return newMatrix;
    }

    private static double[][] getMultiplyMatrix(double[][] matrix1, double[][] matrix2) {
        int row1 = matrix1.length;
        int column1 = matrix1[0].length;
        int row2 = matrix2.length;
        int column2 = matrix2[0].length;
        if (column1 != row2)
            return null;
        double[][] newMatrix = new double[row1][column2];
        for (int i = 0; i < row1; ++i) {
            for (int j = 0; j < column2; ++j) {
                newMatrix[i][j] = 0;
                for (int k = 0; k < column1; ++k) {
                    newMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return newMatrix;
    }

    private static double[][] getInverseMatrix(double[][] in){
        int st_vrs = in.length, st_stolp = in[0].length;
        double[][] out = new double[st_vrs][st_stolp];
        double[][] old = new double[st_vrs][st_stolp * 2];
        double[][] new1 = new double[st_vrs][st_stolp * 2];

        for (int v = 0; v < st_vrs; ++v) {//ones vector
            for (int s = 0; s < st_stolp * 2; ++s) {
                if (s - v == st_vrs)
                    old[v][s] = 1;
                if (s < st_stolp)
                    old[v][s] = in[v][s];
            }
        }
        //zeros below the diagonal
        for (int v = 0; v < st_vrs; ++v) {
            for (int v1 = 0; v1 < st_vrs; ++v1) {
                for (int s = 0; s < st_stolp * 2; ++s) {
                    if (v == v1)
                        new1[v][s] = old[v][s] / old[v][v];
                    else
                        new1[v1][s] = old[v1][s];
                }
            }
            old = prepisi(new1);
            for (int v1 = v + 1; v1 < st_vrs; ++v1) {
                for (int s = 0;s < st_stolp * 2; ++s) {
                    new1[v1][s] = old[v1][s] - old[v][s] * old[v1][v];
                }
            }
            old = prepisi(new1);
        }
        //zeros above the diagonal
        for (int s = st_stolp - 1; s > 0; --s) {
            for (int v = s - 1; v >= 0; --v) {
                for (int s1 = 0; s1 < st_stolp*2; ++s1) {
                    new1[v][s1] = old[v][s1] - old[s][s1] * old[v][s];
                }
            }
            old = prepisi(new1);
        }
        for (int v = 0;v < st_vrs; ++v) {//rigt part of matrix is invers
            System.arraycopy(new1[v], st_stolp, out[v], 0, st_stolp * 2 - st_stolp);
        }
        return out;
    }

    private static double[][] prepisi(double[][] in) {
        double[][] out = new double[in.length][in[0].length];
        for(int v = 0; v < in.length; ++v) {
            System.arraycopy(in[v], 0, out[v], 0, in[0].length);
        }
        return out;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        double[][] X = new double[n][m + 1];
        double[][] Y = new double[n][1];
        for (int i = 0; i < n; ++i) {
            X[i][0] = 1;
            for (int j = 1; j <= m; ++j) {
                X[i][j] = scan.nextDouble();
            }
            Y[i][0] = scan.nextDouble();
        }
        int q = scan.nextInt();
        double[][] newX = new double[q][m + 1];
        for (int i = 0; i < q; ++i) {
            newX[i][0] = 1;
            for (int j = 1; j <= m; ++j) {
                newX[i][j] = scan.nextDouble();
            }
        }
        scan.close();
        double[][] B = getMultiplyMatrix(getMultiplyMatrix(getInverseMatrix(getMultiplyMatrix(getTransposeMatrix(X), X)), getTransposeMatrix(X)), Y);
        for (int i = 0; i < q; ++i) {
            System.out.println(String.format("%.2f", getMultiplyMatrix(newX, B)[i][0]));
        }
    }
}
