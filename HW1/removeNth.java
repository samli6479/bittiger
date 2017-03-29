public ListNode removeNthFromEnd(ListNode head, int n) {
        // corner cases
        if (head == null || n == 0){
            return head;
        }
        
        
        // temp node
        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        
        // two pointers
        ListNode left = tmp;
        ListNode right = tmp;
        
        while(n > 0){
            right = right.next;
            n--;
        }
        
        while(right.next != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return tmp.next;
    }