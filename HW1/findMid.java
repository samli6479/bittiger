public int findMid(ListNode head){
	// Corner case
	if(head == null || head.next == null){
		return head;
	}

	ListNode fast = head;
	ListNode slow = head;

	while(fast!= null && fast.next != null){
		fast = fast.fast.next;
		slow = slow.next;
	}

	return slow.val;




}