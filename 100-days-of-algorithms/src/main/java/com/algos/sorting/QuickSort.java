package com.algos.sorting;

public class QuickSort {

    public int[] sort(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return nums;
        }

        return sort(nums, 0, nums.length - 1);
    }

    private int[] sort(int[] nums, int low, int high) {
        int pivot = low + (int) (Math.random() * (high - low));

        int i = low;
        int j = high;

        while (i <= j) {
            while (nums[i] < nums[pivot]) {
                i++;
            }
            while (nums[j] > nums[pivot]) {
                j--;
            }

            if (i <= j) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
            }
        }

        if (low < i-1) {
            sort(nums, low, i-1);
        }

        if (i < high) {
            sort(nums, i, high);
        }

        return nums;
    }

}
