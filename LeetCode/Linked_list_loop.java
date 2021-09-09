public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> sett=new HashSet<ListNode>();
        while(head!=null){
            if(sett.contains(head))
                return true;
            
            sett.add(head);
            head=head.next;
        }
        
        return false;
        
    }
}
