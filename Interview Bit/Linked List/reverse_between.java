
 public ListNode reverseBetween(ListNode A, int B, int C) {
    int m=B;
    int n=C;
     ListNode prev = null;
        ListNode curr = A;
 
        // 1. Skip the first `m` nodes
        for (int i = 1; curr != null && i < m; i++)
        {
            prev = curr;
            curr = curr.next;
        }
 
        // prev now points to position the (m-1)'th node
        // `curr` now points to position the m'th node
 
        ListNode start = curr;
        ListNode end = null;
 
        // 2. Traverse and reverse the sublist from position `m` to `n`
        for (int i = 1; curr != null && i <= n - m + 1; i++)
        {
            // Take note of the next node
            ListNode next = curr.next;
 
            // move the current node onto the `end`
            curr.next = end;
            end = curr;
 
            // move to the next node
            curr = next;
        }
 
        /* `start` points to the m'th node
        `end` now points to the n'th node
        `curr` now points to the (n+1)'th node */
 
        // 3. Fix the pointers and return the head node
        start.next = curr;
        if (prev != null) {
            prev.next = end;
        }
        else {
            A = end;     // when `m = 1` (`prev` is null)
        }
 
        return A;
    
        
        
    }
