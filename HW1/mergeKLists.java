public ListNode mergeKLists(ListNode[] lists) {
        return partition(lists,0,lists.length-1);
    }
    
    private ListNode partition(ListNode[] lists, int start, int end){
        // Base case
        if(start == end){
            return lists[start];
        }
        
        if(start < end){
            int mid = start + (end - start)/2;
            ListNode l1 = partition(lists, start, mid);
            ListNode l2 = partition(lists, mid+1, end);
            return merge(l1,l2);
        }
        else{
            return null;
        }
        
    }
    
    
    private ListNode merge(ListNode l1, ListNode l2){
        // Base case
        if(l1 == null || l2 == null){
            return l1 == null ? l2:l1;
        }
        
        if(l1.val < l2.val){
            l1.next = merge(l1.next,l2);
            return l1;
        }
        
        else{
            l2.next = merge(l2.next,l1);
            return l2;
        }
    }