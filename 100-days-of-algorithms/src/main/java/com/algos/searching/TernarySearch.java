package com.algos.searching;

public class TernarySearch {

    public int search(int[] nums, int num) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid1 = start + (end - start)/3;
            int mid2 = mid1 + (end - start)/3;

            if(nums[mid1] == num) {
                return mid1;
            }

            if(nums[mid2] == num) {
                return mid2;
            }

            if(num < nums[mid1]) {
                end = mid1 - 1;
            } else if(num > nums[mid2]) {
                start = mid2 + 1;
            } else {
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }

        return -1;
    }
}
