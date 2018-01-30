package com.algos.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumberInDupArray {
    public int findMissingNumber(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).reduce(0, (a, b) -> a^b);
    }
}
