package com.algos.dp;

public class FibonacciSeries {

    public int getFibTabulation(int num) {
        if(num <= 1) {
            return (num < 0) ? 0 : num;
        }

        int[] fibTable = new int[num+1];
        fibTable[0] = 0;
        fibTable[1] = 1;

        for(int i = 2; i <= num; i++) {
            fibTable[i] = fibTable[i-1] + fibTable[i-2];
        }
        return fibTable[num];
    }

    public int getFibMemoization(int num) {
        if(num <= 1) {
            return (num < 0) ? 0 : num;
        }
        int[] fibTable = new int[num+1];

        for(int i = 0; i <= num; i++) {
            fibTable[i] = -1;
        }

        return getFibDpMemoUtil(num, fibTable);
    }

    private int getFibDpMemoUtil(int num, int[] fibTable) {
        if(fibTable[num] == -1) {
            if(num <= 1) {
                fibTable[num] = num;
            } else {
                fibTable[num] = getFibDpMemoUtil(num-1, fibTable) + getFibDpMemoUtil(num-2, fibTable);
            }
        }
        return fibTable[num];
    }
}
