class Solution {
    List<Integer> list=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
           if (root != null) {
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
 
    }
        
        return list;
    } 
}
