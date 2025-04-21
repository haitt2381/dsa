package com.haitt.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class NodeSearchII {
    public List<ListNode> solution(ListNode head, int data) {
        List<ListNode> result = new ArrayList<>();
        
        ListNode current = head;
        while (current != null) {
            if (current.val == data) {
                result.add(current);
            }
            
            current = current.next;
        }
        
        return result;
    }
}
