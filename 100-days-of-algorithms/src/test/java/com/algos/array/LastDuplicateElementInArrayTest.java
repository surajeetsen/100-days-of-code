package com.algos.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastDuplicateElementInArrayTest {

    LastDuplicateElementInArray lde;

    @Before
    public void setUp() {
        lde = new LastDuplicateElementInArray();
    }

    @Test
    public void find() {
        assertEquals(-1, lde.find(null, 5));
        assertEquals(-1, lde.find(new int[]{}, 5));
        assertEquals(7, lde.find(new int[]{0, 1, 2, 2, 4, 5, 5, 5, 8}, 5));
        assertEquals(8, lde.find(new int[]{0, 1, 2, 2, 4, 5, 5, 5, 8}, 8));
        assertEquals(0, lde.find(new int[]{0, 1, 2, 2, 4, 5, 5, 5, 8}, 0));
        assertEquals(-1, lde.find(new int[]{0, 1, 2, 2, 4, 5, 5, 5, 8}, 3));
        assertEquals(-1, lde.find(new int[]{0, 1, 2, 2, 4, 5, 5, 5, 8}, -1));
        assertEquals(-1, lde.find(new int[]{0, 1, 2, 2, 4, 5, 5, 5, 8}, 9));
        assertEquals(0, lde.find(new int[]{0}, 0));
    }
}