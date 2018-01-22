package com.algos.searching;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentialSearchTest {

    ExponentialSearch exponentialSearch;

    @Before
    public void setUp() {
        exponentialSearch = new ExponentialSearch();
    }

    @Test
    public void searchTest() {
        //Null or blank Array
        assertEquals(-1, exponentialSearch.search(null, 100));
        assertEquals(-1, exponentialSearch.search(new int[]{}, 100));

        int[] oddLengthArray = {2, 7, 10, 11, 23, 27, 28};
        int[] evenLengthArray = {-5, -2, 9, 15, 17, 19};

        //Number not present in arrar
        assertEquals(-1 , exponentialSearch.search(oddLengthArray, 35));
        assertEquals(-1 , exponentialSearch.search(oddLengthArray, -15));
        assertEquals(-1 , exponentialSearch.search(evenLengthArray, 40));
        assertEquals(-1 , exponentialSearch.search(evenLengthArray, -10));
        assertEquals(-1 , exponentialSearch.search(oddLengthArray, 24));
        assertEquals(-1 , exponentialSearch.search(oddLengthArray, 9));
        assertEquals(-1 , exponentialSearch.search(evenLengthArray, 5));
        assertEquals(-1 , exponentialSearch.search(evenLengthArray, 16));


        //Number present in array
        assertEquals(3 , exponentialSearch.search(oddLengthArray, 11));
        assertEquals(2 , exponentialSearch.search(oddLengthArray, 10));
        assertEquals(4 , exponentialSearch.search(oddLengthArray, 23));
        assertEquals(0 , exponentialSearch.search(oddLengthArray, 2));
        assertEquals(6 , exponentialSearch.search(oddLengthArray, 28));

        assertEquals(0 , exponentialSearch.search(evenLengthArray, -5));
        assertEquals(5 , exponentialSearch.search(evenLengthArray, 19));
        assertEquals(2 , exponentialSearch.search(evenLengthArray, 9));
        assertEquals(1 , exponentialSearch.search(evenLengthArray, -2));
        assertEquals(4 , exponentialSearch.search(evenLengthArray, 17));
    }
}