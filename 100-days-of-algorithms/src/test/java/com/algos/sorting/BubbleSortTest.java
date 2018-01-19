package com.algos.sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    BubbleSort bs;

    @Before
    public void setUp() {
        bs = new BubbleSort();
    }

    @Test
    public void sort() {
        assertArrayEquals(null, bs.sort(null));
        assertArrayEquals(new int[]{}, bs.sort(new int[]{}));
        assertArrayEquals(new int[]{}, bs.sort(new int[]{}));
        assertArrayEquals(new int[]{1}, bs.sort(new int[]{1}));
        assertArrayEquals(new int[]{1,2,3,4,5}, bs.sort(new int[]{5,4,3,2,1}));
        assertArrayEquals(new int[]{1,2,3,4,5}, bs.sort(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{11,12,22,25,34,64,90}, bs.sort(new int[]{64, 34, 25, 12, 22, 11, 90}));
    }
}