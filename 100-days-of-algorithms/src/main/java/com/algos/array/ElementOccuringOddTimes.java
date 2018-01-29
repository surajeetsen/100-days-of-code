package com.algos.array;

import java.util.Arrays;

public class ElementOccuringOddTimes {
    public int getElementOccuringOddTimes(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }

        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }
}