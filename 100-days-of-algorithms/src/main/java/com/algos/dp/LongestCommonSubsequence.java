package com.algos.dp;

public class LongestCommonSubsequence {
    public int getLongestCommonSequenceLength(String a, String b) {
        if(a == null || b == null) {
            return 0;
        }

        int[][] maxSubAtPos = new int[a.length()+1][b.length()+1];

        for(int i = 1; i <= a.length(); i++) {
            for(int j = 1; j <= b.length(); j++) {
                if(a.charAt(i-1) == b.charAt(j-1)) {
                    maxSubAtPos[i][j] = Math.max(maxSubAtPos[i-1][j-1]+1, Math.max(maxSubAtPos[i-1][j], maxSubAtPos[i][j-1]));
                } else {
                    maxSubAtPos[i][j] = Math.max(maxSubAtPos[i-1][j], maxSubAtPos[i][j-1]);
                }
            }
        }

        return maxSubAtPos[a.length()][b.length()];
    }

    public int getLCSLengthRecursion(String a, String b) {
        if(a == null || b == null) {
            return 0;
        }

        return getLCSLengthRecursionUtil(a,b, 0, 0);
    }

    private int getLCSLengthRecursionUtil(String a, String b, int len1, int len2) {
        if(a.length() == len1 || b.length() == len2) {
            return 0;
        }

        if(a.charAt(len1) == b.charAt(len2)) {
            return 1 + getLCSLengthRecursionUtil(a,b,len1+1, len2+1);
        } else {
            return Math.max(getLCSLengthRecursionUtil(a,b,len1+1, len2), getLCSLengthRecursionUtil(a,b,len1, len2+1));
        }
    }
}
