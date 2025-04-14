package com.haitt.linkedlist;

public class NodeSearch {
    public ListNode solution(ListNode head, int data) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == data) {
                return temp;
            }
            
            temp = temp.next;
        }
        return null;
    }
}
