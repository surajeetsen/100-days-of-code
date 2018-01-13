package com.algos.dp;

public class Factorial {

    public int getFactorialTabulation(int num) {
        if (num <= 0) {
            return 1;
        }

        int[] factTable = new int[num + 1];
        factTable[0] = 1;

        for (int i = 1; i <= num; i++) {
            factTable[i] = i * factTable[i - 1];
        }

        return factTable[num];
    }

    public int getFactorialMemoization(int num) {
        if (num < 0) {
            return 1;
        }
        int[] factTable = new int[num + 1];
        factTable[0] = 1;

        return getFactorialMemoizationUtil(num, factTable);
    }

    private int getFactorialMemoizationUtil(int num, int[] factTable) {
        if (factTable[num] == 0) {
            factTable[num] = num * getFactorialMemoizationUtil(num - 1, factTable);
        }
        return factTable[num];
    }
}
