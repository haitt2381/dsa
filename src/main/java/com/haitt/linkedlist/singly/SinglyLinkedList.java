package com.haitt.linkedlist.singly;

import com.haitt.linkedlist.Node;

import java.util.LinkedList;
import java.util.Objects;

public class SinglyLinkedList {
    Node head;


    /**
     * Returns a string representation of the linked list. If the list is empty,
     * returns a message indicating the list is empty
     *
     * @return A string representing the list, or <code>The list is empty</code> if the list is empty.
     */
    public String print() {
        if (head == null) {
            return "The list is empty";
        }
        
        Node curr = head;
        StringBuilder result = new StringBuilder();
        
        while (curr != null) {
            result.append(curr.data);
            result.append(" -> ");
            curr = curr.next;
        }
        
        result.append("null");
        return result.toString();
    }

    public int size() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

    public Node find(int data) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == data) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }
    
    public Node insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return newNode;
        }
        
        newNode.next = head;
        head = newNode;
        return newNode;
    }
    
    public Node insertAtEnd(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return newNode;
        }
        
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        
        curr.next = newNode;
        return newNode;
    }
    
    public SinglyLinkedList cloneList() {        
        SinglyLinkedList list = new SinglyLinkedList();
        if (head == null) {
            return list;
        }
        
        Node newHead = new Node(head.data);
        Node clone = newHead;
        Node curr = head.next;
        
        while (curr != null) {
            clone.next = new Node(curr.data);
            curr = curr.next;
            clone = clone.next;
        }
        
        list.head = newHead;
        return list;
    }
    
    public Node insertAfter(Node prev, int data) {
        if (prev == null) {
            throw new IllegalArgumentException("prev node cannot be null");
        }

        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
        
        return newNode;
    }
    
    public Node insertBefore(Node prev, int data) {
        if (prev == null) {
            return null;
        }
        
        Node newNode = new Node(data);

        if (prev == head) {
            newNode.next = head;
            head = newNode;
            return newNode;
        }
        
        Node curr = head;
        while (curr != null) {
            if (curr.next == prev) {
                newNode.next = curr.next;
                curr.next = newNode;
                return newNode;
            }

            curr = curr.next;
        }

        return null;
    }
    
    public Node insertAt(int index, int data) {
        if (index < 0 || index >= size()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        
        if (index == 0) {
            return insertAtBeginning(data);
        }
        
        Node newNode = new Node(data);
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return insertAfter(curr, data);
    }
}
