package com.algos.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JewelAndStoneTest {

    JewelAndStone jas;

    @Before
    public void setUp() {
        jas = new JewelAndStone();
    }

    @Test
    public void numJewelsInStones() {
        assertEquals(0, jas.numJewelsInStones(null, "abc"));
        assertEquals(0, jas.numJewelsInStones("", "abc"));
        assertEquals(0, jas.numJewelsInStones("abc", null));
        assertEquals(0, jas.numJewelsInStones("abc", ""));
        assertEquals(3, jas.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, jas.numJewelsInStones("z", "ZZ"));
    }
}