package com.algos.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberInDupArrayTest {

    MissingNumberInDupArray mndp;

    @Before
    public void setUp() {
        mndp = new MissingNumberInDupArray();
    }

    @Test
    public void findMissingNumber() {
        int[] arr1 = {9, 7, 8, 5, 4, 6, 2, 3, 1};
        int[] arr2 = {2, 3, 4, 9, 1, 8, 5, 6};
        assertEquals(7, mndp.findMissingNumber(arr1, arr2));
    }
}