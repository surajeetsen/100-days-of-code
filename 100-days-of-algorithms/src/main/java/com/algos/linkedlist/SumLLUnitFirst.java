package com.algos.linkedlist;

public class SumLLUnitFirst {

    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        list1.addFirst(9);
        list1.addFirst(9);
        list1.addFirst(9);
        list1.addFirst(9);
        list1.addFirst(9);

        System.out.println(list1);

        MyLinkedList list2 = new MyLinkedList();
        list2.addFirst(9);
        list2.addFirst(9);
        list2.addFirst(9);

        System.out.println(list2);

        SumLLUnitFirst llSum = new SumLLUnitFirst();
        System.out.println(llSum.sumUnitFirst(list1, list2));
    }

    public MyLinkedList sumUnitFirst(MyLinkedList l1, MyLinkedList l2) {
        MyLinkedList result = new MyLinkedList();

        MyLinkedList.Node node1 = l1.head;
        MyLinkedList.Node node2 = l2.head;

        sumUnitFirstUtil(node1, node2, 0, result);

        return result;
    }

    private void sumUnitFirstUtil(MyLinkedList.Node node1, MyLinkedList.Node node2, int carry, MyLinkedList result) {
        if(node1 == null && node1 == null) {
            if(carry > 0) {
                result.addLast(carry);
            }
            return;
        }

        int sum = carry;
        if(node1 != null) {
            sum += node1.val;
            node1 = node1.next;
        }

        if(node2 != null) {
            sum += node2.val;
            node2 = node2.next;
        }

        carry = sum / 10;
        sum = sum % 10;
        result.addLast(sum);

        sumUnitFirstUtil(node1, node2, carry, result);
    }

}
