package com.algos.dp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggDroppingProblemTest {

    EggDroppingProblem edp;

    @Before
    public void setUp() throws Exception {
        edp = new EggDroppingProblem();
    }

    @Test
    public void getEggDropsRecursive() {
        assertEquals(0, edp.getEggDropsRecursive(0, 1));
        assertEquals(1, edp.getEggDropsRecursive(1, 1));
        assertEquals(10, edp.getEggDropsRecursive(10, 1));
        assertEquals(6, edp.getEggDropsRecursive(20, 2));
    }

    @Test
    public void getEggDropsDP() {
        assertEquals(0, edp.getEggDropsDP(0, 1));
        assertEquals(1, edp.getEggDropsDP(1, 1));
        assertEquals(10, edp.getEggDropsDP(10, 1));
        assertEquals(6, edp.getEggDropsDP(20, 2));
        assertEquals(14, edp.getEggDropsDP(100, 2));
        assertEquals(9, edp.getEggDropsDP(100, 3));
    }
}