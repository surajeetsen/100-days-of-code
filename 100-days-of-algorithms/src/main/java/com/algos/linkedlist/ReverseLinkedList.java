package com.algos.linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println(list);
        reverseLinkedList(list);
        System.out.println(list);
        reverLLRecursive(list);
        System.out.println(list);
    }

    public static void reverseLinkedList(MyLinkedList list) {
        MyLinkedList.Node prev = null;
        MyLinkedList.Node cur = null;
        MyLinkedList.Node next = list.head;

        while(next != null) {
            cur = next;
            next = next.next;
            cur.next = prev;
            prev = cur;
        }
        list.head = cur;
    }

    public static void reverLLRecursive(MyLinkedList list) {
        reverLLRecursiveUtil(list.head, list);
    }

    private static void reverLLRecursiveUtil(MyLinkedList.Node node, MyLinkedList list) {
        if (node == null) {
            return;
        } else if (node.next == null) {
            list.head = node;
            return;
        }

        reverLLRecursiveUtil(node.next, list);
        node.next.next = node;
        node.next = null;
    }

}