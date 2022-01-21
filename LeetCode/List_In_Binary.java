class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null && head!=null)
            return false;
        if(root==null && head==null)
            return true;
        if(head.val==root.val){
            if(find(head,root))
                return true;
        }
        
        return isSubPath(head,root.left) || isSubPath(head,root.right);
        
    }
    
    boolean find(ListNode head, TreeNode root){
        if(head==null) return true;
        if(root==null && head!=null) return false;
        if(head.val != root.val) return false;
        return find(head.next,root.left) || find(head.next,root.right);
    }
}
