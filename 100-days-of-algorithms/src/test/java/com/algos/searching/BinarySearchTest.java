package com.algos.searching;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    BinarySearch binarySearch;

    @Before
    public void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void binarySearchTest() {
        //Null or blank Array
        assertEquals(-1, binarySearch.search(null, 100));
        assertEquals(-1, binarySearch.search(new int[]{}, 100));

        int[] oddLengthArray = {2, 7, 10, 11, 23, 27, 28};
        int[] evenLengthArray = {-5, -2, 9, 15, 17, 19};

        //Number not present in arrar
        assertEquals(-1 , binarySearch.search(oddLengthArray, 35));
        assertEquals(-1 , binarySearch.search(oddLengthArray, -15));
        assertEquals(-1 , binarySearch.search(evenLengthArray, 40));
        assertEquals(-1 , binarySearch.search(evenLengthArray, -10));
        assertEquals(-1 , binarySearch.search(oddLengthArray, 24));
        assertEquals(-1 , binarySearch.search(oddLengthArray, 9));
        assertEquals(-1 , binarySearch.search(evenLengthArray, 5));
        assertEquals(-1 , binarySearch.search(evenLengthArray, 16));


        //Number present in array
        assertEquals(3 , binarySearch.search(oddLengthArray, 11));
        assertEquals(2 , binarySearch.search(oddLengthArray, 10));
        assertEquals(4 , binarySearch.search(oddLengthArray, 23));
        assertEquals(0 , binarySearch.search(oddLengthArray, 2));
        assertEquals(6 , binarySearch.search(oddLengthArray, 28));

        assertEquals(0 , binarySearch.search(evenLengthArray, -5));
        assertEquals(5 , binarySearch.search(evenLengthArray, 19));
        assertEquals(2 , binarySearch.search(evenLengthArray, 9));
        assertEquals(1 , binarySearch.search(evenLengthArray, -2));
        assertEquals(4 , binarySearch.search(evenLengthArray, 17));
    }

}