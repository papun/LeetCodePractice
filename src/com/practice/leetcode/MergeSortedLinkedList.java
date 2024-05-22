package com.practice.leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class MergeSortedLinkedList {

	public static void main(String[] args) {
		
	}

	public ListNode merge(ListNode list1, ListNode list2) {
		
		if(list1!=null && list2!=null) {
			if(list1.val<list2.val) {
				list1.next = merge(list1.next, list2);
				return list1;
			}
			else {
				list2.next=merge(list2.next,list1);
				return list2;
			}
		}
		if(list1==null)
			return list2;
		return list1;
	}

}
