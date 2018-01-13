package com.algos.dp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {

    LongestIncreasingSubsequence lis;

    @Before
    public void setUp() {
        lis = new LongestIncreasingSubsequence();
    }

    @Test
    public void getLongestSubsequenceLength() {
        //Base Cases
        assertEquals(0, lis.getLongestSubsequenceLength(null));
        assertEquals(0, lis.getLongestSubsequenceLength(new int[]{}));
        assertEquals(1, lis.getLongestSubsequenceLength(new int[]{5}));


        assertEquals(6, lis.getLongestSubsequenceLength(new int[]{2, 5, 3, 7, 11, 8, 10, 13, 6 }));
        assertEquals(5, lis.getLongestSubsequenceLength(new int[]{7, 8, 9, 1, 2, 3, 4, 5}));
    }
}