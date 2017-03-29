public ListNode deleteDuplicates(ListNode head) {

    // Corner case
    if(head == null || head.next == null){
        return head;
    }
    
    ListNode cur = head;
    
    while(cur.next != null){
        if(cur == null){
            break;
        }
        ListNode tmp = cur.next;
        if(tmp.val == cur.val){
            cur.next = tmp.next;
        }
        else{
        cur = cur.next;
        }
    }
    
    return head;