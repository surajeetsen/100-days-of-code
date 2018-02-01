package com.algos.array;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NumbersDisapperaredInArrayTest {

    NumbersDisapperaredInArray ndia;

    @Before
    public void setUp() {
        ndia = new NumbersDisapperaredInArray();
    }

    @Test
    public void findDisappearedNumbers() {
        assertTrue(CollectionUtils.isEqualCollection(Arrays.asList(new Integer[]{}), ndia.findDisappearedNumbers(null)));
        assertTrue(CollectionUtils.isEqualCollection(Arrays.asList(new Integer[]{}), ndia.findDisappearedNumbers(new int[]{1})));
        assertTrue(CollectionUtils.isEqualCollection(Arrays.asList(new Integer[]{5,6}), ndia.findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1})));
    }
}