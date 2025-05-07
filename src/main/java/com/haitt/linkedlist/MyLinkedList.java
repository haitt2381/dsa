package com.haitt.linkedlist;

public class MyLinkedList {
    ListNode head;

    public MyLinkedList() {
    }
    
    public MyLinkedList(int data) {
        head = new ListNode(data);
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        ListNode cur = head;
        while (cur != null) {
            sb.append(cur.val);
            sb.append(" -> ");
            cur = cur.next;
        }
        sb.append("null");
        return sb.toString();
    }

    public void insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data);

        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }
    
    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }
    
    public MyLinkedList cloneList() {
        MyLinkedList newLinkedList = new MyLinkedList();
        if (head == null) {
            return new MyLinkedList();
        }
        
        ListNode newHead = new ListNode(head.val);
        ListNode curNewHead = newHead;
        ListNode cur = head;
        while (cur.next != null) {
            curNewHead.next = new ListNode(cur.next.val);
            cur = cur.next;
            curNewHead = curNewHead.next;
            
        }
        newLinkedList.head = newHead;
        return newLinkedList;
    }
    
    public void insertAfter(ListNode target, int value) {
        if (target == null) {
            return;
        }
        
        ListNode newNode = new ListNode(value);
        newNode.next = target.next;
        target.next = newNode;
    }
}
