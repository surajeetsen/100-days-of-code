package com.algos.searching;

public class LinearSearch {

    public int search(int[] nums, int num) {
        if(nums == null || nums.length == 0) {
            return -1;
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == num) {
                return i;
            }
        }

        return -1;
    }
}
