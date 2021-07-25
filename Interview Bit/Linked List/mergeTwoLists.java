 public ListNode mergeTwoLists(ListNode A, ListNode B) {
    ListNode newList = new ListNode(0);
        ListNode head = newList;
        while (A != null && B != null) {
            if (A.val <= B.val) {
                head.next = new ListNode(A.val);
                A = A.next;
            } else {
                head.next = new ListNode(B.val);
                B = B.next;
            }
            head = head.next;
        }
        if (A == null && B != null) {
            head.next = B;
        }
        if (B == null && A != null) {
            head.next = A;
        }
        return newList.next;
        
    }
