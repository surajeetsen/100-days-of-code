package com.algos.searching;

public class ExponentialSearch {

    public int search(int[] nums, int num) {
        if(nums == null || nums.length == 0) {
            return -1;
        }

        if(nums[0] == num) {
            return 0;
        }

        int rangeEnd = 1;

        while(rangeEnd < nums.length && nums[rangeEnd] <= num) {
            rangeEnd *= 2;
        }

        int end = Math.min(rangeEnd, nums.length-1);
        int start = end/2;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == num) {
                return mid;
            } else if(num < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
