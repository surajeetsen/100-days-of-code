package com.algos.sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    InsertionSort is;

    @Before
    public void setUp() {
        is = new InsertionSort();
    }

    @Test
    public void sort() {
        assertArrayEquals(null, is.sort(null));
        assertArrayEquals(new int[]{}, is.sort(new int[]{}));
        assertArrayEquals(new int[]{}, is.sort(new int[]{}));
        assertArrayEquals(new int[]{1}, is.sort(new int[]{1}));
        assertArrayEquals(new int[]{1,2,3,4,5}, is.sort(new int[]{5,4,3,2,1}));
        assertArrayEquals(new int[]{1,2,3,4,5}, is.sort(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{11,12,22,25,34,64,90}, is.sort(new int[]{64, 34, 25, 12, 22, 11, 90}));
    }
}