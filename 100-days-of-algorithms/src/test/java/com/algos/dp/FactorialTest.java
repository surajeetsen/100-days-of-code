package com.algos.dp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial fact;

    @Before
    public void setUp() {
        fact = new Factorial();
    }

    @Test
    public void getFactorialTabulationTest() {
        assertEquals(1, fact.getFactorialTabulation(-1));
        assertEquals(1, fact.getFactorialTabulation(0));
        assertEquals(1, fact.getFactorialTabulation(1));
        assertEquals(120, fact.getFactorialTabulation(5));
        assertEquals(3628800, fact.getFactorialTabulation(10));
    }

    @Test
    public void getFactorialMemoizationTest() {
        assertEquals(1, fact.getFactorialMemoization(-1));
        assertEquals(1, fact.getFactorialMemoization(0));
        assertEquals(1, fact.getFactorialMemoization(1));
        assertEquals(120, fact.getFactorialMemoization(5));
        assertEquals(3628800, fact.getFactorialMemoization(10));
    }
}