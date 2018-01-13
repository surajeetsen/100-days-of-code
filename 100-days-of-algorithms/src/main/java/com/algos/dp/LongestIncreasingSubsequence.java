package com.algos.dp;

public class LongestIncreasingSubsequence {

    public int getLongestSubsequenceLength(int[] nums) {
        if(nums == null) {
            return 0;
        } else if(nums.length <= 1) {
            return nums.length;
        }

        int[] tailArray = new int[nums.length];
        int currLen = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[tailArray[currLen]]) {
                ++currLen;
                tailArray[currLen] = i;
            } else if(nums[i] < nums[tailArray[0]]) {
                tailArray[0] = i;
            } else {
                tailArray[getCiel(nums,tailArray,currLen,nums[i])] = i;
            }
        }

        return currLen + 1;
    }

    private int getCiel(int[] nums, int[] tailArray, int end, int num) {
        int start = 0;

        int mid = 0;
        while(start <= end) {
            mid = start + (end - start)/2;

            if(mid < end && nums[tailArray[mid]] < num && num < nums[tailArray[mid+1]]) {
                break;
            } else if(nums[tailArray[mid]] < num) {
                start = mid + 1;
            } else {
                end = mid-1;
            }
        }
        return mid+1;
    }
}
