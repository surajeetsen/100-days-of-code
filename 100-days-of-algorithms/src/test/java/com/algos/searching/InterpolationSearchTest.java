package com.algos.searching;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InterpolationSearchTest {

    InterpolationSearch interpolationSearch;

    @Before
    public void setUp() {
        interpolationSearch = new InterpolationSearch();
    }

    @Test
    public void interpolationSearchTest() {
        //Null or blank array
        assertEquals(-1, interpolationSearch.search(null, 10));
        assertEquals(-1, interpolationSearch.search(new int[]{}, 10));

        int[] oddLengthArray = {2, 5, 8, 11, 14, 17, 20};
        int[] evenLengthArray = {-5, -3, -1, 1, 3, 5};

        //Number not present in arrar
        assertEquals(-1 , interpolationSearch.search(oddLengthArray, 21));
        assertEquals(-1 , interpolationSearch.search(oddLengthArray, 1));
        assertEquals(-1 , interpolationSearch.search(evenLengthArray, 6));
        assertEquals(-1 , interpolationSearch.search(evenLengthArray, -10));
        assertEquals(-1 , interpolationSearch.search(oddLengthArray, 18));
        assertEquals(-1 , interpolationSearch.search(oddLengthArray, 6));
        assertEquals(-1 , interpolationSearch.search(evenLengthArray, -2));
        assertEquals(-1 , interpolationSearch.search(evenLengthArray, 4));


        //Number present in array
        assertEquals(3 , interpolationSearch.search(oddLengthArray, 11));
        assertEquals(2 , interpolationSearch.search(oddLengthArray, 8));
        assertEquals(4 , interpolationSearch.search(oddLengthArray, 14));
        assertEquals(0 , interpolationSearch.search(oddLengthArray, 2));
        assertEquals(6 , interpolationSearch.search(oddLengthArray, 20));

        assertEquals(0 , interpolationSearch.search(evenLengthArray, -5));
        assertEquals(5 , interpolationSearch.search(evenLengthArray, 5));
        assertEquals(2 , interpolationSearch.search(evenLengthArray, -1));
        assertEquals(1 , interpolationSearch.search(evenLengthArray, -3));
        assertEquals(4 , interpolationSearch.search(evenLengthArray, 3));
    }

}