package com.algos.linkedlist;

import java.util.Stack;

public class LinkedListPalindrome {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);
        System.out.println(list);
        System.out.println(isLinkedListPalindrome(list));
    }

    public static boolean isLinkedListPalindrome(MyLinkedList list) {
        if(list.head == null || list.head.next == null) {
            return true;
        }

        MyLinkedList.Node slow = list.head;
        MyLinkedList.Node fast = list.head;
        Stack<Integer> stack = new Stack<>();
        while(fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null) {
            slow = slow.next;
        }

        while(slow != null) {
            if(slow.val != stack.pop()) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }
}
