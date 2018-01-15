package com.algos.dp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingSubsequence2Test {

    LongestIncreasingSubsequence2 lis;

    @Before
    public void setUp() throws Exception {
        lis = new LongestIncreasingSubsequence2();
    }

    @Test
    public void getLongestSubsequenceTest() {
        assertEquals(null, lis.getLongestSubsequence(null));
        assertArrayEquals(new int[]{}, lis.getLongestSubsequence(new int[]{}));
        assertArrayEquals(new int[]{5}, lis.getLongestSubsequence(new int[]{5}));


        assertArrayEquals(new int[]{2,3,7,8,10,13}, lis.getLongestSubsequence(new int[]{2, 5, 3, 7, 11, 8, 10, 13, 6 }));
        assertArrayEquals(new int[]{1,2,3,4,5}, lis.getLongestSubsequence(new int[]{7, 8, 9, 1, 2, 3, 4, 5}));
    }
}