package com.algos.dp;

public class LargestSubSquareMatrix {
    public static void main(String[] args) {
        int[][] matrix =
                {{1,1,1,1,1},
                 {1,0,1,0,1},
                 {0,1,1,1,1},
                 {0,0,1,1,1},
                 {0,1,1,1,1}};

        System.out.println(new LargestSubSquareMatrix().getMaxSubSquareMatrixRecursive(matrix));
        System.out.println(new LargestSubSquareMatrix().getMaxSubSquareMatrixDp(matrix));
    }

    public int getMaxSubSquareMatrixRecursive(int[][] matrix) {
        int max = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 1) {
                    max = Math.max(max, getMaxSubSquareMatrixRecursive(matrix, i, j));
                }
            }
        }
        return max;
    }

    private int getMaxSubSquareMatrixRecursive(int[][] matrix, int i, int j) {
        if(i == matrix.length || j == matrix[0].length) {
            return 0;
        }

        if(matrix[i][j] != 1) {
            return 0;
        }

        return 1 + Math.min(Math.min(getMaxSubSquareMatrixRecursive(matrix, i+1, j),
                                     getMaxSubSquareMatrixRecursive(matrix, i, j+1)),
                            getMaxSubSquareMatrixRecursive(matrix, i+1, j+1));
    }

    public int getMaxSubSquareMatrixDp(int[][] matrix) {
        int[][] cache = new int[matrix.length][matrix[0].length];
        int max = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(i == 0 || j == 0) {
                    cache[i][j] = matrix[i][j];
                } else if(matrix[i][j] == 1) {
                    cache[i][j] = 1 + Math.min(Math.min(cache[i-1][j], cache[i][j-1]), cache[i-1][j-1]);
                }
                max = Math.max(max, cache[i][j]);
            }
        }

        return max;
    }

}
