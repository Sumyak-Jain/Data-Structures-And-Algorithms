
 public ListNode reverseList(ListNode A, int B) {
        if(A == null)
          return null;
        ListNode current = A;
        ListNode next = null;
        ListNode prev = null;
 
        int count = 0;
 
        /* Reverse first k nodes of linked list */
        while (count < B && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
 
        /* next is now a pointer to (k+1)th node
           Recursively call for the list starting from
           current. And make rest of the list as next of
           first node */
        if (next != null)
            A.next = reverseList(next, B);
 
        // prev is now head of input list
        return prev;
     
