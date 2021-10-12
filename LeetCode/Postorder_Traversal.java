class Solution {
    List<Integer> list=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }
        
        return list;
    }
}
