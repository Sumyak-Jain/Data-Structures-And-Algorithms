class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev=null;
        while(head!=null){
            ListNode next_node=head.next;
            head.next=prev;
            prev=head;
            head=next_node;
        }
        return prev;
    }
}
