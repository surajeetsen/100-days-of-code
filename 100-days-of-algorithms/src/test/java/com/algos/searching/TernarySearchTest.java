package com.algos.searching;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TernarySearchTest {
    TernarySearch ternarySearch;

    @Before
    public void setUp() {
        ternarySearch = new TernarySearch();
    }

    @Test
    public void ternarySearchTest() {
        //Null or blank Array
        assertEquals(-1, ternarySearch.search(null, 100));
        assertEquals(-1, ternarySearch.search(new int[]{}, 100));

        int[] oddLengthArray = {2, 7, 10, 11, 23, 27, 28};
        int[] evenLengthArray = {-5, -2, 9, 15, 17, 19};

        //Number not present in arrar
        assertEquals(-1 , ternarySearch.search(oddLengthArray, 35));
        assertEquals(-1 , ternarySearch.search(oddLengthArray, -15));
        assertEquals(-1 , ternarySearch.search(evenLengthArray, 40));
        assertEquals(-1 , ternarySearch.search(evenLengthArray, -10));
        assertEquals(-1 , ternarySearch.search(oddLengthArray, 24));
        assertEquals(-1 , ternarySearch.search(oddLengthArray, 9));
        assertEquals(-1 , ternarySearch.search(evenLengthArray, 5));
        assertEquals(-1 , ternarySearch.search(evenLengthArray, 16));


        //Number present in array
        assertEquals(3 , ternarySearch.search(oddLengthArray, 11));
        assertEquals(2 , ternarySearch.search(oddLengthArray, 10));
        assertEquals(4 , ternarySearch.search(oddLengthArray, 23));
        assertEquals(0 , ternarySearch.search(oddLengthArray, 2));
        assertEquals(6 , ternarySearch.search(oddLengthArray, 28));

        assertEquals(0 , ternarySearch.search(evenLengthArray, -5));
        assertEquals(5 , ternarySearch.search(evenLengthArray, 19));
        assertEquals(2 , ternarySearch.search(evenLengthArray, 9));
        assertEquals(1 , ternarySearch.search(evenLengthArray, -2));
        assertEquals(4 , ternarySearch.search(evenLengthArray, 17));
    }
}