public ListNode insertVal(ListNode head, int val){
	// Corner case
	if(head == null){
		return new ListNode(val);
	}

	// dummy node
	ListNode dummy = new ListNode(-1);
	dummy.next = head;

	// if insert in first node
	if(head.val > val){
		dummy.next = new ListNode(val);
		dummy.next.next = head;
		return dummy.next;
	}

	while(head.next != null){
		if(head.next.val < val){
			head= head.next;
		}

		else{
			ListNode tmp = head.next;
			head.next = new ListNode(val);
			head.next.next = tmp;
		}


	}

	return dummy.next;



}