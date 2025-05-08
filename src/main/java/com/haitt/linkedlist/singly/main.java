package com.haitt.linkedlist.singly;

import com.haitt.linkedlist.Node;

public class main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        
        list.head = first;
        first.next = second;
        second.next = third;
        
        // PrintList exercise
//        System.out.println(list.print());
        
        // Length of list exercise
        System.out.println("Size: " + list.size());
        
        // Find node method
//        System.out.println("found: " + list.find(1));
        
        // Insert at begin exercise
//        list.insertAtBeginning(5);
        
        // Insert at the end exercise
//        list.insertAtEnd(10);
        
        // Clone list
//        SinglyLinkedList newList = list.cloneList();
//        System.out.println("clone list: " + newList.print());
        
        // insertAfter
//        list.insertAfter(second, 30);
        
        // insertBefore
//        list.insertBefore(second, 5);
        
        // Insert At
        list.insertAt(3, 5);
        System.out.println("primary: " + list.print());
    }
}
