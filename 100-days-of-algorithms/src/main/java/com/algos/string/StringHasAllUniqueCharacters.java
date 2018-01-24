package com.algos.string;

public class StringHasAllUniqueCharacters {

    public boolean areAllUniqueChars(String str) {
        if(str == null || str.length() <= 1) {
            return true;
        }

        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';

            if ((checker & (1 << val)) > 0) {
                return false;
            }

            checker |= (1 << val);
        }
        return true;
    }
}
