package com.algos.dp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciSeriesTest {

    FibonacciSeries fibonacciSeries;

    @Before
    public void setUp() {
        fibonacciSeries = new FibonacciSeries();
    }

    @Test
    public void getFibTabulationTest() {
        assertEquals(0, fibonacciSeries.getFibTabulation(-1));
        assertEquals(0, fibonacciSeries.getFibTabulation(0));
        assertEquals(1, fibonacciSeries.getFibTabulation(1));
        assertEquals(5, fibonacciSeries.getFibTabulation(5));
        assertEquals(55, fibonacciSeries.getFibTabulation(10));
        assertEquals(6765, fibonacciSeries.getFibTabulation(20));
    }

    @Test
    public void getFibMemoizationTest() {
        assertEquals(0, fibonacciSeries.getFibMemoization(-1));
        assertEquals(0, fibonacciSeries.getFibMemoization(0));
        assertEquals(1, fibonacciSeries.getFibMemoization(1));
        assertEquals(5, fibonacciSeries.getFibMemoization(5));
        assertEquals(55, fibonacciSeries.getFibMemoization(10));
        assertEquals(6765, fibonacciSeries.getFibMemoization(20));
    }
}