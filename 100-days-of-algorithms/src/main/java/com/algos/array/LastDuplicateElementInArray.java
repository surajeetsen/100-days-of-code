package com.algos.array;

public class LastDuplicateElementInArray {
    public int find(int[] nums, int num) {
        if(nums == null || nums.length == 0) {
            return -1;
        }

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if((nums[mid] == num) && ((mid == nums.length -1) || nums[mid+1] != num)) {
                return mid;
            } else if(nums[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
