/**
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
**/

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) 
            return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
