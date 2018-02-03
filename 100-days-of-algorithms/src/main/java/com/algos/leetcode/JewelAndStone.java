package com.algos.leetcode;

import java.util.HashSet;
import java.util.Set;

public class JewelAndStone {
    public int numJewelsInStones(String J, String S) {
        if(J == null || J.length() == 0 || S == null || S.length() == 0) {
            return 0;
        }

        int numberOfJewels = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }

        for(int i = 0; i < S.length(); i++) {
            if(set.contains(S.charAt(i))) {
                ++numberOfJewels;
            }
        }

        return numberOfJewels;
    }
}
