package com.algos.searching;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinearSearchTest {

    private LinearSearch linearSearch;

    @Before
    public void setUp() {
        linearSearch = new LinearSearch();
    }

    @Test
    public void testSearch() {
        //Null or blank Array
        assertEquals(-1, linearSearch.search(null, 1));
        assertEquals(-1, linearSearch.search(new int[]{}, 1));

        //Number present in Array
        assertEquals(1, linearSearch.search(new int[]{15, 1, 20, 4, 5}, 1));
        assertEquals(3, linearSearch.search(new int[]{15, 1, 20, 4, 5}, 4));

        //Number present in Array boundaries
        assertEquals(4, linearSearch.search(new int[]{15, 1, 20, 4, 5}, 5));
        assertEquals(0, linearSearch.search(new int[]{15, 1, 20, 4, 5}, 15));

        //Number not present in Array
        assertEquals(-1, linearSearch.search(new int[]{15, 1, 20, 4, 5}, 25));
        assertEquals(-1, linearSearch.search(new int[]{15, 1, 20, 4, 5}, -6));

    }

}