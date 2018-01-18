package com.algos.dp;

public class EggDroppingProblem {

    public int getEggDropsRecursive(int floors, int eggs) {
        if(eggs == 1 || floors == 0 || floors == 1) {
            return floors;
        }

        int min = Integer.MAX_VALUE;

        for(int i = 1; i <= floors; i++) {
            int res = 1 + Math.max(getEggDropsRecursive(i-1, eggs-1),
                                   getEggDropsRecursive(floors - i, eggs));

            min = Math.min(res, min);
        }

        return min;
    }


    public int getEggDropsDP(int floors, int eggs) {
        int[][] maxDropsArr = new int[floors+1][eggs+1];

        for(int i = 0; i <= floors; i++) {
            maxDropsArr[i][1] = i;
        }

        for(int e = 2; e <= eggs; e++) {
            for(int f = 1; f <= floors; f++) {
                maxDropsArr[f][e] = Integer.MAX_VALUE;
                for(int i = 1; i <= f; i++) {
                    int res = 1 + Math.max(maxDropsArr[i-1][e-1], maxDropsArr[f-i][e]);

                    if(res < maxDropsArr[f][e]) {
                        maxDropsArr[f][e] = res;
                    }
                }
            }
        }

        return maxDropsArr[floors][eggs];
    }

}
