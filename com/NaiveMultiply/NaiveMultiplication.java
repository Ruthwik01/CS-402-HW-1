package com.NaiveMultiply;

import java.util.Random;
public class NaiveMultiplication {

    // Integer
    public static int[][] intmatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        Random random = new Random();
        for (int x = 0; x < row; ++x) {
            for (int y = 0; y < column; ++y) {
                matrix[x][y] = random.nextInt(100); 
            }
        }
        return matrix;
    }

     // Multiply
    public static int[][] multiplyintmatrix(int[][] A, int[][] B) {
        int RowA = A.length;
        int ColA = A[0].length;
        int ColB = B[0].length;
        int[][] res = new int[RowA][ColB];

        for (int x = 0; x < RowA; ++x) {
            for (int y = 0; y < ColB; ++y) {
                for (int i = 0; i < ColA; ++i) {
                    res[x][y] += A[x][i] * B[i][y];
                }
            }
        }

        return res;
    }

       public static int[][] multiplyintmatrix2(int[][] A, int[][] B) {
        int RowA = A.length;
        int ColA = A[0].length;
        int ColB = B[0].length;
        int[][] res = new int[RowA][ColB];

        for (int x = 0; x < ColB; ++x) {
            for (int y = 0; y < RowA; ++y) {
                for (int i = 0; i < ColA; ++i) {
                    res[y][x] += A[y][i] * B[i][x];
                }
            }
        }

        return res;
    }

    // Double 
    public static double[][] randdoublematrix(int row, int column) {
        double[][] matrix = new double[row][column];
        Random random = new Random();
        for (int x = 0; x < row; ++x) {
            for (int y = 0; y < column; ++y) {
                matrix[x][y] = random.nextDouble(); 
            }
        }
        return matrix;
    }

    // Multiply Double
    public static double[][] multiplydoublematrix(double[][] A, double[][] B) {
        int RowA = A.length;
        int ColA = A[0].length;
        int ColB = B[0].length;
        double[][] res = new double[RowA][ColB];

        for (int x = 0; x < RowA; ++x) {
            for (int y = 0; y < ColB; ++y) {
                for (int i = 0; i < ColA; ++i) {
                    res[x][y] += A[x][i] * B[i][y];
                }
            }
        }

        return res;
    }

        public static double[][] multiplydoublematrix2(double[][] A, double[][] B) {
        int RowA = A.length;
        int ColA = A[0].length;
        int ColB = B[0].length;
        double[][] res = new double[RowA][ColB];

         for (int x = 0; x < ColB; ++x) {
            for (int y = 0; y < RowA; ++y) {
                for (int i = 0; i < ColA; ++i) {
                    res[y][x] += A[y][i] * B[i][x];
                }
            }
        }
        return res;
    }
}