package com.algos.linkedlist;

public class OddEvenLinkedList {
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

        System.out.println(list);
        convertToOddEvenList(list);
        System.out.println(list);
    }

    public static void convertToOddEvenList(MyLinkedList list) {
        MyLinkedList.Node evenHead = null;
        MyLinkedList.Node oddcurrent = list.head;
        MyLinkedList.Node evencurrent = evenHead;

        while (oddcurrent != null && oddcurrent.next != null) {
            MyLinkedList.Node evenNext = oddcurrent.next;
            MyLinkedList.Node oddNext = evenNext.next;

            if(evenHead == null) {
                evenHead = evenNext;
                evencurrent = evenHead;
                evencurrent.next = null;
            } else {
                evencurrent.next = evenNext;
                evencurrent = evencurrent.next;
                evencurrent.next = null;
            }

            oddcurrent.next = oddNext;
            if(oddNext == null) {
                break;
            }
            oddcurrent = oddNext;
        }

        oddcurrent.next = evenHead;
    }
}
