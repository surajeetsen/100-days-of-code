package com.algos.datastructure;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);

        System.out.println(stack.size());
        System.out.println(new StackTest().deQueue(stack));
        System.out.println(stack.size());
    }


    public int deQueue(Stack<Integer> stack) {
        if(stack.size() == 1) {
            return stack.pop();
        }

        int current = stack.pop();
        int result = deQueue(stack);
        stack.push(current);

        return result;
    }
}
