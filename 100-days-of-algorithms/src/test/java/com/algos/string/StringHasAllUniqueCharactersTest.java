package com.algos.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHasAllUniqueCharactersTest {

    StringHasAllUniqueCharacters uc;

    @Before
    public void setUp() {
        uc = new StringHasAllUniqueCharacters();
    }

    @Test
    public void areAllUniqueChars() {
        assertTrue(uc.areAllUniqueChars(null));
        assertTrue(uc.areAllUniqueChars("a"));
        assertTrue(uc.areAllUniqueChars("abcdefghijklmnopqrstuvxyz"));
        assertFalse(uc.areAllUniqueChars("abcdefghijklmnopqrstuvxyza"));
    }
}