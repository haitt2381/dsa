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
        if (Objects.isNull(head)) {
            return "The list is empty";
        }
        
        Node curr = head;
        StringBuilder result = new StringBuilder();
        
        while (Objects.nonNull(curr)) {
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
        while (Objects.nonNull(curr)) {
            count++;
            curr = curr.next;
        }

        return count;
    }
    
    
}
