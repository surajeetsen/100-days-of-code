package com.algos.array;

public class FirstDuplicateElementInArray {
    public int find(int[] nums, int num) {
        if(nums == null || nums.length == 0) {
            return -1;
        }

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if((nums[mid] == num) && ((mid == 0) || nums[mid-1] != num)) {
                return mid;
            } else if(nums[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}