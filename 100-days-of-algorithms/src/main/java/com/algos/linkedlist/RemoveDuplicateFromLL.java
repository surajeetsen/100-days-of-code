package com.algos.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromLL {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(3);
        list.addLast(6);
        list.addLast(4);
        list.addLast(10);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.addLast(7);
        list.addLast(6);

        System.out.println(list);
        removeDuplicate(list);
        System.out.println(list);

    }

    public static void removeDuplicate(MyLinkedList list) {
        if(list == null || list.size() == 1) {
            return;
        }

        MyLinkedList.Node curr = list.head;
        Set<Integer> distinctElements = new HashSet<>();
        while (curr.next != null) {
            distinctElements.add(curr.val);
            if(distinctElements.contains(curr.next.val)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }
}
