package com.haitt.linkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(9);
        linkedList.insertAtBeginning(8);
        linkedList.insertAtBeginning(7);
        linkedList.insertAtEnd(3);
        System.out.println("Primary: " + linkedList.print());
        
        linkedList.insertAfter(linkedList.head.next, 19);

        System.out.println("after insert: " + linkedList.print());
        
    }
}
