package com.algos.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElementOccuringOddTimesTest {

    private ElementOccuringOddTimes eot;

    @Before
    public void setUp() {
        eot = new ElementOccuringOddTimes();
    }

    @Test
    public void getElementOccuringOddTimes() {
        assertEquals(-1, eot.getElementOccuringOddTimes(null));
        assertEquals(-1, eot.getElementOccuringOddTimes(new int[]{}));
        assertEquals(1, eot.getElementOccuringOddTimes(new int[]{1}));
        assertEquals(2, eot.getElementOccuringOddTimes(new int[]{1,2,1}));
    }
}