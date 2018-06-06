package com.algos.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    QuickSort qs;

    @Before
    public void setUp() {
        qs = new QuickSort();
    }

    @Test
    public void sort() {
        assertArrayEquals(null, qs.sort(null));
        assertArrayEquals(new int[]{}, qs.sort(new int[]{}));
        assertArrayEquals(new int[]{}, qs.sort(new int[]{}));
        assertArrayEquals(new int[]{1}, qs.sort(new int[]{1}));
        assertArrayEquals(new int[]{1,2,3,4,5}, qs.sort(new int[]{5,4,3,2,1}));
        assertArrayEquals(new int[]{1,2,3,4,5}, qs.sort(new int[]{1,2,3,4,5}));
        //assertArrayEquals(new int[]{11,12,22,25,34,64,90}, qs.sort(new int[]{64,34,25,12,22,11,90}));

        System.out.println(Arrays.toString(qs.sort(new int[]{64,34,25,12,22,11,90})));
    }
}