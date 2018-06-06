package com.algos.linkedlist;

public class SumLList {
    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        MyLinkedList l2 = new MyLinkedList();

        l1.addFirst(7);
        l1.addFirst(2);
        l1.addFirst(4);
        l1.addFirst(3);

        l2.addFirst(4);
        l2.addFirst(5);
        l2.addFirst(6);

        System.out.println(new SumLList().getSum(l1, l2));
    }

    public MyLinkedList getSum(MyLinkedList l1, MyLinkedList l2) {
        MyLinkedList result = new MyLinkedList();

        if(l1.size() != l2.size()) {
            addExtraNodes(l1,l2);
            addExtraNodes(l2,l1);
        }

        int[] carry = {0};
        getSumUtil(l1.head,l2.head,result,carry);

        if(carry[0] > 0) {
            result.addFirst(carry[0]);
        }

        return result;
    }

    private void getSumUtil(MyLinkedList.Node node1, MyLinkedList.Node node2, MyLinkedList result, int[] carry) {
        if(node1 == null && node2 == null) {
            return;
        }

        getSumUtil(node1.next, node2.next, result, carry);
        int sum = node1.val + node2.val + carry[0];
        carry[0] = sum / 10;
        result.addFirst(sum % 10);
    }

    private void addExtraNodes(MyLinkedList l1, MyLinkedList l2) {
        if(l1.size() > l2.size()) {
            int diff = l1.size() - l2.size();
            while(diff-- != 0) {
                l2.addFirst(0);
            }
        }
    }
}
