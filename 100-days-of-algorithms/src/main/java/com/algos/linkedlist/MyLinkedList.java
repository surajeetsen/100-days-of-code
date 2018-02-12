package com.algos.linkedlist;

import java.util.StringJoiner;

public class MyLinkedList {
    Node head;

    protected int size = 0;

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
            ++size;
        }
    }

    public int size() {
        return size;
    }

    public void addFirst(int val) {
        Node node = new Node(val);

        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            head = node;
            head.next = temp;
        }
    }

    public void addLast(int val) {
        Node node = new Node(val);

        if(head == null) {
            head = node;
        } else {
            Node current = head;

            while(current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    @Override
    public String toString() {
        StringJoiner str = new StringJoiner(" -> ");

        Node current = head;

        while (current != null) {
            str.add(String.valueOf(current.val));
            current = current.next;
        }
        str.add("null");
        return str.toString();
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addLast(6);

        System.out.println(list);

        System.out.println("List Size : " +list.size());
    }

}
