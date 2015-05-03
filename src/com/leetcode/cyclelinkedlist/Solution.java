package com.leetcode.cyclelinkedlist;

/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

https://leetcode.com/problems/linked-list-cycle/
*/

public class Solution {

	public boolean hasCycle(ListNode head) {
	    if(head == null)
	        return false;
	
	    ListNode node_1 = head.next;
	    ListNode node_2 = Next2(head);
	
	    while(node_1 != null && node_2 != null) {
	        if(node_1 == node_2)
	            return true;
	        node_1 = node_1.next;
	        node_2 = Next2(node_2);
	    }
	    return false;
	}
	
	public ListNode Next2(ListNode node) {
	    if(node != null && node.next != null) {
	        return node.next.next;
	    }
	    return null;
	}
}
