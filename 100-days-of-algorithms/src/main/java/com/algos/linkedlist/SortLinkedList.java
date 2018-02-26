package com.algos.linkedlist;

public class SortLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(5);
        list.addLast(11);
        list.addLast(12);
        list.addLast(4);
        list.addLast(2);
        list.addLast(13);

        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    public static void sort(MyLinkedList list) {
        list.head = sortUtil(list.head);
    }

    private static MyLinkedList.Node sortUtil(MyLinkedList.Node node) {
        if(node == null || node.next == null) {
            return node;
        }

        MyLinkedList.Node middle = getMiddle(node);
        MyLinkedList.Node nextOfMiddle = middle.next;
        middle.next = null;

        MyLinkedList.Node left = sortUtil(node);
        MyLinkedList.Node right = sortUtil(nextOfMiddle);

        MyLinkedList.Node sorted = merge(left, right);

        return sorted;
    }

    private static MyLinkedList.Node merge(MyLinkedList.Node left, MyLinkedList.Node right) {
        if(left == null) {
            return right;
        }

        if(right == null) {
            return left;
        }

        MyLinkedList.Node result = null;

        if(left.val <= right.val) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }

    private static MyLinkedList.Node getMiddle(MyLinkedList.Node node) {
        if(node == null) {
            return node;
        }

        MyLinkedList.Node slow = node;
        MyLinkedList.Node fast = node.next;

        while(fast != null) {
            fast = fast.next;
            if(fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }
}
