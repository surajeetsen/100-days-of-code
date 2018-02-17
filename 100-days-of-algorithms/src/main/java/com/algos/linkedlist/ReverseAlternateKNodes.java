package com.algos.linkedlist;

public class ReverseAlternateKNodes {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);
        list.addLast(11);
        list.addLast(12);

        System.out.println(list);
        reverseAlternateKNodes(list, 4);
        System.out.println(list);
    }

    public static void reverseAlternateKNodes(MyLinkedList list, int k) {
        if(k < 2) {
            return;
        }

        MyLinkedList.Node nextHead = list.head;

        //Move k nodes and set temp to k+1 node
        for(int i = 1; nextHead != null && i < k+1; i++) {
            nextHead = nextHead.next;
        }

        list.head = reverseNextKNodes(list.head, k);

        MyLinkedList.Node prevTail = list.head;
        while(prevTail.next != null) {
            prevTail = prevTail.next;
        }

        reverseAlternateKNodesUtil(prevTail, nextHead, k);
    }

    public static void reverseAlternateKNodesUtil(MyLinkedList.Node prevTail, MyLinkedList.Node nextHead, int k) {
        prevTail.next = nextHead;

        for(int i = 0; prevTail != null && i < k; i++) {
            prevTail = prevTail.next;
        }

        if(prevTail != null) {
            nextHead = prevTail.next;

            //Move k nodes and set temp to k+1 node
            for(int i = 1; nextHead != null && i < k+1; i++) {
                nextHead = nextHead.next;
            }

            MyLinkedList.Node head = prevTail.next;
            head = reverseNextKNodes(head, k);
            prevTail.next = head;

            while (prevTail.next != null) {
                prevTail = prevTail.next;
            }

            reverseAlternateKNodesUtil(prevTail, nextHead, k);
        }
    }

    public static MyLinkedList.Node reverseNextKNodes(MyLinkedList.Node node, int k) {
        MyLinkedList.Node prev = null;
        MyLinkedList.Node cur = null;
        MyLinkedList.Node next = node;

        while(next != null && k-- > 0) {
            cur = next;
            next = next.next;
            cur.next = prev;
            prev = cur;
        }

        return cur;
    }
}