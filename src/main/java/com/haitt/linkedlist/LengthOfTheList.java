package com.haitt.linkedlist;

public class LengthOfTheList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        int solution = LengthOfTheList.solution(head);
        System.out.println(solution);
    }
    
    public static int solution(ListNode head) {
        
        if (head == null) {
            return 0;
        }
        
        int length = 0;
        
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        
        return length;
    }
}
