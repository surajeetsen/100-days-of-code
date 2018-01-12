package com.algos.searching;

public class InterpolationSearch {

    public int search(int[] nums, int num) {
        if(nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while(start <= end && num >= nums[start] && num <= nums[end]) {
            int index = start + (num - nums[start]) * (end - start) / (nums[end] - nums[start]);

            if(num < nums[index]) {
                end = index - 1;
            } else if(num > nums[index]) {
                start = index + 1;
            } else {
                return index;
            }

        }

        return -1;
    }
}
