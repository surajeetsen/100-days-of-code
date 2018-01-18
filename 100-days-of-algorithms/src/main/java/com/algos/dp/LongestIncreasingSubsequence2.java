package com.algos.dp;

import java.util.LinkedList;

public class LongestIncreasingSubsequence2 {

    public int[] getLongestSubsequence(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1) {
            return nums;
        }

        int[] tailArray = new int[nums.length];
        int[] sequenceArray = new int[nums.length];

        for(int i = 0; i < sequenceArray.length; i++) {
            sequenceArray[i] = -1;
        }

        LinkedList<Integer> result = new LinkedList<>();

        tailArray[0] = 0;
        int currLength = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[tailArray[currLength]]) {
                ++currLength;
                tailArray[currLength] = i;
                sequenceArray[tailArray[currLength]] = tailArray[currLength-1];
            } else if(nums[i] < nums[tailArray[0]]) {
                tailArray[0] = i;
            } else {
                int index = getCiel(nums, tailArray, currLength, nums[i]);
                tailArray[index] = i;
                sequenceArray[tailArray[index]] = tailArray[index-1];
            }
        }

        int currIndex = tailArray[currLength];
        while(currIndex != -1) {
            result.addFirst(nums[currIndex]);
            currIndex = sequenceArray[currIndex];
        }

        return result.stream().mapToInt(i->i).toArray();
    }

    private int getCiel(int[] nums, int[] tailArray, int end, int num) {
        int start = 0;
        int mid = 0;

        while(start <= end) {
            mid = start + (end - start)/2;

            if(mid < end && nums[tailArray[mid]] < num && num < nums[tailArray[mid+1]]) {
                break;
            } else if(num > nums[tailArray[mid]]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return mid+1;
    }

}
