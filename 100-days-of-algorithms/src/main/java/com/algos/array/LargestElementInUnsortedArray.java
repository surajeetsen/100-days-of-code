package com.algos.array;

public class LargestElementInUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 99, 98, 105, 1, 2};
        System.out.println(new LargestElementInUnsortedArray().getLargetInUnsortedArray(arr));
    }

    public int getLargetInUnsortedArray(int[] arr) {
        heapify(arr, arr.length);
        return arr[0];
    }

    private void heapify(int[] arr, int n) {
        for(int i = n/2 - 1; i >= 0; i--) {
            maxHeapify(i, n, arr);
        }
    }

    private void maxHeapify(int i, int n, int[] arr) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            maxHeapify(largest, n, arr);
        }
    }
}
