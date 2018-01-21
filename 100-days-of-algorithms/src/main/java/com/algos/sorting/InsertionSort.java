package com.algos.sorting;

public class InsertionSort {

    public int[] sort(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return nums;
        }

        for(int i =1; i < nums.length; i++) {
            int j = i - 1;
            while(j >= 0 && nums[j] > nums[j+1]) {
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                --j;
            }
        }

        return nums;
    }

}
