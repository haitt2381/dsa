package com.haitt.linkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(9);
        linkedList.insertAtBeginning(8);
        linkedList.insertAtBeginning(7);
        linkedList.insertAtEnd(3);
        System.out.println("Primary: " + linkedList.print());

        MyLinkedList cloneList = linkedList.cloneList();
        System.out.println("clone: " + cloneList.print());
    }
}
