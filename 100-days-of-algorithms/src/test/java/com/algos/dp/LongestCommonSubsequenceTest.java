package com.algos.dp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {
    LongestCommonSubsequence lcs;

    @Before
    public void setUp() {
        lcs = new LongestCommonSubsequence();
    }

    @Test
    public void getLongestCommonSequenceLengthTest() {
        assertEquals(0, lcs.getLongestCommonSequenceLength(null, "abc"));
        assertEquals(0, lcs.getLongestCommonSequenceLength("", "abc"));
        assertEquals(0, lcs.getLongestCommonSequenceLength("abc", null));
        assertEquals(0, lcs.getLongestCommonSequenceLength("", ""));
        assertEquals(4, lcs.getLongestCommonSequenceLength("abcdef", "acbcf"));
        assertEquals(0, lcs.getLongestCommonSequenceLength("abc", "def"));
    }

    @Test
    public void getLCSLengthRecursionTest() {
        assertEquals(0, lcs.getLCSLengthRecursion(null, "abc"));
        assertEquals(0, lcs.getLCSLengthRecursion("", "abc"));
        assertEquals(0, lcs.getLCSLengthRecursion("abc", null));
        assertEquals(0, lcs.getLCSLengthRecursion("", ""));
        assertEquals(4, lcs.getLCSLengthRecursion("abcdef", "acbcf"));
        assertEquals(0, lcs.getLCSLengthRecursion("abc", "def"));
    }
}