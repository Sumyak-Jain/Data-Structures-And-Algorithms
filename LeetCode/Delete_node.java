class Solution {
    public void deleteNode(ListNode node) {
        if (node.next.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        } else if (node.next.next == null) {
            node.val = node.next.val;
            node.next = null;  
        }
    }
}
