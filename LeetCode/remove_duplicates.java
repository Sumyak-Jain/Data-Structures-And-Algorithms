class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
     
        
        ListNode current = head;
        ListNode prev = null;
        while (current != null)
        {
            int curval = current.val;
             
            
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
           
        }
        
        return head;
    }
}
