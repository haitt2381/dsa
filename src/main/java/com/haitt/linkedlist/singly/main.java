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
        
        //PrintList exercise
        System.out.println(list.print());
        
        //Length of list exercise
        System.out.println("Size: " + list.size());
        
        //Find node method
        System.out.println("found: " + list.find(1));
    }
}
