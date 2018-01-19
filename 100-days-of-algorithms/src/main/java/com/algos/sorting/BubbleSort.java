package com.algos.sorting;

public class BubbleSort {

    public int[] sort(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return nums;
        }

        for(int i = nums.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j + 1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}
