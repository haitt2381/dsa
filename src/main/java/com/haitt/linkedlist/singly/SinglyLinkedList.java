package com.haitt.linkedlist.singly;

import com.haitt.linkedlist.Node;

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
        newNode.next = head;
        head = newNode;
        return newNode;
    }
}
