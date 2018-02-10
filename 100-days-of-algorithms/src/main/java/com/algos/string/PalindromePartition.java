package com.algos.string;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    public static void main(String[] args) {
        String str = "banana";
        List<String> results = new PalindromePartition().getAllPalindromePartition(str);
        results.forEach(System.out::println);
    }

    public List<String> getAllPalindromePartition(String input) {
        List<String> results = new ArrayList<>();
        String output = "";
        int begin = 0;
        int end = input.length();
        getAllPalindromePartitionUtil(input, output, begin, end, results);
        return results;
    }

    private void getAllPalindromePartitionUtil(String input, String output, int begin, int end, List<String> results) {
        if(begin == end) {
            results.add(output);
        }

        int n = input.length();
        String delimiter = "-";

        for(int i = begin; i < end; i++) {
            if(isPalindrome(input, begin, i)) {
                if(i + 1 == n) {
                    delimiter = "";
                }

                getAllPalindromePartitionUtil(input, output + input.substring(begin, i+1) + delimiter, i+1, end, results);
            }
        }
    }

    private boolean isPalindrome(String input, int begin, int end) {
        int mid = begin + (end - begin)/2;
        for(int i = begin; i <= mid; i++) {
            if(input.charAt(i) != input.charAt(begin + end - i)) {
                return false;
            }
        }
        return true;
    }

}