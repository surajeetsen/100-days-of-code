package com.algos.dp;

import java.util.ArrayList;
import java.util.List;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(2,6));
        items.add(new Item(2, 10));
        items.add(new Item(3, 12));

        System.out.println(solveKnapsackRecursive(items, 5));
    }

    public static int solveKnapsackRecursive(List<Item> items, int maxWeight) {
        return solveKnapsackRecursiveUtil(items, maxWeight, 0);
    }

    private static int solveKnapsackRecursiveUtil(List<Item> items, int weight, int index) {
        if(index == items.size() || weight == 0) {
            return 0;
        }

        if((weight - items.get(index).weight) < 0) {
            return solveKnapsackRecursiveUtil(items, weight, index+1);
        }

        return Math.max(solveKnapsackRecursiveUtil(items, (weight - items.get(index).weight), index + 1) + items.get(index).val,
                solveKnapsackRecursiveUtil(items, weight, index + 1));
    }

    static class Item {
        int weight;
        int val;

        public Item(int weight, int val) {
            this.weight = weight;
            this.val = val;
        }
    }
}
