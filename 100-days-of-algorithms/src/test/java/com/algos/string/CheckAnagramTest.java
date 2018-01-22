package com.algos.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckAnagramTest {

    CheckAnagram ca;

    @Before
    public void setUp() {
        ca = new CheckAnagram();
    }

    @Test
    public void isAnagram() {
        assertTrue(ca.isAnagram("listen", "silent"));
        assertTrue(ca.isAnagram("abcd", "abcd"));
        assertTrue(ca.isAnagram("", ""));
        assertTrue(ca.isAnagram("z", "z"));
        assertTrue(ca.isAnagram(null, null));
        assertFalse(ca.isAnagram("test", "tests"));
        assertFalse(ca.isAnagram("abcd", "abce"));
        assertFalse(ca.isAnagram("abc", "null"));
        assertFalse(ca.isAnagram("null", "abc"));
    }
}